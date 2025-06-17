package Ejercicio_8;

public class Main {
    public static void main (String [] args){
        Libro libro1 = new Libro();
        libro1.setTitulo("PRINCIPITO");
        libro1.setAniopublicacion(1980);

        System.out.println("Nombre del Libro: "+ libro1.getTitulo());
        System.out.println("Año de Publicacion: "+ libro1.getAniopublicacion());

    }
}
