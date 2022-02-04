/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerias;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Validaciones {
        public static boolean ParaDireccion(char caracter){
        if(Character.toString(caracter).matches("[^0-9a-zA-Z áéíóúÁÉÍÓÚñÑ]")) 
        if ((caracter != 'º' && caracter != '/' && caracter != '.'))
        {
            return true;
        } else {
        }
        return false;
    }
    public static boolean correo(char caracter){
        if(Character.toString(caracter).matches("[^0-9a-zA-Z]")) 
        if ((caracter != '_' && caracter != '@'&& caracter != '.' && caracter != '-'))
        {
            return true;
        } else {
        }
        return false;
    }
    public static boolean ruc(char caracter){
        if(Character.toString(caracter).matches("[^0-9a-zA-Z]")) 
        if ((caracter != '-' && caracter != '/' && caracter != '.'))
        {
            return true;
        } else {
        }
        return false;
    }
    public static boolean USU(char caracter){
        if(Character.toString(caracter).matches("[^0-9a-zA-Z]")) 
        
        {
            return true;
        } else {
        }
        return false;
    }
     public static boolean CedulaNumero(char caracter){
        if(Character.toString(caracter).matches("[^0-9]")) 
        if ((caracter != '.'))
        {
            return true;
        } else {
        }
        return false;
    }
    
    //Metodo que se encarga de validar las letras, y recibe como parametro el evento capturado al presionar un tecla cualquiera
    public static boolean Letras(char carcater){
        if(Character.toString(carcater).matches("[^a-zA-Z ñÑ]")){
            return true;
        }
            return false;
    }
//permite la introduccion solo de numeros
    
    public static boolean Numeros(char caracter){
            if (Character.toString(caracter).matches("[^0-9]"))
                if ((caracter != '+' && caracter != '-')) {
                return true;
            }
            return false;
    }//termina validacion numero
    
    public static boolean Espacio(char caracter){
        if(caracter != ' '){
            return true;
        }
        return false;
    }

    //Metodo que se encarga de validar los simbolosos, y recibe como parametro el evento capturado al presionar un tecla cualquiera
    public void validar_simbolos(KeyEvent evento){
        char car = evento.getKeyChar();//captura la tecla presionada, y le asigna a una variable de tipo caracter
        //Si el caracter presionado es algunos de los sigtes sinbolos
        //'º' '!' '"' '·' '$' '%' '&' '/' '(' ')' '=' '?' '¿' '^' '*' '¨' ';' ',' '.' ':' '-' '_' '*' incluhar car = evento.getKeyChar();//captura la tecla presionada, y le asigna a una variable de tipo caracter
        //Si el carso la tecla de espacio y la tecla ENTER
        if((car=='º')||(car=='!')||(car=='"')||(car=='·')||(car=='$')||(car=='%')||(car=='&')||(car=='/')||(car=='(')||(car==')')||(car=='=')||(car=='?')||(car=='¿')||(car=='^')||(car=='*')||(car=='¨')||(car==';')||(car==',')||(car=='.')||(car==':')||(car=='-')||(car=='_')||(car=='*')||(car==(char)KeyEvent.VK_SPACE)||(car==(char)KeyEvent.VK_ENTER)){
            if(car==(char)KeyEvent.VK_SPACE){//Si el caracter presionado es igual a la tecla de espacio
                //muestra mensaje en pantalla 
                JOptionPane.showMessageDialog(null, "Presionaste la tecla de espacio");
            }else{//si no es la tecla de espacio
                if(car==(char)KeyEvent.VK_ENTER){//si la tecla presionada es la tecla ENTER
                    //Muestra mensaje en pantalla
                    JOptionPane.showMessageDialog(null, "Presionaste la tecla ENTER");
                }else{//si no, si la tecla presionada es alguno de los simbolos permitidos
                    //muestra mensaje en pantalla
                    JOptionPane.showMessageDialog(null, "Presionaste el simbolo "+car);
                }
           }
        }else{// si la tecla presionada es distinto a los simbolos permitidos, a la tecla de espacio, o la tecla ENTER
            evento.consume();//consume el evento
        }
    }
    
}
