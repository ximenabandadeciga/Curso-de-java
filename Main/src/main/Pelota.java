
package main;

public class Pelota {
    
    //Variables nativas de la clase
    float radio;
    float peso;
    
    //Constructores 
    public Pelota()
    {
        radio = 100;
        peso = 250;  
    }

    public Pelota(float radio, float peso) {
        this.radio = radio;  // Con el "this" se hace referencia a una variable nativa de la clase
        this.peso = peso;
    }
    
    //Metodos 
    public float obtenerRadio()
    {
        return radio; // Regresan un valor 
    }
    
    public float obtenerPeso()
    {
        return peso;
    }
    
    public void patearPelota()
    {
        System.out.println("Has pateado la pelota");
    }
    
    public void atraparPelota()// El public void se utilizan para ejecutr cualquier seccion de codigo, se púeden declarar varibles y hacer operaciones etc.
    {
        System.out.println("Has atrapado la pelota"); 
    }
    
    
    
}
