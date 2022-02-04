/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;


public class sentenciasFuncionarios {
   public static String Listar = "SELECT * FROM funcionarios, ciudades WHERE "
                 +"funcionarios.fk_ciudad = ciudades.id_ciudad";
  
    public static String Registrar = "INSERT INTO funcionarios ("
            +"n_funcionario, " 
            +"ruc_ci, "
            +"fk_ciudad, "
            +"correo, "
            +"telefono, "
            +"direccion, "
            +"cargo)"
            +"VALUES(?,?,?,?,?,?,?)";
   
    public static String Actualizar = "UPDATE funcionarios SET "
            +"n_funcionario = ?," 
            +"ruc_ci = ?,"
            +"fk_ciudad = ?,"
            +"correo = ?,"
            +"telefono = ?,"
            +"direccion = ?,"
            +"cargo = ?"
            +"WHERE id_funcionario= ?";
    public static String Eliminar = "DELETE FROM funcionarios WHERE id_funcionario = ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE funcionarios";
    private String id_funcionario;
    private String n_funcionario;
    private String ruc_ci;
    private int fk_ciudad;
    private String correo;
    private String telefono;
    private String direccion;
    private String cargo;


    public String getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(String id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getN_funcionario() {
        return n_funcionario;
    }

    public void setN_funcionario(String n_funcionario) {
        this.n_funcionario = n_funcionario;
    }

    public String getRuc_ci() {
        return ruc_ci;
    }

    public void setRuc_ci(String ruc_ci) {
        this.ruc_ci = ruc_ci;
    }

    public int getFk_ciudad() {
        return fk_ciudad;
    }

    public void setFk_ciudad(int fk_ciudad) {
        this.fk_ciudad = fk_ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

     



    }    

