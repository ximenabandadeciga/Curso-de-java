/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruccion_for;

/**
 *
 * @author Ximena Banda Deciga
 */
public class Instruccion_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int contador=1; contador<=20; contador++)
        {
            contador = contador *2;
            System.out.println("El contador vale "+contador);
        }
        
    }
    
}
