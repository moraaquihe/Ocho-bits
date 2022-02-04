/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;


public class sentenciasProveedores {
   public static String Listar = "SELECT * FROM proveedores, ciudades WHERE "
                 +"proveedores.fk_ciudad = ciudades.id_ciudad ";
   
    public static String Registrar = "INSERT INTO proveedores ("
            +"n_proveedor, " 
            +"ruc_ci, "
            +"fk_ciudad, "
            +"correo, "
            +"telefono, "
            +"direccion)"
            +"VALUES(?,?,?,?,?,?)";
    
    
    public static String Actualizar = "UPDATE proveedores SET "
            +"n_proveedor = ?," 
            +"ruc_ci = ?,"
            +"fk_ciudad = ? ,"
            +"correo = ?,"
            +"telefono = ?,"
            +"direccion = ? "
            +"WHERE id_proveedor= ?";
    public static String Eliminar = "DELETE FROM proveedores WHERE id_proveedor = ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE proveedores";
    private String id_proveedor;
    private String n_proveedor;
    private String ruc_ci;
    private int fk_ciudad;
    private String correo;
    private String telefono;
    private String direccion;

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getN_proveedor() {
        return n_proveedor;
    }

    public void setN_proveedor(String n_proveedor) {
        this.n_proveedor = n_proveedor;
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

