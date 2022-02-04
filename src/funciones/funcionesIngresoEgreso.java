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
import vistas.Caja;

/**
 *
 * @author SailorSakura
 */
public class funcionesIngresoEgreso {
     private static   Conexion conexion = new Conexion();
     private static   Connection conexionActual = conexion.conectar();
     private static   PreparedStatement ps= null;
     
     public static String extraerIDMaxIngreso(){
           String sql ="SELECT MAX(id_ingreso) FROM ingresos";
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
     public static String extraerIDMaxEgreso(){
           String sql ="SELECT MAX(id_egreso) FROM egresos";
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
     
     public static void guardarIngreso(){
               
        try {
         String sql = "INSERT INTO ingresos VALUES (?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.RegistrarIngresos.idIng.getText()));
         ps.setInt(2,Integer.parseInt(vistas.RegistrarIngresos.txtNuevoIngreso.getText()));
         ps.setString(3, vistas.RegistrarIngresos.txtConcepto.getText());
         ps.setString(4, vistas.Caja.dateSeleccion.getText());
         int resultado = ps.executeUpdate();
         if (resultado>0){
            
             System.out.print("Ingreso guarda");
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }
     
     
     public static void guardarEgreso(){
               
        try {
         String sql = "INSERT INTO egresos VALUES (?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.RegistrarEgresos.idEgr.getText()));
         ps.setInt(2,Integer.parseInt(vistas.RegistrarEgresos.txtNuevoEgreso.getText()));
         ps.setString(3, vistas.RegistrarEgresos.txtNuevoEgresoConcepto.getText()); 
         ps.setString(4, vistas.Caja.dateSeleccion.getText());
         int resultado = ps.executeUpdate();
         if (resultado>0){
            
             System.out.print("guardo egreso");
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }
     
      public static void setListarIngresos(String fech){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Caja.tablaIngresosCaja.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     fech = Caja.FechaActual();
     String sql ="";
        
         sql ="SELECT * FROM ingresos  WHERE" 
                 + " fecha ='"+fech+"'";
        
        //  System.out.println("gg kp"+sql);
                
         
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             datos[0]= rs.getString("id_ingreso");
             datos[1]= rs.getString("total");
             datos[2]= rs.getString("concepto");
             
             modelo.addRow(datos);
         } 
         vistas.Caja.tablaIngresosCaja.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
     
     public static void setListarEgresos(String fecha){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Caja.tablaEgresosCaja.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     fecha = Caja.FechaActual();
     String sql ="";
        
         sql ="SELECT * FROM egresos  WHERE" 
                 + " fecha ='"+fecha+"'";
        
        //  System.out.println("gg kp"+sql);
                
         
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             datos[0]= rs.getString("id_egreso");
             datos[1]= rs.getString("total");
             datos[2]= rs.getString("concepto");
             
             modelo.addRow(datos);
         } 
         vistas.Caja.tablaEgresosCaja.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }    
     

}
