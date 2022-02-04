/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author Joel
 */
public class sentenciasDepartamentos {
   public static String Listar = "SELECT * FROM departamentos, paises WHERE "
                 +"departamentos.fk_pais = paises.id_pais ";
   /*public static String Registrar = "INSERT INTO  departamentos("
            +"ciuadad_id,"
            +"nombre,"
            +"departamento_fk)"
            +"VALUES(?,?,?)";
            */
    public static String Actualizar = "UPDATE departamentos SET "
            +"n_departamento = ?,"      
            +"fk_pais = ? "
            +"WHERE id_departamento= ?";
    public static String Eliminar = "DELETE FROM departamentos WHERE id_departamento= ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE departamentos";
    private String id_departamento;
    private String n_departamento;
    private int fk_pais;

    public String getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(String id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getN_departamento() {
        return n_departamento;
    }

    public void setN_departamento(String n_departamento) {
        this.n_departamento = n_departamento;
    }

    public int getFk_pais() {
        return fk_pais;
    }

    public void setFk_pais(int fk_pais) {
        this.fk_pais = fk_pais;
    }


    
    }    

