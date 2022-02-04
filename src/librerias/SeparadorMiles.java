
package librerias;

import javax.swing.JTextField;


public class SeparadorMiles 
{
    public static void separadorMiles (JTextField Numero)
    {
        
         String aux_cadena = quitarPuntos(Numero.getText());
         
         int contador = 0;
         for (int i = aux_cadena.length(); i >0 ; i--)
            {
                contador++;
                  if (aux_cadena.length() < 6)
                   {
                    
                        if (contador == 3 )
                        {   int posicionFin = aux_cadena.length() - 2;
                            // Posicion inicial es desde donde quiero separar y final hasta donde, en el primer substring
                            //en el segundo usa apartir de donde se le va a sumar todo el contenido
                            aux_cadena = aux_cadena.substring(0,posicionFin) + "." + aux_cadena.substring(posicionFin);

                        }
                   }
                   else if (aux_cadena.length() >= 6)
                    {
                        if (contador == 6)
                        {
                            int p = aux_cadena.length() - 5;
                            aux_cadena = aux_cadena.substring(0,p) + "." + aux_cadena.substring(p,p+3) + "." + aux_cadena.substring(p+3);
                        }
                    }
            }
 
        
     Numero.setText(aux_cadena);
    }
    
    public static void separadorMilesBackspace (JTextField Numero )
    {
        String aux_cadena = quitarPuntos(Numero.getText()); 
        int contador = 0;
         
         if ( aux_cadena.length() > 4)
         {
             for (int i = aux_cadena.length(); i >0 ; i--)
            {
                contador++;
                  if (aux_cadena.length() < 7)
                   {
                    
                        if (contador == 3 )
                        {   int posicionFin = (aux_cadena.length()) - 4;
                            // Posicion inicial es desde donde quiero separar y final hasta donde, en el primer substring
                            //en el segundo usa apartir de donde se le va a sumar todo el contenido
                            aux_cadena = aux_cadena.substring(0,posicionFin) + "." + aux_cadena.substring(posicionFin);

                        }
                   }
                   else if (aux_cadena.length() > 7)
                    {
                        if (contador == 6)
                        {
                            int p = aux_cadena.length() - 7;
                            aux_cadena = aux_cadena.substring(0,p) + "." + aux_cadena.substring(p,p+3) + "." + aux_cadena.substring(p+3);
                        }
                        
                        
                    }
                  else if (contador == 7)
                        {
                            aux_cadena = aux_cadena.substring(0,3) + "." + aux_cadena.substring(3);

                        }
                   }
                 
                  
            }
         
    
    Numero.setText(aux_cadena);
    }
    public static String agregarPuntos (float Numero)
    {
     
        int valor;
        valor = (int) Numero;
        
        String valoraModificar = String.valueOf(valor);
        String aux_cadena = quitarPuntos(valoraModificar);
         
         int contador = 0;
       if ( aux_cadena.length() > 3)
         { 
         for (int i = aux_cadena.length(); i >0 ; i--)
            {
                contador++;
                  if (aux_cadena.length() < 6)
                   {
                    
                        if (contador == 3 )
                        {   int posicionFin = aux_cadena.length() - 3;
                            // Posicion inicial es desde donde quiero separar y final hasta donde, en el primer substring
                            //en el segundo usa apartir de donde se le va a sumar todo el contenido
                            aux_cadena = aux_cadena.substring(0,posicionFin) + "." + aux_cadena.substring(posicionFin);

                        }
                   }
                   else if (aux_cadena.length() > 6)
                    {
                        if (contador == 6)
                        {
                            int p = aux_cadena.length() - 6;
                            aux_cadena = aux_cadena.substring(0,p) + "." + aux_cadena.substring(p,p+3) + "." + aux_cadena.substring(p+3);
                        }
                    }
                   else if (contador == 6)
                   {
                       aux_cadena = aux_cadena.substring(0,3) + "." + aux_cadena.substring(3);
                   }
            }
         }
         return aux_cadena;
         
        
    }
    
    public static String quitarPuntos(String cadena)
    {
       
        String nueva_cadena = "";
       
        for (int i = 0; i < cadena.length(); i++ )
        {
            
            char aux = cadena.charAt(i);
            
            if (Character.isDigit(aux))
            {
                nueva_cadena = nueva_cadena + aux;   
            }
            
        }
        return nueva_cadena;
    }
}
