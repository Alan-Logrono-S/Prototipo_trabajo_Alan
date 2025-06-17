package PRACTICA_7;

public class Main {
    public static void main(String[] args) {
        try {
            EstudianteBecado est1 = new EstudianteBecado("Luis", 20, "Sistemas", 9.2, "Académica");
            EstudianteBecado est2 = new EstudianteBecado("Ana", 19, "Derecho", 8.0, "Económica");

            System.out.println("Estudiante 1:");
            est1.mostrarDatos();
            est1.aplicarDescuento();

            System.out.println("\nEstudiante 2:");
            est2.mostrarDatos();
            est2.aplicarDescuento();

            est1.inscribir("2025-A");
            est2.inscribir("2025-B", "Virtual");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

