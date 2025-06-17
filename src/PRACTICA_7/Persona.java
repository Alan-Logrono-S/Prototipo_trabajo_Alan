package PRACTICA_7;

public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Error: El nombre no puede estar vacío.");
        }
        if (edad < 18) {
            throw new IllegalArgumentException("Error: La edad debe ser mayor o igual a 18.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void mostrarDatos();
}

