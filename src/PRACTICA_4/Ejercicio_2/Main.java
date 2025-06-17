package PRACTICA_4.Ejercicio_2;

public class Main {
    public static void main(String [] args){
        EmpleadoFijo empleadoFijo = new EmpleadoFijo(600);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(40,5);

        System.out.println("Salario Fijo: "+ empleadoFijo.calcularSalario());
        System.out.println("Salario por Horas: "+ empleadoPorHoras.calcularSalario());
    }
}
