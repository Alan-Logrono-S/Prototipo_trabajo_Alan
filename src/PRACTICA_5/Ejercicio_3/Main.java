package PRACTICA_5.Ejercicio_3;

public class Main {
    public static void main(String[] args) {

        Taxi taxi = new Taxi();
        Patineta patineta = new Patineta();

        taxi.iniciarViaje();
        patineta.iniciarViaje();

        taxi.registrarRuta("Av. Quito", "08:00");
        patineta.registrarRuta("Parque Central");
        taxi.registrarRuta("", "08:00");


        double d1 = taxi.calcularDistancia(40, 0.5);
        double d2 = patineta.calcularDistancia(15, 0.3);

        System.out.println("Distancia estimada en taxi: " + d1 + " km");
        System.out.println("Distancia estimada en patineta: " + d2 + " km");
    }
}
