
package ordenamientoburbuja;

public class Ordenador {
    
    public void ordenarBurbuja(int [] array)
    {
        int aux; // sirve para cambiar las variables 
        boolean cambios = false;
    
        while(true)
        {
            cambios = false;
            
            for(int i =1; i<array.length; i++)
            {
                if(array[i]<array[i-1])// si el arroglo con la poscion de la derecha es menor al de izquierda vamos a realizar un cambio
                {
                    aux = array[i]; // se guarda el valor del numero que este en la posion i
                    array[i] = array[i-1];
                    array[i-1] = aux;//el arreglo en posicion i-1 va a ser igual a la variable auxiliar 
                    cambios = true;
                } 
            }
                if(cambios==false)
                    break;
          
        }
    }
    
    
}
