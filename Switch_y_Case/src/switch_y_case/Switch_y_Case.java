/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_y_case;

/**
 *
 * @author Ximena Banda Deciga
 */
public class Switch_y_Case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char x;
        x= 'a';
        switch(x)
        {
            case 'a':
            {
                System.out.println("Esta es la opcion 0");
                break;   // Es importante agregar un break para deterner el ciclo al termino de un case para que no se vaya de largo con los otros valores   
            }
            case 'b':
            {
                System.out.println("Esta es la opcion 1");
                break;     
            } 
            default:
            {
                System.out.println("Esta opcion es la opcion por defecto"); 
            }
            
        }
    }
    
}
