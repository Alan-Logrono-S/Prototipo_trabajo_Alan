package PRACTICA_6.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Luis", 40, 900, 100);
        System.out.println("--- Información de Luis ---");
        g1.mostrarInfo();

        System.out.println();

        Gerente g2 = new Gerente("Ana", 30, 700, 200);
        System.out.println("--- Información de Ana ---");
        g2.mostrarInfo();
    }
}
