package PRACTICA_6.Ejercicio_3;

public class Camion extends Vehiculo {

    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarTipo() {
        super.mostrarInformacionBase();
        System.out.println("Tipo: Vehículo pesado");
    }
}

