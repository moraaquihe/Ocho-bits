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


public class funcionesPaises {
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
 public static boolean isUpdate(sentenciasPaises s){
     
     try {  
         String sql = sentenciasPaises.Actualizar;
         ps = conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_pais());
         ps.setString(2,s.getId_pais());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasPaises s){
     try {
         String sql = sentenciasPaises.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_pais());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isTruncate(){
     try {
         String sql = sentenciasPaises.Eliminar_todo;
         ps=conexionActual.prepareStatement(sql);
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
public static void setListar(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Paises.tablaPais.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasPaises.Listar;
     }else{
         sql ="SELECT * FROM paises WHERE ("
                 +"n_pais LIKE'"+buscar+"%' OR "
                 +"id_pais LIKE '"+buscar+"%'"
                 +")";
     }
     
     String datos[] = new String[2];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_pais");
             datos[1]= rs.getString("n_pais");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
         public static String extraerIDMaxPAIS(){
           String sql ="SELECT MAX(id_pais) FROM paises";
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
    
    
}
