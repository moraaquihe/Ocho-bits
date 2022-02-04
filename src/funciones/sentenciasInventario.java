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
public class sentenciasInventario {
    public static String Listar = "SELECT * FROM inventarios, impuestos WHERE "
                 +"inventarios.fk_iva = impuestos.id_iva ";
        public static String Registrar = "INSERT INTO inventarios ("
            + "id_inventario, "
            +"n_insumo, " 
            +"cantidad, "
            +"descripcion, "
            +"fk_iva, "
            +"precio)"
            +"VALUES(?,?,?,?,?,?)";
            
        
    public static String Actualizar = "UPDATE inventarios SET "
            +"n_insumo = ?," 
            +"cantidad = ?,"
            +"descripcion = ? ,"
            +"fk_iva = ?,"
            +"precio = ? "
            +"WHERE id_inventario= ?";
    public static String Eliminar = "DELETE FROM inventarios WHERE id_inventario = ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE inventarios";
    
    private String id_inventario;
    private String n_insumo;
    private int cantidad;
    private String descripcion;
    private int fk_iva;
    private int precio;

    public String getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(String id_inventario) {
        this.id_inventario = id_inventario;
    }

    public String getN_insumo() {
        return n_insumo;
    }

    public void setN_insumo(String n_insumo) {
        this.n_insumo = n_insumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFk_iva() {
        return fk_iva;
    }

    public void setFk_iva(int fk_iva) {
        this.fk_iva = fk_iva;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
