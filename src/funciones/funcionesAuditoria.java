/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;
import static vistas.Principal.lblfecha;

/**
 *
 * @author SailorSakura
 */
public class funcionesAuditoria {
    private static   Conexion conexion = new Conexion();
    private static   Connection conexionActual = conexion.conectar();
    private static PreparedStatement ps= null;
    public static String hora ="";
 
 public static void auditoria (String fecha, String hora, String evento, String tabla, Integer idUsuario){
     try {
         String sql = "INSERT INTO auditorias(fecha, hora, evento, tabla, fk_usuario)"
                 + " VALUES ('"+fecha+"','"+hora+"','"+evento+"','"+tabla+"','"+idUsuario+"')";
         ps = conexionActual.prepareStatement(sql);
         int resultado = ps.executeUpdate();
         
         if (resultado >0) {
             new rojerusan.RSNotifyFade("Registrado en Auditoria", "", 3, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
         } else {
             new rojerusan.RSNotifyFade("ERROR", "En la Auditoria", 3, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
         }
     } catch (SQLException ex) { System.out.println("no funka kp"+ex.getMessage());
     }
      
 }
 
 
 public static void setListarAuditoria(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Auditorias.tablaAuditoria.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     
         sql ="SELECT * FROM auditorias, usuarios WHERE "
               +"auditorias.fk_usuario = usuarios.id_usuario";
     
     
     String datos[] = new String[5];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("fecha");
             datos[1]= rs.getString("hora");
             datos[2]= rs.getString("evento");
             datos[3]= rs.getString("tabla");
             datos[4]= rs.getString("usuarios.n_usuario");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
}
 
 
 public static void filtrarAuditoriaFecha(String Fechaant){
         DefaultTableModel modelo = (DefaultTableModel)vistas.Auditorias.tablaAuditoria.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     System.out.print("FECHAANT "+Fechaant);
     String sql ="";
         sql = "SELECT usuarios.n_usuario, auditorias.hora, auditorias.evento, auditorias.tabla, STR_TO_DATE(auditorias.fecha,'%d/%m/%Y'), auditorias.fecha " 
                 + "FROM auditorias, usuarios "
                 + "WHERE STR_TO_DATE(auditorias.fecha, '%d/%m/%Y') "
                 + "BETWEEN STR_TO_DATE('"+Fechaant+"', '%d/%m/%Y') "
                 + "AND STR_TO_DATE('"+lblfecha.getFecha()+"', '%d/%m/%Y') " 
                 + "AND auditorias.fk_usuario = usuarios.id_usuario " 
                 + "ORDER BY auditorias.fecha DESC";
     String datos[] = new String[5];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString(6);
             datos[1]= rs.getString("auditorias.hora");
             datos[2]= rs.getString("auditorias.evento");
             datos[3]= rs.getString("auditorias.tabla");
             datos[4]= rs.getString("usuarios.n_usuario");
             modelo.addRow(datos);     
         }
         vistas.Auditorias.tablaAuditoria.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}
 
 }
