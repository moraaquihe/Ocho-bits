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



public class funcionesFuncionarios {
 private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
 public static boolean isRegister(sentenciasFuncionarios s){
     try {
         String sql = sentenciasFuncionarios.Registrar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_funcionario());
         ps.setString(2,s.getRuc_ci());
         ps.setInt(3,s.getFk_ciudad());
         ps.setString(4,s.getCorreo());
         ps.setString(5,s.getTelefono());
         ps.setString(6,s.getDireccion());
         ps.setString(7, s.getCargo());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isUpdate(sentenciasFuncionarios s){
     
     try {  
         String sql = sentenciasFuncionarios.Actualizar;
         ps = conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_funcionario());
         ps.setString(2,s.getRuc_ci());
         ps.setInt(3,s.getFk_ciudad());
         ps.setString(4,s.getCorreo());
         ps.setString(5,s.getTelefono());
         ps.setString(6,s.getDireccion());
         ps.setString(7, s.getCargo());
         ps.setString(8,s.getId_funcionario());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasFuncionarios s){
     try {
         String sql = sentenciasFuncionarios.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_funcionario());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 /*public static boolean isTruncate(){
     try {
         String sql = sentenciasPaises.Eliminar_todo;
         ps=conexionActual.prepareStatement(sql);
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }*/
public static void setListar(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Funcionarios.tablaFuncionarios.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasFuncionarios.Listar;
     }else{
         sql ="SELECT * FROM funcionarios, ciudades WHERE "
                 +"funcionarios.n_funcionario LIKE'"+buscar+"%'"
               +"and funcionario.fk_ciudad = ciudades.id_ciudad";
     }
     
     String datos[] = new String[8];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_funcionario");
             datos[1]= rs.getString("n_funcionario");
             datos[2]= rs.getString("ruc_ci");
             datos[3]= rs.getString("ciudades.n_ciudad");
             datos[4]= rs.getString("correo");
             datos[5]= rs.getString("telefono");
             datos[6]= rs.getString("direccion");
             datos[7]= rs.getString("cargo");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
         public static String extraerIDMaxFUN(){
           String sql ="SELECT MAX(id_funcionario) FROM funcionarios";
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
 public static void cargarComboCiudad(){
        
        try {
          String sql = "select n_ciudad from ciudades";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarFuncionario.comboCiudad.addItem("Seleccione una ciudad");
            while(rs.next()){
              vistas.AgregarFuncionario.comboCiudad.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboCiudadUpdate(){
        
        try {
          String sql = "select n_ciudad from ciudades";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.ModificarFuncionario.comboCiudadUpdate.addItem("Seleccione una ciudad");
            while(rs.next()){
              vistas.ModificarFuncionario.comboCiudadUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 

         
}
