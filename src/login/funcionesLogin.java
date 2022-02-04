/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author SailorSakura
 */
public class funcionesLogin {
    private static Conexion conexion = new Conexion();
    private static Connection conexionActual = conexion.conectar();
    private static PreparedStatement ps;
    ResultSet rs;
   public static Integer idFuncionario = 0;
   
   public static String idUserPrincipal = "";
   public static String UserPrincipal = "";
   public static String PassPrincipal = "";
   public static int TipoPrincipal = 0;
   
         
    public static void verifica(String n_usuario, String pass, JFrame Login) {
        String user = "", pas = "", tipo_us = "", fk ="", idUser ="", passdese ="";
        try {
            String sql = "SELECT * FROM usuarios WHERE n_usuario = '" + n_usuario + "'";
            Statement st = conexionActual.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                idUser = rs.getString("id_usuario");
                user = rs.getString("n_usuario");
                pas = rs.getString("pass");
                tipo_us = rs.getString("fk_tipo");
                fk = rs.getString("fk_funcionario");
            }
            passdese = DigestUtils.md5Hex(pass);
            if (user.equals(n_usuario) && passdese.equals(pas)) {
                System.out.println("Pasa el if admin");
                if (tipo_us.equals("1")) {
                    Login.dispose();
                    new vistas.Principal().setVisible(true);
                    System.out.println("Pasa el llamado principal de dio");
                    idFuncionario = Integer.parseInt(fk);
                    idUserPrincipal = idUser;
                    UserPrincipal = user;
                    PassPrincipal = pas;
                    TipoPrincipal = Integer.parseInt(tipo_us.toString());
              
                }

                if (tipo_us.equals("2")) {
                    Login.dispose();
                    new vistas.Principal().setVisible(true);
                    vistas.Principal.botonMantenimiento.setVisible(false);
                    idFuncionario = Integer.parseInt(fk);
                    idUserPrincipal = idUser;
                    UserPrincipal = user;
                    PassPrincipal = pas;
                    TipoPrincipal = Integer.parseInt(tipo_us.toString());
                }
            } else {
                //Login.info.setText("¡ USUARIO O CONTRASEÑA INCORRECTOS !");
          //      Login.user.setText("");
          //      Login.pass.setText("");
                //Login.txtUsuario.requestFocus();
            }

        } catch (SQLException ex) { System.out.println("error del horror kp"+ex);
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
