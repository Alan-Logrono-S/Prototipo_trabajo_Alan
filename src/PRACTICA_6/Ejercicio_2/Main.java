package PRACTICA_6.Ejercicio_2;

public class Main {
    public static void main(String[] args) {

        CuentaAhorros ahorro = new CuentaAhorros("001A", 1000, 2);
        ahorro.mostrarDatos();

        System.out.println();

        try {
            CuentaCorriente corriente = new CuentaCorriente("", 500, 200);
            corriente.mostrarDatos();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
