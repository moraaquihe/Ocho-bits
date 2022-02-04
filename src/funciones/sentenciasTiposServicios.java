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
public class sentenciasTiposServicios {
    public static String Listar = "SELECT * FROM tipos_servicios, impuestos WHERE "
                 +"tipos_servicios.fk_iva = impuestos.id_iva ";
        public static String Registrar = "INSERT INTO tipos_servicios ("
            +"nombre, " 
            +"precio_mano, "
            +"fk_iva)"
            +"VALUES(?,?,?)";

    public static String Actualizar = "UPDATE tipos_servicios SET "
            +"nombre =? , " 
            +"precio_mano =?, "
            +"fk_iva =? "
            +"WHERE id_tservicio= ?";
    
    public static String Eliminar = "DELETE FROM tipos_servicios WHERE id_tservicio = ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE tipos_servicios";
    
    private String id_tservicio;
    private String nombre;
    private int precio_mano;
    private int fk_iva;

    public String getId_tservicio() {
        return id_tservicio;
    }

    public void setId_tservicio(String id_tservicio) {
        this.id_tservicio = id_tservicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio_mano() {
        return precio_mano;
    }

    public void setPrecio_mano(int precio_mano) {
        this.precio_mano = precio_mano;
    }

    public int getFk_iva() {
        return fk_iva;
    }

    public void setFk_iva(int fk_iva) {
        this.fk_iva = fk_iva;
    }
    
    
}
