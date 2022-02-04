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
public class sentenciasBancos {
    public static String Listar = "SELECT * FROM bancos"; 
    
    public static String Actualizar = "UPDATE bancos SET "
            +"n_banco = ?"      
            +"WHERE id_banco = ?";
    
    public static String Eliminar = "DELETE FROM bancos WHERE id_banco= ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE bancos";
    private String id_banco;
    private String n_banco;

    public String getId_banco() {
        return id_banco;
    }

    public void setId_banco(String id_banco) {
        this.id_banco = id_banco;
    }

    public String getN_banco() {
        return n_banco;
    }

    public void setN_banco(String n_banco) {
        this.n_banco = n_banco;
    }
    
}
