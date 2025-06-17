package PRACTICA_4.Ejercicio_4;

public class Persona {
    private int edad;

    public void setEdad(int edad) {
        if(edad >= 0){
            this.edad = edad;
            System.out.println("Edad Aceptada: "+edad);
        }
        else {
            System.out.println("Edad invalida.");
        }
    }

    public int getEdad() {
        return edad;
    }
}

