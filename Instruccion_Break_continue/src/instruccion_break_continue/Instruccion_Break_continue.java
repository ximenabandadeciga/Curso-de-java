/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruccion_break_continue;

/**
 *
 * @author Ximena Banda Deciga
 */
public class Instruccion_Break_continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //PRIMER EJEMPLO:
        
        //for(int i=0; i<10; i++)
        //{
            //System.out.println("Aun estas en el ciclo");
            //if(i==4)
            //{
                //break;   // cortarta el ciclo completamente impidiendo que imprima los siguiente mensajes
            //}
            //System.out.println("El valor de i es:"+i);
        //}
        //System.out.println("Has dejado el ciclo for");
        
        //SEGUNDO EJEMPLO:
        
        for(int i=0; i<10; i++)
        {
            System.out.println("Aun estas en el ciclo");
            if(i==4)
            {
                continue;   // terminamos el cliclo completo de 0 a 10
            }
            System.out.println("El valor de i es:"+i);
        }
        System.out.println("Has dejado el ciclo for");
            
        
        
    }
    
}
