package PRACTICA_2.Ejercicio_4;

public class Main {
    public static void main(String [] args){
        Agenda agenda1 = new Agenda();

        double resultado1 = agenda1.sumar(1.4,5.6);
        double resultado2 = agenda1.sumar(1.2,3.4,4.6);

        agenda1.agendar("Juan");
        agenda1.agendar("Pepe","098127632");
        System.out.println("Resultado Calculo 1 = "+ resultado1);
        System.out.println("Resultado Calculo 2 = "+ resultado2);
    }
}
