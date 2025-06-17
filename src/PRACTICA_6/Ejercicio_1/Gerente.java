package PRACTICA_6.Ejercicio_1;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, int edad, double salario, double bono) {
        super(nombre, edad, salario);
        if (salario > 800) {
            this.bono = bono;}
        else {
            this.bono = 0;
            System.out.println("Advertencia: Bono no aplicado, salario insuficiente.");
        }
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        if (bono > 0) {
            System.out.println("Bono: $" + bono);}
        else {
            System.out.println("Bono: No asignado");
        }
    }
}

