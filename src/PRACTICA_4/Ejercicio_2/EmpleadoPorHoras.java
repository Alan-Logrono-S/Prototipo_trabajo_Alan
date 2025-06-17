package PRACTICA_4.Ejercicio_2;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras (int horasTrabajadas, double tarifaPorHora){
        this.horasTrabajadas=horasTrabajadas;
        this.tarifaPorHora=tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
