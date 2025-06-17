package PRACTICA_2.Ejercicio_4;

public class Agenda {
    public double sumar(double a,double b){return a+b;};
    public double sumar(double a,double b, double c){return a+b+c;}
    public void agendar(String nombre){
        System.out.println("Nombre a Agendar: "+nombre);
    }
    public void agendar(String nombre, String telefono){
        System.out.println("Nombre a Agendar: "+nombre+
                " Telefono: "+telefono);
    }
}
