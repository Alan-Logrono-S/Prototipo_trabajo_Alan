package PRACTICA_2.Ejercicio_2;

public class Mensajero {
    public void enviar (String texto)
        {System.out.println("Mensaje: "+ texto); }
    public void enviar (String texto, String destinatario){
        System.out.println("Mensaje para "+ destinatario+" "+texto);
    }
    public void enviar (String texto, String destinatario, int prioridad){
        System.out.println("Mensaje para: "+destinatario+" "+ texto+ " Prioridad: " + prioridad);
    }
}
