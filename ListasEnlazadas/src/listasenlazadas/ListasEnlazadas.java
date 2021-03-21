
package listasenlazadas;
import java.util.LinkedList;

public class ListasEnlazadas {

    public static void main(String[] args) {
       
    /* Una lista enlazada es como un objeto el cual nos permite guardar una infinidad de datos y no tenemos un limite concreto
     y en un arreglo por lo contrario nosotros definimos previamente el limite de nuestro arreglo*/
    
    LinkedList lista = new LinkedList();
    
    lista.add("Palabra");// el metodo add lo que hace es añadar un objeto en orden rellenando la lista
    lista.add(5);
    lista.add(1, 17);
    // add.First, para añadir al inicio de la lista y add.Last para ñadir al final de la lista
    
    lista.remove(0);// Se utiliza para remover un dato en la lista y el 0 significa que estoy removiendo le primer valor del indice, por lo tanto no se imprime ese valor  
    
    System.out.println("El tamaño de la lista es:"+lista.size()); // Con este codigo podemos saber el numero tamaño de la lista que es el numero de variables
    System.out.println(lista.get(0));// El metodo get nos permite obtener las variables que estan dentro de esta lista ya que esta se manejan en indice
    
    
    
            
    
    
    
    }
    
}
