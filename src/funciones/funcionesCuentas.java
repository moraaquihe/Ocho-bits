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
public class funcionesCuentas {
 private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
 public static boolean isRegister(sentenciasCuentas s){
     try {
         String sql = sentenciasCuentas.Registrar;
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,s.getFk_banco());
         ps.setString(2,s.getN_cuenta());
         ps.setString(3,s.getNumero());
         ps.setString(4,s.getTipo_cuenta());
         ps.setInt(5,s.getSaldo());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isUpdate(sentenciasCuentas s){
     
     try {  
         String sql = sentenciasCuentas.Actualizar;
         ps = conexionActual.prepareStatement(sql);
        ps.setInt(1,s.getFk_banco());
         ps.setString(2,s.getN_cuenta());
         ps.setString(3,s.getNumero());
         ps.setString(4,s.getTipo_cuenta());
         ps.setInt(5,s.getSaldo());
         ps.setString(6,s.getId_cuenta());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static boolean isDelete(sentenciasCuentas s){
     try {
         String sql = sentenciasCuentas.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_cuenta());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }

public static void setListar(String buscar){
     DefaultTableModel modelo = (DefaultTableModel)vistas.Cuentas.tablaCuentas.getModel();
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
         public static String extraerIDMaxCUENTA(){
           String sql ="SELECT MAX(id_cuenta) FROM cuentas";
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
 public static void cargarComboBanco(){
        
        try {
          String sql = "select n_banco from bancos";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.AgregarCuenta.comboBanco.addItem("Seleccione");
            while(rs.next()){
              vistas.AgregarCuenta.comboBanco.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
  public static void cargarComboBancoUpdate(){
        
        try {
          String sql = "select n_banco from bancos";
          Statement st = conexionActual.createStatement();
          ResultSet rs = st.executeQuery(sql);
          vistas.ModificarCuenta.comboBancoUpdate.addItem("Seleccione");
            while(rs.next()){
              vistas.ModificarCuenta.comboBancoUpdate.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    } 
}
