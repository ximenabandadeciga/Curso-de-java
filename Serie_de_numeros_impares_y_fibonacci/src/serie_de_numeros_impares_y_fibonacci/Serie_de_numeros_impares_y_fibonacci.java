/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie_de_numeros_impares_y_fibonacci;

/**
 *
 * @author Ximena Banda Deciga
 */
public class Serie_de_numeros_impares_y_fibonacci {

    /**
     * @param args the command line arguments
     */
    
    //Algoritmos ciclos
    //Serie de fibonacci 1,1,2,3,5,8,11....
    public static void main(String[] args) {
        
        //EJEMPLO 1:
        //for(int i=0; i<=100;i++)
        //{
            //if((i%2)!=0)
            //{
                //System.out.println(i);
            //}
        //}
        
       //EJEMPLO 2:
        int x = 1;
        int anterior = 0;
        int temp;
        while(true)
        {
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;
            
            if(x>100)
            {
                break;
            }
        }
    }
    
}
