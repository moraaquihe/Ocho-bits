/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Conexion {
     
    Connection conexion = null;   
    public Connection conectar() {
       
        try {
            
            String url = "jdbc:mysql://localhost:3306/ochodatabase?useUnicode=true"
                    + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false"
                    + "&serverTimezone=UTC",
                    user = "root", password = "1234";
 
            conexion = DriverManager.getConnection(url, user, password);
 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Fallo al recibir base de datos");
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "No hay resultado");
        }finally{
            System.out.println("***CONECTADO A BD***");
            return conexion;
        }
    }

}
