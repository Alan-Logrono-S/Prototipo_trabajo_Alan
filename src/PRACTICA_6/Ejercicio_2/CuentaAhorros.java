package PRACTICA_6.Ejercicio_2;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteres) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        double interes = saldo * (tasaInteres / 100);
        saldo += interes;
    }

    @Override
    public void mostrarDatos() {
        aplicarInteres();
        System.out.println("--- Cuenta de Ahorros ---");
        super.mostrarDatos();
        System.out.println("Interés aplicado: " + tasaInteres + "%");
    }
}
