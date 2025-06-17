package PRACTICA_3.Ejercicio_3;

public class Main {
    public static void main(String [] args){

        Gerente gerente = new Gerente();
        Asistente asistente= new Asistente();

        gerente.mostrarInfo();
        asistente.mostrarInfo();

        Empleado [] personal = {new Gerente(), new Asistente()};

    }
}
