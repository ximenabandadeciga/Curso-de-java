
package pilasstacks;

import java.util.Stack;

public class PilasStacks {

    public static void main(String[] args) {
        /*PILA: Espacio de memoria donde vamos a guardar datos, en donde usaremos 4 metodos nativos 
        1. Push: Con el cual introducimos un dato en la pila
        2. Pop: Se usa para quitar el ultimo datos introducido 
        3.Peek: Se utiliza para ver el ultimo dato que esta en la pila el utimo que se introdujo
        4.Empty: Se utiliza nada mas para saber si la pila tiene o no datos
        
        La pilas se manejan como un objeto en el cual la informacion entra con una cierta logica, el primero que entra es el ultimo que sale
        y a esta logica se lo conoce fifo lo que significa first-in, last-out.
        */
        
        Stack pila = new Stack(); // para crear una pila
        pila.push(50);// El metodo push empuja un dato hasta el fondo de la pila ---  El numero 50 va a tomar el el valor de indice de 0 va a hacer el primero en la pila
        pila.push("String"); // va a ser el indice 1
        pila.push(17);
        pila.push("Palabra");
        /*Cuando se utiliza stack solo se puede obtener el ultimo valor que introducimos en la stack
         por que solo vamos a usar ppek para ver y el metodo pop para obtener */
        
        System.out.println("El ultimo elemento en la pila es:" +pila.peek());
        
        //Rutina para obtener todo los valores de la pila y vaciarla 
        
        while(pila.empty()==false) // mientras que la pila no este vacia 
        {
            System.out.println(pila.pop()); // obtener el utimo valor en la pila pero a la vez lo va a eliminar osea la va a ir vaciando
            
        }
        
        
        
        
        
        
        
        
    }
    
}
