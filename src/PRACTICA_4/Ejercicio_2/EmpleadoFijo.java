package PRACTICA_4.Ejercicio_2;

public class EmpleadoFijo extends Empleado {
    private double sueldoBase;

    public EmpleadoFijo(double sueldoBase){
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase;
    }
}
