package PRACTICA_5.Ejercicio_2;

public class EmpleadoPorComision extends Empleado {
    private double ventas;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre, double ventas, double porcentajeComision) {
        super(nombre);
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }
    @Override
    public double calcularSalario() {
        return ventas + (ventas * porcentajeComision / 100);
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Empleado por Comisión: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
    public void aplicarBono() {
        if (ventas > 1000) {
            ventas += 200;
            System.out.println("Bono aplicado por ventas altas: +$200");
        } else {
            System.out.println("No aplica bono.");
        }
    }
}
