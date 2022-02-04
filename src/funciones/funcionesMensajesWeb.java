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

/**
 *
 * @author SailorSakura
 */
public class funcionesMensajesWeb {
    private static   Conexion conexion = new Conexion();
    private static   Connection conexionActual = conexion.conectar();
    private static PreparedStatement ps= null;
 
 public static void setListarMensajes(){
     DefaultTableModel modelo = (DefaultTableModel)vistas.MensajesWeb.tablaMensaje.getModel();
     while(modelo.getRowCount()> 0){
         modelo.removeRow(0); 
     }
     String sql ="";
     
         sql ="SELECT * FROM mensajes";
     
     
     String datos[] = new String[7];
     try {
         Statement st = conexionActual.createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             datos[0]= rs.getString("id_mensaje");
             datos[1]= rs.getString("nombre_apellido");
             datos[2]= rs.getString("email");
             datos[3]= rs.getString("celular");
             datos[4]= rs.getString("asunto");
             datos[5]= rs.getString("mensaje");
             datos[6]= rs.getString("estado");
             modelo.addRow(datos);    
         }
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
     //    Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
}
 
  
 public static boolean isDelete(sentenciasMensajesWeb s){
     try {
         String sql = sentenciasMensajesWeb.Eliminar;
         ps=conexionActual.prepareStatement(sql);
         ps.setString(1,s.getId_mensaje());
         ps.executeUpdate();
         return true;
         
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
         return false;
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 
 
 public static void Finalizado(String id){      
        try {
         String sql = "UPDATE mensajes SET estado = 'FINALIZADO' WHERE id_mensaje = '"+id+"'";
         ps=conexionActual.prepareStatement(sql);
         
         int resultado = ps.executeUpdate();
         if (resultado>0){
             new rojerusan.RSNotifyAnimated("EXITO", "Se ha respondido", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

         }
         
     } catch (SQLException ex) {System.out.print("error"+ex.getMessage());
        
 //        Logger.getLogger(funciones.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
 
 
}
