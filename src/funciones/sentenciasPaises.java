/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;


public class sentenciasPaises {
    public static String Listar = "SELECT * FROM paises";         
    public static String Actualizar = "UPDATE paises SET "
            +"n_pais = ?"      
            +"WHERE id_pais = ?";
    public static String Eliminar = "DELETE FROM paises WHERE id_pais= ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE paises";
    private String id_pais;
    private String n_pais;  

    public String getId_pais() {
        return id_pais;
    }

    public void setId_pais(String id_pais) {
        this.id_pais = id_pais;
    }

    public String getN_pais() {
        return n_pais;
    }

    public void setN_pais(String n_pais) {
        this.n_pais = n_pais;
    }
    
}
