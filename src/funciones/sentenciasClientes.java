/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;


public class sentenciasClientes {
   public static String Listar = "SELECT * FROM clientes, ciudades WHERE "
                 +"clientes.fk_ciudad = ciudades.id_ciudad ";
        public static String Registrar = "INSERT INTO clientes ("
            +"n_cliente, " 
            +"ruc_ci, "
            +"fk_ciudad, "
            +"correo, "
            +"telefono, "
            +"direccion)"
            +"VALUES(?,?,?,?,?,?)";
            
        
    public static String Actualizar = "UPDATE clientes SET "
            +"n_cliente = ?," 
            +"ruc_ci = ?,"
            +"fk_ciudad = ? ,"
            +"correo = ?,"
            +"telefono = ?,"
            +"direccion = ? "
            +"WHERE id_cliente= ?";
    public static String Eliminar = "DELETE FROM clientes WHERE id_cliente = ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE clientes";
    private String id_cliente;
    private String n_cliente;
    private String ruc_ci;
    private int fk_ciudad;
    private String correo;
    private String telefono;
    private String direccion;

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getN_cliente() {
        return n_cliente;
    }

    public void setN_cliente(String n_cliente) {
        this.n_cliente = n_cliente;
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



    }    

