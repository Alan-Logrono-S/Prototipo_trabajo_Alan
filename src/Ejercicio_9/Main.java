package Ejercicio_9;

public class Main {
    public static void main(String [] args){
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
        cuentaBancaria1.setTitular("INTERBANCO PLUS");
        cuentaBancaria1.setSaldo(1000.50);

        System.out.println("Cuenta Bancaria: " + cuentaBancaria1.getTitular());
        System.out.println("Saldo: " + cuentaBancaria1.getSaldo());


    }
}
