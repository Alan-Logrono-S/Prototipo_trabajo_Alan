package PRACTICA_5.Ejercicio_2;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        if (!validarNombre(nombre)) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        this.nombre = nombre;
    }

    public boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    public abstract double calcularSalario();

    public abstract void mostrarDatos();
}
