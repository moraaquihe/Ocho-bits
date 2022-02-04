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

/**
 *
 * @author SailorSakura
 */
public class funcionesUsuarios {
    private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
 public static boolean isRegister(sentenciasUsuarios s){
     try {
         String sql = sentenciasUsuarios.Registrar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_usuario());
         ps.setString(2,s.getPass());
         ps.setInt(3,s.getFk_funcionario());
         ps.setInt(4,s.getFk_tipo());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isUpdate(sentenciasUsuarios s){
     
     try {  
         String sql = sentenciasUsuarios.Actualizar;
         ps = conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_usuario());
         ps.setString(2,s.getPass());
         ps.setInt(3,s.getFk_funcionario());
         ps.setInt(4,s.getFk_tipo());
         ps.setString(5,s.getId_usuario());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasUsuarios s){
     try {
         String sql = sentenciasUsuarios.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_usuario());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }

public static void setListar(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Usuarios.tablaUsuarios.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasUsuarios.Listar;
     }else{
         sql ="SELECT * FROM usuarios, funcionarios, tipos_usuarios WHERE "
                 +"usuarios.n_usuario LIKE'"+buscar+"%'"
               +"and usuarios.fk_funcionario = funcionarios.id_funcionario "
               +"and usuarios.fk_tipo = tipos_usuarios.id_tipo";
     }
     
     String datos[] = new String[5];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_usuario");
             datos[1]= rs.getString("n_usuario");
             datos[2]= rs.getString("pass");
             datos[3]= rs.getString("funcionarios.n_funcionario");
             datos[4]= rs.getString("tipos_usuarios.nombre");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
         public static String extraerIDMaxUSU(){
           String sql ="SELECT MAX(id_usuario) FROM usuarios";
           int id = 0;
           
            try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               id= rs.getInt(1);
            }
            if(id==0){
                id=1;
            }else{
                id= id+1;
            }
            return String.valueOf(id);
            
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         
         return null;
       //  Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
             
     }
 public static void cargarComboFuncionario(){
        
        try {
          String sql = "select n_funcionario from funcionarios";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarUsuario.comboFuncionario.addItem("Seleccione un Funcionario");
            while(rs.next()){
              vistas.AgregarUsuario.comboFuncionario.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboFuncionarioUpdate(){
        
        try {
          String sql = "select n_funcionario from funcionarios";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.ModificarUsuario.comboFuncionarioUpdate.addItem("Seleccione un Funcionario");
            while(rs.next()){
              vistas.ModificarUsuario.comboFuncionarioUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboTIPO(){
        
        try {
          String sql = "select nombre from tipos_usuarios";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarUsuario.comboTipo.addItem("Seleccione");
            while(rs.next()){
              vistas.AgregarUsuario.comboTipo.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboTIPOUpdate(){
        
        try {
          String sql = "select nombre from tipos_usuarios";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.ModificarUsuario.comboTipoUpdate.addItem("Seleccione");
            while(rs.next()){
              vistas.ModificarUsuario.comboTipoUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  
 
  
  
  public static boolean verificaUsuario(String usuario) {
        boolean existe = false;
        String user = "";
        try {
            String sql = "SELECT * FROM usuarios WHERE n_usuario = '" + usuario + "'";
            Statement st = conexionActual.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString(2);
            }

            if (user.equals(usuario)) {
                existe = true;
            }

        } catch (SQLException ex) {
           // Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }
  public static void filtrarUsuario(){
      String sql = "SELECT * FROM usuarios, funcionarios WHERE "
              + "usuarios.fk_funcionario = funcionarios.id_funcionarios";
      String id="", nombre="";
      
      try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         vistas.AgregarUsuario.comboFuncionario.removeAllItems();
         vistas.AgregarUsuario.comboFuncionario.addItem("Seleccione");
         
          while (rs.next()) {              
              nombre = rs.getString("funcionarios.n_funcionario");
              id = rs.getString("funcionarios.id_funcionario");
               /* if () {
                  
              } else {
              }*/
          }
 
      } catch (Exception e) {
      }
      
  }
  
  public static String verificaContra(String contra) {
        String existecontra = "";
        String user = "";
        try {
            String sql = "SELECT * FROM usuarios WHERE pass = '" + contra + "'";
            Statement st = conexionActual.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString("pass");
            }

            if (user.equals(contra)) {
                existecontra = user;
            }

        } catch (SQLException ex) {
           // Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existecontra;
    }
   public static boolean verificaRepetido(String id) {
        boolean existe = false;
        String user = "";
        try {
            String sql = "SELECT * FROM usuarios WHERE fk_funcionario = '"+ id +"'";
            Statement st = conexionActual.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString("fk_funcionario");
            }
            if (user.equals(id)){
                new rojerusan.RSNotifyFade("ERROR", "El funcionario ya tiene un usuario.", 7, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                System.out.println("EXISTE" );
                existe = true;
            }

        } catch (SQLException ex) {System.out.println("error: " + ex.getMessage());
           // Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }
   
   
}
