package PRACTICA_6.Ejercicio_2;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        if (numeroCuenta == null || numeroCuenta.isEmpty()) {
            throw new IllegalArgumentException("Error: Número de cuenta inválido.");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}
