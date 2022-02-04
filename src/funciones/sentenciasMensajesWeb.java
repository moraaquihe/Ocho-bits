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
public class sentenciasMensajesWeb {
     public static String Eliminar = "DELETE FROM mensajes WHERE id_mensaje= ?";
     
     
    private String id_mensaje;

    public String getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(String id_mensaje) {
        this.id_mensaje = id_mensaje;
    }
    
}
