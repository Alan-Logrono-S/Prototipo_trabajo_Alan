package PRACTICA_2.Ejercicio_2;

public class Main {
    public static void main (String [] args){
        Mensajero mensajero = new Mensajero();

        mensajero.enviar("Hola");
        mensajero.enviar("Como estas ","PepeRito");
        mensajero.enviar("Ey, como estas ","PepeRito",1);

    }
}
