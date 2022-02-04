/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librerias;

public class Mayusculas {
    //METODO CONVERTIR MINÚSCULAS A MAYÚSCULAS 
    public static void convertiraMayusculasEnJtextfield(javax.swing.JTextField jTextfieldS){
    String cadena= (jTextfieldS.getText()).toUpperCase();
    jTextfieldS.setText(cadena);
    }
}
