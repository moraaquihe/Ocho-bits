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
import funciones.funcionesClientes;
//import static vistas.Departamentos.comboPais;
import static vistas.ModificarCliente.comboCiudadUpdate; // debe ser modificar cliente con el combo ciudad


public class funcionesClientes {
 private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
 public static boolean isRegister(sentenciasClientes s){
     try {
         String sql = sentenciasClientes.Registrar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_cliente());
         ps.setString(2,s.getRuc_ci());
         ps.setInt(3,s.getFk_ciudad());
         ps.setString(4,s.getCorreo());
         ps.setString(5,s.getTelefono());
         ps.setString(6,s.getDireccion());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isUpdate(sentenciasClientes s){
     
     try {  
         String sql = sentenciasClientes.Actualizar;
         ps = conexionActual.prepareStatement(sql);
         ps.setString(1,s.getN_cliente());
         ps.setString(2,s.getRuc_ci());
         ps.setInt(3,s.getFk_ciudad());
         ps.setString(4,s.getCorreo());
         ps.setString(5,s.getTelefono());
         ps.setString(6,s.getDireccion());
         ps.setString(7,s.getId_cliente());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasClientes s){
     try {
         String sql = sentenciasClientes.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_cliente());
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
     DefaultTableModel modelo = (DefaultTableModel)vistas.Clientes.tablaClientes.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasClientes.Listar;
     }else{
         sql ="SELECT * FROM clientes, ciudades WHERE "
                 +"clientes.n_cliente LIKE'"+buscar+"%'"
               +"and clientes.fk_ciudad = ciudades.id_ciudad";
     }
     
     String datos[] = new String[7];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_cliente");
             datos[1]= rs.getString("n_cliente");
             datos[2]= rs.getString("ruc_ci");
             datos[3]= rs.getString("ciudades.n_ciudad");
             datos[4]= rs.getString("correo");
             datos[5]= rs.getString("telefono");
             datos[6]= rs.getString("direccion");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
         public static String extraerIDMaxCLIE(){
           String sql ="SELECT MAX(id_cliente) FROM clientes";
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
          vistas.AgregarCliente.comboCiudad.addItem("Seleccione una ciudad");
            while(rs.next()){
              vistas.AgregarCliente.comboCiudad.addItem(rs.getString(1));
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
          vistas.ModificarCliente.comboCiudadUpdate.addItem("Seleccione una ciudad");
            while(rs.next()){
              vistas.ModificarCliente.comboCiudadUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
public static void OrdenSerClientes(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerClientesOrdenSer.tablaClientes.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasClientes.Listar;
     }else{
         sql ="SELECT * FROM clientes, ciudades WHERE "
                 +"clientes.n_cliente LIKE'"+buscar+"%'"
               +"and clientes.fk_ciudad = ciudades.id_ciudad";
     }
     
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_cliente");
             datos[1]= rs.getString("n_cliente");
             datos[2]= rs.getString("ruc_ci");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }

 public static void cargarComboCiudadOrdenSer(){
        
        try {
          String sql = "select n_ciudad from ciudades";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarClienteOrderSer.comboCiudad.addItem("Seleccione una ciudad");
            while(rs.next()){
              vistas.AgregarClienteOrderSer.comboCiudad.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }

public static void ventasInvenClientes(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerClientesVentasInven.tablaClientes.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasClientes.Listar;
     }else{
         sql ="SELECT * FROM clientes, ciudades WHERE "
                 +"clientes.n_cliente LIKE'"+buscar+"%'"
               +"and clientes.fk_ciudad = ciudades.id_ciudad";
     }
     
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_cliente");
             datos[1]= rs.getString("n_cliente");
             datos[2]= rs.getString("ruc_ci");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
 public static void cargarComboCiudadVentasInven(){
        
        try {
          String sql = "select n_ciudad from ciudades";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarClienteVentaInven.comboCiudad.addItem("Seleccione una ciudad");
            while(rs.next()){
              vistas.AgregarClienteVentaInven.comboCiudad.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
      public static void VentasSerClientes(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerClientesVentasSer.tablaClientes.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasClientes.Listar;
     }else{
         sql ="SELECT * FROM clientes, ciudades WHERE "
                 +"clientes.n_cliente LIKE'"+buscar+"%'"
               +"and clientes.fk_ciudad = ciudades.id_ciudad";
     }
     
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_cliente");
             datos[1]= rs.getString("n_cliente");
             datos[2]= rs.getString("ruc_ci");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }   
       public static void cargarComboCiudadVentasSer(){
        
        try {
          String sql = "select n_ciudad from ciudades";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarClienteVentaSer.comboCiudad.addItem("Seleccione una ciudad");
            while(rs.next()){
              vistas.AgregarClienteVentaSer.comboCiudad.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
