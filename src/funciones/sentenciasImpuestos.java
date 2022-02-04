/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author SailorSakura
 */
public class sentenciasImpuestos {
    public static String Listar = "SELECT * FROM impuestos";  
        
    public static String Actualizar = "UPDATE impuestos SET "
            +"tipo = ?"      
            +"WHERE id_iva = ?";
    public static String Eliminar = "DELETE FROM impuestos WHERE id_iva= ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE impuestos";
    private String id_iva;
    private String tipo; 

    public String getId_iva() {
        return id_iva;
    }

    public void setId_iva(String id_iva) {
        this.id_iva = id_iva;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
