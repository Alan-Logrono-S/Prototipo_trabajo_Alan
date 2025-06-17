package PRACTICA_5.Ejercicio_1;
public abstract class Curso {
    protected String nombre;
    public Curso(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del curso no puede estar vacío.");}
        this.nombre = nombre;}
    public abstract double calcularCosto();
    public void mostrarInfo(String nombre) {System.out.println("Curso: " + nombre);}
    public void mostrarInfo(String nombre, double costo) {System.out.println("Curso: " + nombre + " Costo: $" + costo);}
    public void calcularDescuento() {
        double costo = calcularCosto();
        if (costo > 150) {
            double descuento = costo * 0.10;
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Total con descuento: $" + (costo - descuento));
        } else {
            System.out.println("No aplica descuento. Total: $" + costo);
        }
    }
}
