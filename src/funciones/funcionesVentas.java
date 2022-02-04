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
import librerias.GenerarNumero;
import rojerusan.RSNotifyAnimated;
import static vistas.RegistrarVentaInventario.txtCodigoInven;
import static vistas.RegistrarVentaServicio.txtCodigoSer;

/**
 *
 * @author SailorSakura
 */
public class funcionesVentas {
    private static   Conexion conexion = new Conexion();
    private static   Connection conexionActual = conexion.conectar();
    private static PreparedStatement ps= null;
    
    public static void setListarClientes(String buscar){
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
         vistas.VerClientesVentasInven.tablaClientes.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static void setListarClientesSer(String buscar){
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
         vistas.VerClientesVentasSer.tablaClientes.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static void numeros(){
        int j;
        String c ="";
        String sql ="SELECT MAX(timbrado) FROM ventas";
        
        try {
            Statement st = conexionActual.createStatement();
            ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    c = rs.getString(1);
                }
                if(c==null){
                    txtCodigoInven.setText("0001");

                } else {
                    j=Integer.parseInt(c);
                    librerias.GenerarNumero gen = new GenerarNumero();
                    gen.generar(j);
                    txtCodigoInven.setText(gen.serie());

                }
        } catch (SQLException ex) {
            System.out.println("error: funciones.funcionesVentas.numeros() "+ex.getMessage());
        } 
    }
    
    public static void numerosServicios(){
        int j;
        String c ="";
        String sql ="SELECT MAX(timbrado) FROM ventas";
        
        try {
            Statement st = conexionActual.createStatement();
            ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    c = rs.getString(1);
                }
                if(c==null){
                    txtCodigoSer.setText("0001");
                } else {
                    j=Integer.parseInt(c);
                    librerias.GenerarNumero gen = new GenerarNumero();
                    gen.generar(j);
                    txtCodigoSer.setText(gen.serie());
                }
        } catch (SQLException ex) {
            System.out.println("error: funciones.funcionesVentas.numeros() "+ex.getMessage());
        } 
    }
    
