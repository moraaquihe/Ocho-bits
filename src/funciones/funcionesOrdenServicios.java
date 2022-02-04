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
import vistas.RegistrarOrdenServicios;

/**
 *
 * @author SailorSakura
 */
public class funcionesOrdenServicios {
    private static   Conexion conexion = new Conexion();
    private static   Connection conexionActual = conexion.conectar();
    private static PreparedStatement ps= null;
    
    public static void setListarClientes(String buscar){
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
         vistas.VerClientesOrdenSer.tablaClientes.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static void setListarTiposServicios(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerOrdenServicios.tablaServicio.getModel();
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
         vistas.VerOrdenServicios.tablaServicio.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
   public static void setListarProductos(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerOrdenProductos.tablaListado.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT * FROM inventarios, proveedores, provee_inven WHERE "
               +"provee_inven.fk_proveedor = proveedores.id_proveedor and "
               +"provee_inven.fk_inventario = inventarios.id_inventario";
         
     String datos[] = new String[4];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_inventario");
             datos[1]= rs.getString("inventarios.n_insumo");
             datos[2]= rs.getString("inventarios.cantidad");
             datos[3]= rs.getString("inventarios.precio");
             modelo.addRow(datos);
              
         } 
         vistas.VerOrdenProductos.tablaListado.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
   
   public static void cargarComboFuncionario(){
        
        try {
          String sql = "select n_funcionario from funcionarios";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.RegistrarOrdenServicios.comboTecnico.addItem("Seleccione");
            while(rs.next()){
              vistas.RegistrarOrdenServicios.comboTecnico.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
   
    public static String extraerIDMaxOrdenSer(){
           String sql ="SELECT MAX(id_servicio) FROM orden_servicios";
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
   public static String extraerIDMaxDetSer(){
           String sql ="SELECT MAX(id_dtipos) FROM detalles_servicios_tipos";
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
   public static String extraerIDMaxDetProd(){
           String sql ="SELECT MAX(id_dservicio) FROM detalles_servicios_inven";
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
   
    public static void guardarOrdenServicio(){
        int idCabecera = 0;
        
        try {
         String sql = "INSERT INTO orden_servicios VALUES (?,?,?,?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.RegistrarOrdenServicios.idOrdenSer.getText()));
         ps.setString(2, vistas.RegistrarOrdenServicios.IdCliente.getText());
         ps.setInt(3,vistas.RegistrarOrdenServicios.comboTecnico.getSelectedIndex());
         ps.setString(4, vistas.RegistrarOrdenServicios.dateSeleccion.getText());
         ps.setString(5, vistas.RegistrarOrdenServicios.txtDescripcion.getText());
         ps.setString(6, vistas.RegistrarOrdenServicios.txtTotal.getText());
         ps.setString(7, "PENDIENTE");
            System.out.println(""+login.funcionesLogin.idFuncionario);
         int resultado = ps.executeUpdate();
         if (resultado>0){
             idCabecera = Integer.parseInt(vistas.RegistrarOrdenServicios.idOrdenSer.getText());
             System.out.print(idCabecera);
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        try {
            
            for (int i = 0; i < vistas.RegistrarOrdenServicios.tablaOrdenServicios.getRowCount(); i++) {
                vistas.RegistrarOrdenServicios.idSer.setText(extraerIDMaxDetSer());
                String sql2 = "INSERT INTO detalles_servicios_tipos VALUES (?,?,?)";
                ps=conexionActual.prepareStatement(sql2);
                ps.setInt(1, Integer.parseInt(vistas.RegistrarOrdenServicios.idSer.getText()));
                ps.setInt(2, Integer.parseInt(vistas.RegistrarOrdenServicios.tablaOrdenServicios.getValueAt(i, 0).toString()));
                ps.setInt(3, idCabecera);
                ps.executeUpdate();
            }
           // new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
        } catch (SQLException ex) {
            System.out.print("error"+ex.getMessage());
        }
         try {
           
            for (int i = 0; i < vistas.RegistrarOrdenServicios.tablaOrdenProductos.getRowCount(); i++) {
                vistas.RegistrarOrdenServicios.idPro.setText(extraerIDMaxDetProd());
                String sql2 = "INSERT INTO detalles_servicios_inven VALUES (?,?,?,?,?)";
                ps=conexionActual.prepareStatement(sql2);
                ps.setInt(1, Integer.parseInt(vistas.RegistrarOrdenServicios.idPro.getText()));
                ps.setInt(2, idCabecera);
                ps.setInt(3, Integer.parseInt(vistas.RegistrarOrdenServicios.tablaOrdenProductos.getValueAt(i, 0).toString()));
                ps.setInt(4,Integer.parseInt(vistas.RegistrarOrdenServicios.tablaOrdenProductos.getValueAt(i, 2).toString()));
                ps.setInt(5, Integer.parseInt(vistas.RegistrarOrdenServicios.tablaOrdenProductos.getValueAt(i, 3).toString()));
                ps.executeUpdate();
            }
            new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
        } catch (SQLException ex) {
            System.out.print("error"+ex.getMessage());
        }
    }
   
   public static void setListarOrdenServicios(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.ListadoOrdenServicios.tablaListadoSer.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     
         sql= "SELECT orden_servicios.id_servicio, clientes.n_cliente, funcionarios.n_funcionario, "
                 + "orden_servicios.fecha_recepcion, orden_servicios.descripcion, orden_servicios.precio_final, orden_servicios.estado " 
                 + "FROM orden_servicios, clientes, funcionarios " 
                 + "WHERE orden_servicios.fk_cliente = clientes.id_cliente " 
                 + "and orden_servicios.fk_funcionario = funcionarios.id_funcionario";
     
     
     
     String datos[] = new String[7];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             datos[2]= rs.getString(3);
             datos[3]= rs.getString(4);
             datos[4]= rs.getString(5);
             datos[5]= rs.getString(6);
             datos[6]= rs.getString(7);
             modelo.addRow(datos);    
         }
         vistas.ListadoOrdenServicios.tablaListadoSer.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
   
   public static void FinalizarOrden(String id){      
        try {
         String sql = "UPDATE orden_servicios SET estado = 'FINALIZADO' WHERE id_servicio = '"+id+"'";
         ps=conexionActual.prepareStatement(sql);
         
         int resultado = ps.executeUpdate();
         if (resultado>0){
             new rojerusan.RSNotifyAnimated("EXITO", "Se ha terminado el servicio", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
   public static void setListarDetOrdenServicios(String id){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerDetOrdServicios.tablaOrdenServicios.getModel();
     DefaultTableModel modelo1 = (DefaultTableModel)vistas.VerDetOrdServicios.tablaOrdenProductosDetalle.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="", sql1="";
     
         sql= "SELECT tipos_servicios.id_tservicio, tipos_servicios.nombre, tipos_servicios.precio_mano "
                 + "FROM tipos_servicios, detalles_servicios_tipos, orden_servicios "
                 + "WHERE detalles_servicios_tipos.fk_servicios = orden_servicios.id_servicio "
                 + "and detalles_servicios_tipos.fk_tservicios = tipos_servicios.id_tservicio "
                 + "and detalles_servicios_tipos.fk_servicios = '"+id+"'";
         sql1="SELECT inventarios.id_inventario, inventarios.n_insumo, detalles_servicios_inven.precio, detalles_servicios_inven.cantidad, impuestos.tipo "
                 + "FROM inventarios, detalles_servicios_inven, orden_servicios, impuestos "
                 + "WHERE detalles_servicios_inven.fk_servicio = orden_servicios.id_servicio "
                 + "and detalles_servicios_inven.fk_inventario = inventarios.id_inventario "
                 + "and inventarios.fk_iva = impuestos.id_iva "
                 + "and detalles_servicios_inven.fk_servicio = '"+id+"'";
     String datos[] = new String[3];
     String datos1[] = new String[5];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             datos[2]= rs.getString(3);
             modelo.addRow(datos);    
         }
         vistas.VerDetOrdServicios.tablaOrdenServicios.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
    try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql1);
         while(rs.next()){
             datos1[0]= rs.getString(1);
             datos1[1]= rs.getString(2);
             datos1[2]= rs.getString(3);
             datos1[3]= rs.getString(4);
             datos1[4]= rs.getString(5);
             modelo1.addRow(datos1);    
         }
         vistas.VerDetOrdServicios.tablaOrdenProductosDetalle.setModel(modelo1);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }       
    }
   
   public static void filtrarOrdenServiciosPendiente(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.ListadoOrdenServicios.tablaListadoSer.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     
         sql= "SELECT orden_servicios.id_servicio, clientes.n_cliente, funcionarios.n_funcionario, orden_servicios.fecha_recepcion, orden_servicios.descripcion, orden_servicios.precio_final, orden_servicios.estado "
                 + "FROM orden_servicios, clientes, funcionarios " 
                 + "WHERE orden_servicios.fk_cliente = clientes.id_cliente "
                 + "and orden_servicios.fk_funcionario = funcionarios.id_funcionario and "
                 + "orden_servicios.estado LIKE '%PENDIENTE%'";
     
     
     
     String datos[] = new String[7];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             datos[2]= rs.getString(3);
             datos[3]= rs.getString(4);
             datos[4]= rs.getString(5);
             datos[5]= rs.getString(6);
             datos[6]= rs.getString(7);
             modelo.addRow(datos);    
         }
         vistas.ListadoOrdenServicios.tablaListadoSer.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
   
   public static void filtrarOrdenServiciosFinalizado(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.ListadoOrdenServicios.tablaListadoSer.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     
         sql= "SELECT orden_servicios.id_servicio, clientes.n_cliente, funcionarios.n_funcionario, orden_servicios.fecha_recepcion, orden_servicios.descripcion, orden_servicios.precio_final, orden_servicios.estado "
                 + "FROM orden_servicios, clientes, funcionarios " 
                 + "WHERE orden_servicios.fk_cliente = clientes.id_cliente "
                 + "and orden_servicios.fk_funcionario = funcionarios.id_funcionario and "
                 + "orden_servicios.estado LIKE '%FINALIZADO%'";
     
     
     
     String datos[] = new String[7];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             datos[2]= rs.getString(3);
             datos[3]= rs.getString(4);
             datos[4]= rs.getString(5);
             datos[5]= rs.getString(6);
             datos[6]= rs.getString(7);
             modelo.addRow(datos);    
         }
         vistas.ListadoOrdenServicios.tablaListadoSer.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
   
}
