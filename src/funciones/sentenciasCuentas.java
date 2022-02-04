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
public class sentenciasCuentas {
    public static String Listar = "SELECT * FROM cuentas, bancos WHERE "
                 +"cuentas.fk_banco = bancos.id_banco ";
   
    public static String Registrar = "INSERT INTO cuentas ("
            +"fk_banco, "
            +"n_cuenta, " 
            +"numero, "
            +"tipo_cuenta, "
            +"saldo)"
            +"VALUES(?,?,?,?,?)";
    
    
    public static String Actualizar = "UPDATE cuentas SET "
            +"fk_banco = ?,"
            +"n_cuenta = ?,"
            +"numero = ?,"
            +"tipo_cuenta = ?,"
            +"saldo = ? "
            
            +"WHERE id_cuenta= ?";
    public static String Eliminar = "DELETE FROM cuentas WHERE id_cuenta= ?";
    
    public static String Eliminar_todo = "TRUNCATE TABLE cuentas";
    private String id_cuenta;
    private int fk_banco;
    private String n_cuenta;
    private String numero;
    private String tipo_cuenta;
    private int saldo;

    public String getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(String id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getFk_banco() {
        return fk_banco;
    }

    public void setFk_banco(int fk_banco) {
        this.fk_banco = fk_banco;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
    
    
}
