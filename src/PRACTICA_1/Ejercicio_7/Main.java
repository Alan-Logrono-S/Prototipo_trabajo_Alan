package PRACTICA_1.Ejercicio_7;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto();
        producto1.setNombre("Pavo");
        producto1.setPrecio(20.5);

        System.out.println("Nombre del Producto: "+producto1.getNombre());
        System.out.println("Precio del Producto: "+producto1.getPrecio());

    }
}
