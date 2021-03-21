
package amigos;

/**
 * Referencias:https://emiliodevesa.com/2010/09/29/java-ejemplo-de-clase-objeto/
 * 
 * Ximena Banda Déciga
 */
public class Amigos {

 
    public static void main(String[] args) {
        
        Persona p1 = new Persona ("Pepe", 37, "Lugo", 611223344);
        Persona p2 = new Persona ();

        System.out.println ("P1:");
        System.out.println ("Nombre: "+p1.consultarNombre());
        System.out.println ("Edad: "+p1.consultarEdad());
        System.out.println ("Ciudad: "+p1.consultarCiudad());
        System.out.println ("Telefono: "+p1.consultarTelefono());

        System.out.println ("P2:");
        System.out.println ("Nombre: "+p2.consultarNombre());
        System.out.println ("Edad: "+p2.consultarEdad());
        System.out.println ("Ciudad: "+p2.consultarCiudad());
        System.out.println ("Telefono: "+p2.consultarTelefono());
        
        p2.cambiarEdad(20);
        System.out.println ("Edad P2: "+p2.consultarEdad());
     
    }
    
}
