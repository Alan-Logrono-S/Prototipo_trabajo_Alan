package PRACTICA_5.Ejercicio_3;

public abstract class Transporte {
    protected String direccion;
    protected String hora;

    public abstract void iniciarViaje();

    public void registrarRuta(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            System.out.println("Error: dirección inválida");
            return;}
        this.direccion = direccion;
        System.out.println("Ruta registrada: " + direccion);}

    public void registrarRuta(String direccion, String hora) {
        if (direccion == null || direccion.trim().isEmpty()) {
            System.out.println("Error: dirección inválida");
            return;}
        this.direccion = direccion;
        this.hora = hora;
        System.out.println("Ruta registrada: " + direccion + " a las " + hora);}

    public double calcularDistancia(double velocidad, double tiempoHoras) {
        return velocidad * tiempoHoras;}
}

