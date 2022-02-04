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
import vistas.Caja;
import vistas.Principal;

/**
 *
 * @author SailorSakura
 */
public class funcionesCaja {
     private static   Conexion conexion = new Conexion();
     private static   Connection conexionActual = conexion.conectar();
     private static PreparedStatement ps= null;
    
 
    public static void setListarCuentas(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Apertura.tablaCuentas.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     if (buscar.equals("")){
         sql= sentenciasCuentas.Listar;
     }else{
         sql ="SELECT * FROM cuentas, bancos WHERE "
                 +"cuentas.n_cuentas LIKE'"+buscar+"%'"
               +"and cuentas.fk_banco = bancos.id_banco";
     }
     
     String datos[] = new String[6];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_cuenta");
             datos[1]= rs.getString("bancos.n_banco");
             datos[2]= rs.getString("n_cuenta");
             datos[3]= rs.getString("numero");
             datos[4]= rs.getString("tipo_cuenta");
             datos[5]= rs.getString("saldo");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static void setListarCompras(String fechaP){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Caja.tablaComprasCaja.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     //fechaP = Principal.lblfecha.getFecha();
     String sql ="";
        
         sql ="SELECT * FROM compras WHERE id_compra = '"+fechaP+"'";
         System.out.println("tiene que listar sha"); 
                
         
     String datos[] = new String[2];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             datos[0]= rs.getString("id_compra");
             datos[1]= rs.getString("total");
             modelo.addRow(datos);
             
         } 
         vistas.Caja.tablaComprasCaja.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
     public static void setListarVentas(String fech){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Caja.tablaVentasCaja.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     fech = Caja.FechaActual();
     String sql ="";
        
         sql ="SELECT * FROM ventas, clientes  WHERE" 
                 + " clientes.id_cliente = ventas.fk_cliente and"
                 + " fecha ='"+fech+"'";
        
        //  System.out.println("gg kp"+sql);
                
         
     String datos[] = new String[3];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             datos[0]= rs.getString("id_ventas");
             datos[1]= rs.getString("clientes.n_cliente");
             datos[2]= rs.getString("total_general");
             
             modelo.addRow(datos);
         } 
         vistas.Caja.tablaVentasCaja.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }
    
    public static String extraerIDMaxCaja(){
           String sql ="SELECT MAX(id_caja) FROM caja";
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
    
    public static void guardarCaja(){
        int idCabecera = 0;
        
        try {
         String sql = "INSERT INTO caja VALUES (?,?,?,?,?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.Caja.idCaja.getText()));
         ps.setString(2, vistas.Caja.dateSeleccion.getText());
         ps.setInt(3,Integer.parseInt(librerias.SeparadorMiles.quitarPuntos(vistas.Caja.txtSaldo.getText())));
         ps.setInt(4, Integer.parseInt(librerias.SeparadorMiles.quitarPuntos(vistas.Caja.txtTotalCierre.getText())));
         ps.setInt(5, Integer.parseInt(librerias.SeparadorMiles.quitarPuntos(vistas.Caja.txtIngreso.getText())));
         ps.setInt(6, Integer.parseInt(librerias.SeparadorMiles.quitarPuntos(vistas.Caja.txtEgreso.getText())));
         ps.setInt(7,1);
         ps.setInt(8,1);
            
         int resultado = ps.executeUpdate();
         if (resultado>0){
            
             System.out.print("guarda la caja mija");
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }
    
    public static void setListarPrueba(String fechaaa){
        DefaultTableModel modelo = (DefaultTableModel)vistas.Caja.tablaComprasCaja.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     fechaaa = Caja.FechaActual();
     String sql ="";
        
         sql ="SELECT id_compra, total FROM compras  WHERE fecha ='"+fechaaa+"'";
        
        //  System.out.println("gg kp"+sql);
                
         
     String datos[] = new String[2];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             datos[0]= rs.getString(1);
             datos[1]= rs.getString(2);
             
             modelo.addRow(datos);
         } 
         vistas.Caja.tablaComprasCaja.setModel(modelo);
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
  public static void updateApertura(String id){      
        try {
         String sql = "UPDATE cuentas SET saldo = '0' WHERE id_cuenta = '"+id+"'";
         ps=conexionActual.prepareStatement(sql);
         
         int resultado = ps.executeUpdate();
         if (resultado>0){
             //new rojerusan.RSNotifyAnimated("EXITO", "Se ha terminado el servicio", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
  
  public static void updateCierre(String id, String saldo){      
        try {
         String sql = "UPDATE cuentas SET saldo = '"+saldo+"' WHERE id_cuenta = '"+id+"'";
         ps=conexionActual.prepareStatement(sql);
         
         int resultado = ps.executeUpdate();
         if (resultado>0){
             //new rojerusan.RSNotifyAnimated("EXITO", "Se ha terminado el servicio", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
}
