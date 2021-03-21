
package amigos;

public class Persona {
    
    private String nombre;
    private int edad;
    private String ciudad;
    private int telefono;

    public Persona(String n, int e, String c, int t) {
        this.nombre = n;
        this.edad = e;
        this.ciudad = c;
        this.telefono = t;
    }
    
    public Persona (){ //Constructor sin param.
        this.nombre = ""; // Nombre vacio
        this.edad = 0; // Edad cero
        this.ciudad =""; // Ciudad vacia
        this.telefono = 0; // Telefono cero
    }
    
     public void cambiarEdad (int e){
        this.edad = e;
    }

    public String consultarNombre (){
        return nombre;
    }

    public int consultarEdad (){
        return edad;
    }

    public String consultarCiudad (){
        return ciudad;
    }

    public int consultarTelefono (){
        return telefono;
    }
      
    
}
