/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author SailorSakura
 */
public class sentenciasOrdenCompra {
    private static   Conexion conexion = new Conexion();
 private static   Connection conexionActual = conexion.conectar();
 private static PreparedStatement ps= null;
    
    
    
    public static String Eliminar = "DELETE FROM detalle_ordenes WHERE id_dorden = ?";
    
    String id_orden;

    public String getId_orden() {
        return id_orden;
    }

    public void setId_orden(String id_orden) {
        this.id_orden = id_orden;
    }
    
}
