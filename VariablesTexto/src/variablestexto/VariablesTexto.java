
package variablestexto;
import java.io.*;  // Libreria que se usa para la entrada y salida de flujos de informcion


public class VariablesTexto {
    /*
        -leer desde teclado 
        -concat()
        toUpperCase()
        -toLowerCase()
        -lenght
        -Convertir variables numericas a Strings y viceversa
    */
    public static void main(String[] args) {
        
        String texto = "";
         //int x = 0;
        double x = 50.3;
        
        texto = String.valueOf(x);
        
        
        
        /*
        
        InputStreamReader in = new InputStreamReader(System.in); // Se esta abriendo un flujo o canal de datos que recibe datos desde el exterior 
        BufferedReader buffer = new BufferedReader(in); //Espacio de memoria que almacena datos del canal que va a acapturar los datos
        
        try{
            
            texto = buffer.readLine(); //El try catch es por si ocurren errores de captura desde el teclado
            
            x = Integer.parseInt(texto); // Convierte una variable de tipo caracter String a un número
                
        }catch(IOException e){}      // vamos a capturar lo que hayamos escrito y se va a guardar en esta variable de texto 
        
        System.out.println(x);
        
      
        texto = texto.concat("-Esto es una concatenacion");// Significa que lo que contenga la variable texto va a ser igual a lo que contenga mas el mensaje de "Esto es una conc....."
        
        int a = texto.length(); // Para saber la cantidad de l letras contenidad
        
        //texto = texto.toLowerCase(); // Esto permite pasar el mensaje que contenga la variable texto a minusculas 
        
        texto = texto.toUpperCase(); // Para pone el mensaje guaraddo en la variable texto en MAYUSCULAS
        
        System.out.println(texto);
        
        System.out.println("La frace tiene"+a+"letras");
        */
        
        texto = texto.concat("-Double");
        System.out.println(texto);
        
        
        
        
    
        
    }
    
}
