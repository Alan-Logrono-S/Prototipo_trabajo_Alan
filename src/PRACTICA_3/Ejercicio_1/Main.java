package PRACTICA_3.Ejercicio_1;

public class Main {
    public static void main(String [] args){
        Perro perro = new Perro();
        Gato gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();

        Animal[] animales = {new Perro(),new Gato()};

    }
}
