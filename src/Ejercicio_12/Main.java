package Ejercicio_12;

public class Main {
    public static void main (String [] args){
        Cliente cliente = new Cliente();

        cliente.codigoCliente=1001;
        cliente.setNombre("Peperito");
        cliente.setTelefono("0988761524");

        cliente.verCliente();

    }
}
