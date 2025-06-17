package PRACTICA_6.Ejercicio_3;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Error: marca no puede ser nula");
        }
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInformacionBase() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public abstract void mostrarTipo();
}
