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
public class sentenciasUsuarios {
    public static String Listar = "SELECT * FROM usuarios, funcionarios, tipos_usuarios WHERE "
                 +"usuarios.fk_funcionario = funcionarios.id_funcionario and "
                 +"usuarios.fk_tipo = tipos_usuarios.id_tipo";
        public static String Registrar = "INSERT INTO usuarios ("
            +"n_usuario, " 
            +"pass, "
            +"fk_funcionario, "
            +"fk_tipo)"
            +"VALUES(?,?,?,?)";
            
        
    public static String Actualizar = "UPDATE usuarios SET "
            +"n_usuario = ?," 
            +"pass = ?,"
            +"fk_funcionario = ?,"
            +"fk_tipo = ? "
            +"WHERE id_usuario= ?";
    public static String Eliminar = "DELETE FROM usuarios WHERE id_usuario = ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE usuarios";
    
    private String id_usuario;
    private String n_usuario;
    private String pass;
    private int fk_funcionario;
    private int fk_tipo;

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getN_usuario() {
        return n_usuario;
    }

    public void setN_usuario(String n_usuario) {
        this.n_usuario = n_usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(int fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }

    public int getFk_tipo() {
        return fk_tipo;
    }

    public void setFk_tipo(int fk_tipo) {
        this.fk_tipo = fk_tipo;
    }

    
    
}
