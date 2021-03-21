
package main;

public class Carro {
    
    double peso;
    double altura;
    double ancho;
    double largo;
    int numeropuertas;
    String modelo;
    boolean encendido = false;
    
    public Carro()
    {
        this.peso = 1000;
        this. altura = 1.90; 
        this.ancho = 4;
    }
    
    public String modelo()
    {
        return this.modelo;
    }
    
    public double obtenerPeso()
    {
        return this.peso;
        
    }
    public void encender()
    {
        this.encendido = true;
        System.out.println("El carro esta encendido"); 
    }
    public void apagar()
    {
        this.encendido = false;
        System.out.println("El carro esta apagado"); 
    }
    public void estado()
    {
        if(encendido== true)
        System.out.println("El carro esta encendido"); 
        else
            System.out.println("El carro esta apagado");   
    }
        public void informacion ()
    {
        System.out.println("Este es un carro comun y corriente");
    }
        
}
    
    //Herencia
    class CarroBMW extends Carro
    {
        public CarroBMW()
        {
            this.modelo="BMW";
        }
        
        public void turbo()
        {
           System.out.println("Acabas de viajar a 100 millas por hora");
           
        }
        public void informacion ()
        {
           System.out.println("Este es un carro BMW del año 2011");
        }
    }

class CarroToyota extends Carro
    {
        public CarroToyota()
        {
            this.modelo="Toyota";
        }
            public void informacion ()
        {
           System.out.println("Este es un Toyota del año 2010");
        } 
    }    

    


    

