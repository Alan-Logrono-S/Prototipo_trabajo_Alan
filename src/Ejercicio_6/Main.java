package Ejercicio_6;

public class Main {
    public static void main(String [] args) {

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Pepe");
        estudiante3.setCarrera("Desarrollo de Software");

        System.out.println("Nombre: "+ estudiante3.getNombre());
        System.out.println("Carrera: "+estudiante3.getCarrera());
    }
}
