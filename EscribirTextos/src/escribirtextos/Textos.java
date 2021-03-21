
package escribirtextos;
import java.io.*;

public class Textos {
    
    public void escribir(String nombreArchivo)
    {
        File f; // Crea un objeto de tipo archivo
        f = new File(nombreArchivo); // se asigna un nombre al archivo 
    
        // Escritura
        try{
            FileWriter w = new FileWriter(f); // FileWriter
            BufferedWriter bw = new BufferedWriter(w);//BufferedWriter
            PrintWriter wr = new PrintWriter(bw);//PrintWriter
            
            wr. write("Esto es una linea de texto");
            wr.append("-Esto es una segunda linea de texto");
            wr.close();
            bw.close();
            
        }catch(IOException e){};
        
    }
    public void leer(String nombreArchivo)
    {
        try{
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);
            
            String temp="";
            
            while(temp!=null){
            
            temp= buffer.readLine();
            if(temp==null)
                break;
            System.out.println(temp);
      
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    
    
}
