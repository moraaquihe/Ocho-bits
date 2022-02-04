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

/**
 *
 * @author SailorSakura
 */
public class funcionesTiposServicios {
 private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
 
 
 public static boolean isRegister(sentenciasTiposServicios s){
     try {
         String sql = sentenciasTiposServicios.Registrar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getNombre());
         ps.setInt(2,s.getPrecio_mano());
         ps.setInt(3,s.getFk_iva());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isUpdate(sentenciasTiposServicios s){
     
     try {  
         String sql = sentenciasTiposServicios.Actualizar;
         ps = conexionActual.prepareStatement(sql);
         ps.setString(1,s.getNombre());
         ps.setInt(2,s.getPrecio_mano());
         ps.setInt(3,s.getFk_iva());
         ps.setString(4,s.getId_tservicio());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasTiposServicios s){
     try {
         String sql = sentenciasTiposServicios.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_tservicio());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 
public static void setListar(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.TiposServicios.tablaServicio.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasTiposServicios.Listar;
     }else{
         sql ="SELECT * FROM tipos_servicios, impuestos WHERE "
                 +"tipos_servicios.nombre LIKE'"+buscar+"%'"
               +"and tipos_servicios.fk_iva = impuestos.id_iva";
     }
     
     String datos[] = new String[4];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_tservicio");
             datos[1]= rs.getString("nombre");
             datos[2]= rs.getString("precio_mano");
             datos[3]= rs.getString("impuestos.tipo");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
         public static String extraerIDMaxTIPO(){
           String sql ="SELECT MAX(id_tservicio) FROM tipos_servicios";
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
 public static void cargarComboImpuesto(){
        
        try {
          String sql = "select tipo from impuestos";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarTiposServicios.comboImpuesto.addItem("Seleccione");
            while(rs.next()){
              vistas.AgregarTiposServicios.comboImpuesto.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboImpuestoUpdate(){
        
        try {
          String sql = "select tipo from impuestos";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.ModificarTiposServicios.comboImpuestoUpdate.addItem("Seleccione");
            while(rs.next()){
              vistas.ModificarTiposServicios.comboImpuestoUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
}
