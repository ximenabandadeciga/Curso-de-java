
package ordenamientoburbuja;


public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        
        int[]arreglo = {78,30,21,41,29,13,19,63,84,90,101,28,11};
        Ordenador o = new Ordenador();
        o.ordenarBurbuja(arreglo);
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
        /*
        * 5,3,4,2
        * 3,4,2,5
        * 3,2,4,5
        * 2,3,4,5
        */
        
    }
    
}
