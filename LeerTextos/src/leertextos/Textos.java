
package leertextos;
import java.io.*; //Se utiliza para la lectura y escritura de archivos

public class Textos {
    
    public void leer(String nombreArchivo)
    {
        try{ // Se utiliza un try y un catch ya que en a lectura archivos se puede ocacionar algunos errores. Ejemplo: error en caso que no se encuentre el archivo
            
            FileReader r = new FileReader(nombreArchivo);// Clase que se utiliza para leer archivos de texto
            BufferedReader buffer = new BufferedReader(r); //Espacio de memoria para gyardar información
            
            /*
            System.out.println(buffer.readLine()); //Lee la primera linea del archivo de texto
            System.out.println(buffer.readLine()); //Lee la segunda linea del archivo de texto
            */
           
            String temp="";  // Ciclo que nos permite leer todas la lineas de un archivo de texto sin necesidad de poner como en el codigo anterior 
            
            while(temp!=null){ // Creamos una variable temporal y la inicializamos con "" para que no se una variable nula es decir esta vacia
            temp = buffer.readLine(); //mientras la variable no se nula y guaradamos la linea de texto que vamos a leer del archivo
            if(temp==null) // con esta linea nos aseguramos de que no se vaya a imprimer un valor no deseada
                break;  // salimos del ciclo si el mensaje no es deseado en este caso nulo
            System.out.println(temp); // imprimimos el mensaje si es correcto 
            
            };

           
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        
        }
    }
    
}
