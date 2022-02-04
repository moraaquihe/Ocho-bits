/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyAnimated;
import vistas.RegistrarCompra;

/**
 *
 * @author SailorSakura
 */
public class funcionesCompras {
     private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;

 
  public static void setListarListado(String IDOrden){
     DefaultTableModel modelo = (DefaultTableModel)vistas.RegistrarCompra.tablaCompra.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT detalle_ordenes.fk_inventario, inventarios.n_insumo, detalle_ordenes.cantidad AS cantidad, inventarios.precio "
                 + "FROM orden_compra, detalle_ordenes, inventarios "
                 + "WHERE orden_compra.id_orden = detalle_ordenes.fk_orden and "
                 + "detalle_ordenes.fk_inventario = inventarios.id_inventario and "
                 + "orden_compra.id_orden = '"+IDOrden+"'";
         
     String datos[] = new String[4];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             datos[2]= rs.getString(3);
             datos[3]= rs.getString(4);
             modelo.addRow(datos);
            
         } 
         vistas.RegistrarCompra.tablaCompra.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
  
  
  
  public static String extraerIDMaxCompra(){
           String sql ="SELECT MAX(id_compra) FROM compras";
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
    public static String extraerIDMaxDetCompra(){
           String sql ="SELECT MAX(id_dcompras) FROM detalles_compras";
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
    
     public static void guardarCompra(){
        int idCabecera = 0;
        
        try {
         String sql = "INSERT INTO compras VALUES (?,?,?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.RegistrarCompra.idCompra.getText()));
         ps.setString(2, vistas.RegistrarCompra.txtTimbrado.getText());
         ps.setString(3, vistas.RegistrarCompra.dateSeleccion.getText());
         ps.setDouble(4, Double.parseDouble(librerias.SeparadorMiles.quitarPuntos(vistas.RegistrarCompra.txtTotal.getText())));
         ps.setInt(5, login.funcionesLogin.idFuncionario);
            System.out.println(""+login.funcionesLogin.idFuncionario);
         ps.setInt(6, Integer.parseInt(RegistrarCompra.idOrden.getText()));
         int resultado = ps.executeUpdate();
         if (resultado>0){
             idCabecera = Integer.parseInt(vistas.RegistrarCompra.idCompra.getText());
             System.out.print(idCabecera);
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        try {
            Integer precio = 0, producto = 0;
            for (int i = 0; i < vistas.RegistrarCompra.tablaCompra.getRowCount(); i++) {
                funciones.funcionesOrdenCompra.setListarOrdenCompra();
                extraerIDMaxDetCompra();
                String sql2 = "INSERT INTO detalles_compras VALUES (?,?,?,?,?)";
                ps=conexionActual.prepareStatement(sql2);
                ps.setInt(1, Integer.parseInt(extraerIDMaxDetCompra()));
                
                precio = Integer.parseInt(vistas.RegistrarCompra.tablaCompra.getValueAt(i, 3).toString());
                producto = Integer.parseInt(vistas.RegistrarCompra.tablaCompra.getValueAt(i, 2).toString()) * precio;
                
                ps.setInt(2, Integer.parseInt(vistas.RegistrarCompra.tablaCompra.getValueAt(i, 2).toString()));
                ps.setInt(3, producto);
                ps.setInt(4, idCabecera);
                ps.setInt(5, Integer.parseInt(vistas.RegistrarCompra.tablaCompra.getValueAt(i, 0).toString()));
                ps.executeUpdate();
            }
            new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
        } catch (SQLException ex) {
            System.out.print("error"+ex.getMessage());
        }
        
    }
     
      public static void setListarCompras(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.ListadoCompras.tablaListadoC.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT id_compra, timbrado, total FROM compras WHERE fecha = '"+vistas.Principal.lblfecha.getFecha()+"'";
         
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             datos[2]= rs.getString(3);
             modelo.addRow(datos);
            
         } 
         vistas.ListadoCompras.tablaListadoC.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
      
      public static void mostrarDetallesCompra(String idCompra){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerDetalleCompra.tablaDetalleCompra.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT inventarios.n_insumo, detalles_compras.cantidad "
                 + "FROM compras, detalles_compras, inventarios "
                 + "WHERE compras.id_compra = detalles_compras.fk_compras and "
                 + "detalles_compras.fk_inventario = inventarios.id_inventario and "
                 + "compras.id_compra = '"+idCompra+"'";
         
     String datos[] = new String[2];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             modelo.addRow(datos);
               
         } 
         vistas.VerDetalleCompra.tablaDetalleCompra.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
      
      public static void setFiltrarCompras(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.ListadoCompras.tablaListadoC.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT id_compra, timbrado, total "
                 + "FROM compras "
                 + "WHERE fecha = '"+vistas.ListadoCompras.filtroFecha.getFechaSeleccionada()+"'";
        
        //  System.out.println("gg kp"+sql);
                
         
     String datos[] = new String[3];
    try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             datos[2]= rs.getString(3);
             modelo.addRow(datos);
            
         } 
         vistas.ListadoCompras.tablaListadoC.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
}
