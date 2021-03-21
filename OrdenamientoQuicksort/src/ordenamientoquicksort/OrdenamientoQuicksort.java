
package ordenamientoquicksort;


public class OrdenamientoQuicksort {

   
    public static void main(String[] args) {
        
       
        
        int[]arreglo = {78,30,21,41,29,13,19,63,84,90,101,28,11};
        Ordenador o = new Ordenador();
        o.ordenarQuicksort(arreglo);
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
        
    
    
}
