package PRACTICA_5.Ejercicio_2;

public class EmpleadoFijo extends Empleado {
    private double salarioBase;
    private int aniosAntiguedad;

    public EmpleadoFijo(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = 0;
    }
    public EmpleadoFijo(String nombre, double salarioBase, int aniosAntiguedad) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }
    @Override
    public double calcularSalario() {
        return salarioBase;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Empleado Fijo: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
    public void aplicarBono() {
        if (aniosAntiguedad > 5) {
            salarioBase += 100;
            System.out.println("Bono aplicado por antigüedad: +$100");
        } else {
            System.out.println("No aplica bono.");
        }
    }
}

