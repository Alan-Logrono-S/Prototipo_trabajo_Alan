package PRACTICA_4.Ejercicio_1;

public class Main {
    public static void main(String [] args){
        Cuadrado cuadrado = new Cuadrado(4);
        Triangulo triangulo = new Triangulo(5,3);

        System.out.println("Area del Cuadrado: "+ cuadrado.calcularArea());
        System.out.println("Area del Triangulo: "+ triangulo.calcularArea());
    }
}
