/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;


public class sentenciasCiudades {
   public static String Listar = "SELECT * FROM ciudades c, departamentos WHERE "
                 +"c.fk_departamento = departamentos.id_departamento";
  
    public static String Actualizar = "UPDATE ciudades SET "
            +"n_ciudad = ?,"      
            +"fk_departamento = ? "
            +"WHERE id_ciudad= ?";
    public static String Eliminar = "DELETE FROM ciudades WHERE id_ciudad= ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE ciudades";
    private String id_ciudad;
    private String n_ciudad;
    private int fk_departamento;

    public String getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(String id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getN_ciudad() {
        return n_ciudad;
    }

    public void setN_ciudad(String n_ciudad) {
        this.n_ciudad = n_ciudad;
    }

    public int getFk_departamento() {
        return fk_departamento;
    }

    public void setFk_departamento(int fk_departamento) {
        this.fk_departamento = fk_departamento;
    }

    }    

