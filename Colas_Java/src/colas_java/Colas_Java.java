
package colas_java;
import java.util.LinkedList;

public class Colas_Java {

    public static void main(String[] args) {
        
        /*COLAS: Son una variacion de las listas enlasadas, la diferencia es que las colas utilizan offer  para añadir un dato y poll para obtener un dato.
         Es decir que las colas son el contrario a las pilas, ya que en las pilas se introduce un dato y se puede obtener solo el ultimo dato que fue introducido,
         en cambio en las colas se introducen los datos en un cierto orden y se obtiene el primero que fue introducido.
        
         Ejemplo: Cola: Datos en los indices 0,1,2,3 
         Pila: Datos en el indice 3
          Filosofia de las pilas: Fifo first.in, first.out
        */
        
        LinkedList cola = new LinkedList(); // Para crear una cola
        
        for(int i=1; i<11; i++)// añade los numeros del 1 al 10                        Nota: no se usa llaves por que es una linea de codigo
            cola.offer(i); //añade los numeros a la cola
        
        while(cola.peek()!=null)//mientras que la cola tenga datos y no este vacia se va a utilizar el metodo cola.poll para obtener los datos de regreso
        {
            System.out.print(cola.poll());
        }
        
            
        

        
    }
    
}
