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
import funciones.funcionesDepartamentos;
import static vistas.Departamentos.comboPais;
import static vistas.ModificarDepartamento.comboPaisUpdate;


public class funcionesDepartamentos {
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
 public static boolean isUpdate(sentenciasDepartamentos s){
     
     try {  
         String sql = sentenciasDepartamentos.Actualizar;
         ps = conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_departamento());
         ps.setInt(2,s.getFk_pais());
         ps.setString(3,s.getId_departamento());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasDepartamentos s){
     try {
         String sql = sentenciasDepartamentos.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_departamento());
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
     DefaultTableModel modelo = (DefaultTableModel)vistas.Departamentos.tablaDepartamento.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasDepartamentos.Listar;
     }else{
         sql ="SELECT * FROM departamentos, paises WHERE "
                 +"departamentos.n_departamento LIKE'"+buscar+"%'"
               +"and departamentos.fk_pais = paises.id_pais";
     }
     
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_departamento");
             datos[1]= rs.getString("n_departamento");
             datos[2]= rs.getString("paises.n_pais");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
         public static String extraerIDMaxDEPAR(){
           String sql ="SELECT MAX(id_departamento) FROM departamentos";
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
 public static void cargarComboPais(){
        
        try {
          String sql = "select n_pais from paises";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          comboPais.addItem("Seleccione un pais");
            while(rs.next()){
              comboPais.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboPaisUpdate(){
        
        try {
          String sql = "select n_pais from paises";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          comboPaisUpdate.addItem("Lista de Paises");
            while(rs.next()){
              comboPaisUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 

         
}
