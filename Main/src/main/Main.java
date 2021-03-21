
package main;
//import main.Pelota; 
  import main.Carro;

public class Main {

    /**
     * Programa que explica la programacion orientada a objetos, clases, objetos, metodos, la herencia y polimorfisco en un mismo codigo.
     */
    public static void main(String[] args) {
        
        // TUTORIAL:"PROGRAMACION ORIENTADA A OBJETOS EN JAVA"
        /*
        Pelota p;
        p = new Pelota();
        p.paterPelota();
        */
        
        /*
        Pelota p = new Pelota(300, 300);
        Pelota pB = new Pelota(500, 500);
        System.out.println("La pelota pesa:"+p.obtenerPeso());
         */
        
        //TUTORIAL: "CLASES, OBJETOS Y MÉTODOS EN JAVA"
        /*
        Pelota p;
        p = new Pelota(500, 500);
        float x = p.obtenerRadio();
        p.atraparPelota();
        */
        
        /*
        Carro c;
        c = new Carro();
        c.estado();
        c.encender();
        c.estado();
        */
        
        /*TUTORIAL: "HERENCIA EN JAVA"
        
        HERENCIA: un objeto puede heredar propiedades o caracteristicas de otro objeto siguiendo como una jerarquia.*/
        
        /*
        CarroBMW c;
        c = new CarroBMW();
        c.apagar();
        c.encender();
        c.turbo();
        c.modelo();
        */
        
        /*TUTORIAL: "POLIMORFISMO EN JAVA"
        
        POLIMORFISMO: Estos metodos de igual nombre pueden variar o ser diferente dependiendo del tipo de objeto que estemos manejando
        es decir que metodos con el mismo nombre pueden hacer diferentes cosas.*/
       
        Carro c;
        c = new CarroToyota();
        c.informacion();
        
        
        
        
        
        
        
        


        
        
 
        
        
        
       
        
        
        
        
        
        
        
        
                
                
        
        
        
        
        
        
        
    }
    
}
