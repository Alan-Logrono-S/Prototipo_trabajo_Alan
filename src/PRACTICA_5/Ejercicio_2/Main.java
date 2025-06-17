package PRACTICA_5.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        try {
            EmpleadoFijo e1 = new EmpleadoFijo("Luis", 500, 6);
            EmpleadoPorComision e2 = new EmpleadoPorComision("María", 1000, 10);

            e1.mostrarDatos();
            e2.mostrarDatos();

            e1.aplicarBono();
            e2.aplicarBono();

            System.out.println("Salario con bono (Luis): $" + e1.calcularSalario());
            System.out.println("Salario con bono (María): $" + e2.calcularSalario());

            EmpleadoFijo e3 = new EmpleadoFijo("", 400); // lanza excepción

        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
