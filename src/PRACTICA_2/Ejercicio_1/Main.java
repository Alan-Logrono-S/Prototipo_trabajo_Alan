package PRACTICA_2.Ejercicio_1;

public class Main {
    public static void main (String [] args){
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.sumar(5,4);
        double resultado2 = calculadora.sumar(1.5,2.5);
        int resultado3 = calculadora.sumar(1,2,3);

        System.out.println("Suma = 5 + 4 = "+resultado1);
        System.out.println("Suma = 1.5 + 2.5 = "+resultado2);
        System.out.println("Suma = 1 + 2 + 3 = "+resultado3);
    }
}