    public static void guardarVentasInven(){
        int idCabecera = 0;
        
        try {
         String sql = "INSERT INTO ventas VALUES (?,?,?,?,?,?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.RegistrarVentaInventario.idVentasInven.getText()));
         ps.setInt(2, login.funcionesLogin.idFuncionario);
         ps.setString(3, vistas.RegistrarVentaInventario.IdCliente.getText());
         ps.setString(4, "1");
         ps.setString(5, vistas.RegistrarVentaInventario.dateSeleccion.getText());
         ps.setString(6, vistas.RegistrarVentaInventario.txtCodigoInven.getText());
         ps.setString(7, vistas.RegistrarVentaInventario.txtSubTotal.getText());
         ps.setString(8, vistas.RegistrarVentaInventario.txtTotalImpuesto.getText());
         ps.setString(9, vistas.RegistrarVentaInventario.txtTotalGen.getText());
         int resultado = ps.executeUpdate();
         if (resultado>0){
             idCabecera = Integer.parseInt(vistas.RegistrarVentaInventario.idVentasInven.getText());
             System.out.print(idCabecera);
             
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        try {
            
            for (int i = 0; i < vistas.RegistrarVentaInventario.tablaVentaInven.getRowCount(); i++) {
                vistas.RegistrarVentaInventario.idDetV.setText(extraerIDMaxDetVentasInven());
                String sql2 = "INSERT INTO inventarios_ventas VALUES (?,?,?,?,?)";
                ps=conexionActual.prepareStatement(sql2);
                ps.setInt(1, Integer.parseInt(vistas.RegistrarVentaInventario.idDetV.getText()));
                ps.setInt(2, Integer.parseInt(vistas.RegistrarVentaInventario.tablaVentaInven.getValueAt(i, 0).toString()));
                ps.setInt(3, idCabecera);
                ps.setInt(4,Integer.parseInt(vistas.RegistrarVentaInventario.tablaVentaInven.getValueAt(i, 2).toString()));
                ps.setInt(5, Integer.parseInt(vistas.RegistrarVentaInventario.tablaVentaInven.getValueAt(i, 3).toString()));
                ps.executeUpdate();
            }
           new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
        } catch (SQLException ex) {
            System.out.print("error"+ex.getMessage());
        }
         
    }
    
    
    public static String extraerIDMaxVentasInven(){
           String sql ="SELECT MAX(id_ventas) FROM ventas";
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
    public static String extraerIDMaxDetVentasInven(){
           String sql ="SELECT MAX(id_invenventa) FROM inventarios_ventas";
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
    
    public static void setListarProductos(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerVentasInven.tablaListado.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT * FROM inventarios, impuestos WHERE "
                 + "inventarios.fk_iva = impuestos.id_iva";
         
     String datos[] = new String[5];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_inventario");
             datos[1]= rs.getString("inventarios.n_insumo");
             datos[2]= rs.getString("inventarios.cantidad");
             datos[3]= rs.getString("inventarios.precio");
             datos[4]= rs.getString("impuestos.tipo");
             modelo.addRow(datos);
              
         } 
         vistas.VerVentasInven.tablaListado.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static void setListarProductosSer(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.VerVentasSerProd.tablaListado.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
        
         sql ="SELECT * FROM inventarios, impuestos WHERE "
                 + "inventarios.fk_iva = impuestos.id_iva";
         
     String datos[] = new String[5];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_inventario");
             datos[1]= rs.getString("inventarios.n_insumo");
             datos[2]= rs.getString("inventarios.cantidad");
             datos[3]= rs.getString("inventarios.precio");
             datos[4]= rs.getString("impuestos.tipo");
             modelo.addRow(datos);
              
         } 
         vistas.VerVentasSerProd.tablaListado.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static void setListarDetVentasServicios(String id){
     DefaultTableModel modelo = (DefaultTableModel)vistas.RegistrarVentaServicio.tablaVentaServicios.getModel();
     DefaultTableModel modelo1 = (DefaultTableModel)vistas.RegistrarVentaServicio.tablaVentaProductos.getModel();
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
         vistas.RegistrarVentaServicio.tablaVentaServicios.setModel(modelo);
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
         vistas.RegistrarVentaServicio.tablaVentaProductos.setModel(modelo1);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }       
    }
    
    public static void guardarVentasServicio(){
        int idCabecera = 0;
        
        try {
         String sql = "INSERT INTO ventas VALUES (?,?,?,?,?,?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.RegistrarVentaServicio.idVentaSer.getText()));
         ps.setInt(2, login.funcionesLogin.idFuncionario);
         ps.setString(3, vistas.RegistrarVentaServicio.IdCliente.getText());
         ps.setString(4, vistas.RegistrarVentaServicio.idOrdenSer.getText());
         ps.setString(5, vistas.RegistrarVentaServicio.dateSeleccion.getText());
         ps.setString(6, vistas.RegistrarVentaServicio.txtCodigoSer.getText());
         ps.setString(7, vistas.RegistrarVentaServicio.txtSubTotal.getText());
         ps.setString(8, vistas.RegistrarVentaServicio.txtTotalImpuesto.getText());
         ps.setString(9, vistas.RegistrarVentaServicio.txtTotalGen.getText());
         int resultado = ps.executeUpdate();
         if (resultado>0){
             idCabecera = Integer.parseInt(vistas.RegistrarVentaServicio.idVentaSer.getText());
             System.out.print(idCabecera);
             
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        try {
            
            for (int i = 0; i < vistas.RegistrarVentaServicio.tablaVentaProductos.getRowCount(); i++) {
                vistas.RegistrarVentaServicio.idDetVentaSer.setText(extraerIDMaxDetVentasInven());
                String sql2 = "INSERT INTO inventarios_ventas VALUES (?,?,?,?,?)";
                ps=conexionActual.prepareStatement(sql2);
                ps.setInt(1, Integer.parseInt(vistas.RegistrarVentaServicio.idDetVentaSer.getText()));
                ps.setInt(2, Integer.parseInt(vistas.RegistrarVentaServicio.tablaVentaProductos.getValueAt(i, 0).toString()));
                ps.setInt(3, idCabecera);
                ps.setInt(4,Integer.parseInt(vistas.RegistrarVentaServicio.tablaVentaProductos.getValueAt(i, 2).toString()));
                ps.setInt(5, Integer.parseInt(vistas.RegistrarVentaServicio.tablaVentaProductos.getValueAt(i, 3).toString()));
                ps.executeUpdate();
            }
           new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
        } catch (SQLException ex) {
            System.out.print("error"+ex.getMessage());
        }
         
    }
    
}
