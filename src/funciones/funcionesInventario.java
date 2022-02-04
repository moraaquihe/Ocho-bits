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
import vistas.AgregarInventario;

/**
 *
 * @author SailorSakura
 */
public class funcionesInventario {
 private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
 
 
 public static boolean isRegister(sentenciasInventario s){
     try {
         String sql = sentenciasInventario.Registrar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_inventario());
         ps.setString(2,s.getN_insumo());
         ps.setInt(3,s.getCantidad());
         ps.setString(4,s.getDescripcion());
         ps.setInt(5,s.getFk_iva());
         ps.setInt(6,s.getPrecio());
         ps.executeUpdate();
         guardarProveeInven(Integer.parseInt(s.getId_inventario()));
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
public static void guardarProveeInven(Integer id){
     try {
         String sql = "INSERT INTO provee_inven(fk_proveedor, fk_inventario) VALUES (?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,AgregarInventario.comboProveedor.getSelectedIndex());
         ps.setInt(2,id);
         ps.executeUpdate();
         
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }

}
 public static boolean isUpdate(sentenciasInventario s){
     
     try {  
         String sql = sentenciasInventario.Actualizar;
         ps = conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_insumo());
         ps.setInt(2,s.getCantidad());
         ps.setString(3,s.getDescripcion());
         ps.setInt(4,s.getFk_iva());
         ps.setInt(5,s.getPrecio());
         ps.setString(6,s.getId_inventario());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasInventario s){
     try {
         String sql = sentenciasInventario.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_inventario());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 
public static void setListar(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Inventario.tablaInventario.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasInventario.Listar;
     }else{
         sql ="SELECT * FROM inventarios, impuestos WHERE "
                 +"inventarios.n_insumo LIKE'"+buscar+"%'"
               +"and inventarios.fk_iva = impuestos.id_iva";
     }
     
     String datos[] = new String[6];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_inventario");
             datos[1]= rs.getString("n_insumo");
             datos[2]= rs.getString("cantidad");
             datos[3]= rs.getString("descripcion");
             datos[4]= rs.getString("impuestos.tipo");
             datos[5]= rs.getString("precio");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
         public static String extraerIDMaxPROD(){
           String sql ="SELECT MAX(id_inventario) FROM inventarios";
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
          vistas.AgregarInventario.comboImpuesto.addItem("Seleccione");
            while(rs.next()){
              vistas.AgregarInventario.comboImpuesto.addItem(rs.getString(1));
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
          vistas.ModificarInventario.comboImpuestoUpdate.addItem("Seleccione");
            while(rs.next()){
              vistas.ModificarInventario.comboImpuestoUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        
    } 
  public static void cargarComboProveedor(){
        
        try {
          String sql = "select n_proveedor from proveedores";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarInventario.comboProveedor.addItem("Seleccione");
            while(rs.next()){
              vistas.AgregarInventario.comboProveedor.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboProveedorUpdate(){
        
        try {
          String sql = "select n_proveedor from proveedores";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.ModificarInventario.comboProveedorUpdate.addItem("Seleccione");
            while(rs.next()){
              vistas.ModificarInventario.comboProveedorUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
}
