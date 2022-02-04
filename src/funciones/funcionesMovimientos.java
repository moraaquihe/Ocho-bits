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

/**
 *
 * @author SailorSakura
 */
public class funcionesMovimientos {
     private static   Conexion conexion = new Conexion();
     private static   Connection conexionActual = conexion.conectar();
     private static PreparedStatement ps= null;
    
    
    public static String extraerIDMaxMov(){
           String sql ="SELECT MAX(id_mov) FROM movimientos";
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
    
    public static void guardarMov(){
               
        try {
         String sql = "INSERT INTO movimientos VALUES (?,?,?,?,?)";
         ps=conexionActual.prepareStatement(sql);
         ps.setInt(1,Integer.parseInt(vistas.Movimientos.idMov.getText()));
         ps.setInt(2,Integer.parseInt(vistas.Movimientos.idCuentaMov.getText()));
         ps.setInt(3, Integer.parseInt(vistas.Movimientos.idCajaMov.getText()));
         ps.setString(4, vistas.Movimientos.txtFechaMov.getText());
         ps.setInt(5, Integer.parseInt(librerias.SeparadorMiles.quitarPuntos(vistas.Movimientos.txtMontoMov.getText())));
            
         int resultado = ps.executeUpdate();
         if (resultado>0){
            
             System.out.print("guarda el movimiento mija");
         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }
}
