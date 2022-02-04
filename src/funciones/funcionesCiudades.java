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
import static vistas.Ciudades.comboDepartamento;
import static vistas.ModificarCiudades.comboDepartamentoUpdate;


public class funcionesCiudades {
 private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
/*/ public static boolean isRegister(sentencias s){
     try {
         String sql = sentencias.Registrar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getNombre());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }/*/
 public static boolean isUpdate(sentenciasCiudades s){
     
     try {  
         String sql = sentenciasCiudades.Actualizar;
         ps = conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_ciudad());
         ps.setInt(2,s.getFk_departamento());
         ps.setString(3,s.getId_ciudad());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasCiudades s){
     try {
         String sql = sentenciasCiudades.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_ciudad());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isTruncate(){
     try {
         String sql = sentenciasCiudades.Eliminar_todo;
         ps=conexionActual.prepareStatement(sql);
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
public static void setListar(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Ciudades.tablaCiudades.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasCiudades.Listar;
     }else{
         sql ="SELECT * FROM ciudades, departamentos WHERE " 
               +"ciudades.fk_departamento = departamentos.id_departamento AND "
                 +"n_ciudad LIKE '"+buscar+"%'";
     }
     System.out.println("dfghjk");
    
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         String datos[] = new String[3];
         while(rs.next()){
             datos[0]= rs.getString("id_ciudad");
             System.out.println(rs.getString("id_ciudad"));
             datos[1]= rs.getString("n_ciudad");
             datos[2]= rs.getString("departamentos.n_departamento");
             modelo.addRow(datos);    
         }
         vistas.Ciudades.tablaCiudades.setModel(modelo);
     } catch (SQLException ex) {
         System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
         public static String extraerIDMaxCIU(){
           String sql ="SELECT MAX(id_ciudad) FROM ciudades";
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
 public static void cargarComboDepartamento(){
        
        try {
          String sql = "select n_departamento from departamentos";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          comboDepartamento.addItem("Seleccione un departamento");
            while(rs.next()){
              comboDepartamento.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboDepartamentoUpdate(){
        
        try {
          String sql = "select n_departamento from departamentos";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
         comboDepartamentoUpdate.addItem("Seleccione un departamento");
            while(rs.next()){
              comboDepartamentoUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 

         
}
