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
import rojerusan.RSNotifyAnimated;
import static vistas.RegistrarOrdenCompra.idDetalle;

/**
 *
 * @author SailorSakura
 */
public class funcionesOrdenCompra { 
 private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
    
    public static void cargarComboProveedor(){
        
        try {
          String sql = "select n_proveedor from proveedores";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.RegistrarOrdenCompra.comboProveedor.addItem("Seleccione");
            while(rs.next()){
              vistas.RegistrarOrdenCompra.comboProveedor.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
    public static void guardarIdProveedor(){
        
        try {
          String sql = "select * from proveedores";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
         
            while(rs.next()){
              if(vistas.RegistrarOrdenCompra.comboProveedor.getSelectedIndex()==rs.getInt("id_proveedor")){
                  vistas.RegistrarOrdenCompra.idProveedor.setText(rs.getString("id_proveedor"));
              }
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
    
    public static void setListarListado(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.ListaInventario.tablaListado.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT * FROM inventarios, proveedores, provee_inven WHERE "
               +"provee_inven.fk_proveedor = proveedores.id_proveedor and "
               +"provee_inven.fk_inventario = inventarios.id_inventario";
         
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             if (vistas.RegistrarOrdenCompra.idProveedor.getText().equals(rs.getString("provee_inven.fk_proveedor"))){
             datos[0]= rs.getString("provee_inven.fk_inventario");
             datos[1]= rs.getString("inventarios.n_insumo");
             datos[2]= rs.getString("inventarios.cantidad");
             modelo.addRow(datos);
             }    
         } 
         vistas.ListaInventario.tablaListado.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static void setListarOrdenCompra(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.ListadoOrdenCompra.tablaListadoOC.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT * FROM orden_compra, proveedores WHERE orden_compra.fk_proveedor = proveedores.id_proveedor and "
         + "orden_compra.estado LIKE '%PENDIENTE%'";
         
     String datos[] = new String[4];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("orden_compra.id_orden");
             datos[1]= rs.getString("orden_compra.fecha");
             datos[2]= rs.getString("proveedores.n_proveedor");
             datos[3]= rs.getString("orden_compra.descripcion");
             modelo.addRow(datos);
               
         } 
         vistas.ListadoOrdenCompra.tablaListadoOC.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static void guardarOrdenCompra(){
        int idCabecera = 0;
        try {
         String sql = "INSERT INTO orden_compra(id_orden,fecha, descripcion, fk_proveedor, fk_funcionario, estado) VALUES (?,?,?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.RegistrarOrdenCompra.idOrden.getText()));
         ps.setString(2, vistas.RegistrarOrdenCompra.dateSeleccion.getText());
         ps.setString(3, vistas.RegistrarOrdenCompra.txtDescripcion.getText());
         ps.setInt(4, Integer.parseInt(vistas.RegistrarOrdenCompra.idProveedor.getText()));
         ps.setInt(5, login.funcionesLogin.idFuncionario); 
         ps.setString(6, "PENDIENTE");
         int resultado = ps.executeUpdate();
         if (resultado>0){
             idCabecera = Integer.parseInt(vistas.RegistrarOrdenCompra.idOrden.getText());
             System.out.print(idCabecera);
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        try {
            for (int i = 0; i < vistas.RegistrarOrdenCompra.tablaOrden.getRowCount(); i++) {
                idDetalle.setText(funciones.funcionesOrdenCompra.extraerIDMaxDetOrden());
                String sql2 = "INSERT INTO detalle_ordenes(id_dorden, cantidad, fk_orden, fk_inventario) VALUES (?,?,?,?)";
                ps=conexionActual.prepareStatement(sql2);
                ps.setInt(1, Integer.parseInt(idDetalle.getText()));
                ps.setInt(2, Integer.parseInt(vistas.RegistrarOrdenCompra.tablaOrden.getValueAt(i, 2).toString()));
                ps.setInt(3, idCabecera);
                ps.setInt(4, Integer.parseInt(vistas.RegistrarOrdenCompra.tablaOrden.getValueAt(i, 0).toString()));
                ps.executeUpdate();
            }
            setListarOrdenCompra();
            new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
        } catch (SQLException ex) {
            System.out.print("error"+ex.getMessage());
        }
        
    }
    public static String extraerIDMaxOrden(){
           String sql ="SELECT MAX(id_orden) FROM orden_compra";
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
    public static String extraerIDMaxDetOrden(){
           String sql ="SELECT MAX(id_dorden) FROM detalle_ordenes";
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
    
    public static void mostrarDetallesOrden(String idOrden){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerDetalleOrden.tablaDetalleOrden.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT inventarios.n_insumo, detalle_ordenes.cantidad "
                 + "FROM orden_compra, detalle_ordenes, inventarios "
                 + "WHERE orden_compra.id_orden = detalle_ordenes.fk_orden and "
                 + "detalle_ordenes.fk_inventario = inventarios.id_inventario and "
                 + "orden_compra.id_orden = '"+idOrden+"'";
         
     String datos[] = new String[2];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             modelo.addRow(datos);
               
         } 
         vistas.VerDetalleOrden.tablaDetalleOrden.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static boolean isDelete(sentenciasOrdenCompra s){
     try {
         String sql = sentenciasOrdenCompra.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_orden());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
    
    public static void FinalizarOrden(String id){      
        try {
         String sql = "UPDATE orden_compra SET estado = 'FINALIZADO' WHERE id_orden = '"+id+"'";
         ps=conexionActual.prepareStatement(sql);
         
         int resultado = ps.executeUpdate();
         if (resultado>0){
             new rojerusan.RSNotifyAnimated("EXITO", "Se ha terminado el servicio", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
}
