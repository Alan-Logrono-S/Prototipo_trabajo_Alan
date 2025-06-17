package PRACTICA_6.Ejercicio_3;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto("Toyota", "Yaris");
        auto.mostrarTipo();

        System.out.println();

        try {
            Camion camion = new Camion(null, "Volvo FH");
            camion.mostrarTipo();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
