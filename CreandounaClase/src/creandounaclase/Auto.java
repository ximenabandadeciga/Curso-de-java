
package creandounaclase;

public class Auto {
    
    //Atributos
    private int num1;
    private int num2;
    private int num3;
    
    /*
    //Constructores
    
    public Auto(){}
    
    public Auto(int minum1){} // Lo que esta en parenctensis es lo que recibimos
    
    public Auto(int minum1, int minum2){}
    
    public Auto(int minum1, int minum2, int minum3){} //tengo el mismo nombre de constructor pero cada uno maneja diferentes del cual hace referencia
     */
    
    /* Otra forma de crear constructores en java es dando clic derecho en insert
    code,constructor y seleccionamos las variables que queremos y creamos*/

    public Auto(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    // Getters Setters - Es la manera en como me voy a comunicar desde mi codigo con la clase principal

     /* Podemos crearlos dando clic derecho, luego clic en inset code
     en Getters & Setters y seleccionamos las variables que queremos*/

    public int getNum1() { // Obtener
        return num1;
    }

    public void setNum1(int num1) { // Establecer o mandar
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    
}    
    
    

