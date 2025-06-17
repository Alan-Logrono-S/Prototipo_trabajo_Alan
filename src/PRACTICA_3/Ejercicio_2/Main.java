package PRACTICA_3.Ejercicio_2;

public class Main {
    public static void main(String [] args){

        Moto moto = new Moto();
        Carro carro = new Carro();

        moto.arracar();
        carro.arracar();

        Vehiculo[] lista = {new Moto(), new Carro()};

    }
}
