package PRACTICA_5.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        CursoRegular curso1 = new CursoRegular("Java Básico", 100);
        CursoCertificado curso2 = new CursoCertificado("Java Avanzado", 150, 50);

        System.out.println("Costo CursoRegular: " + curso1.calcularCosto()); // 100
        System.out.println("Costo CursoCertificado: " + curso2.calcularCosto()); // 200

        curso1.mostrarInfo("Java Básico");
        curso2.mostrarInfo("Java Avanzado", curso2.calcularCosto());

        curso1.calcularDescuento();
        curso2.calcularDescuento();
    }
}
