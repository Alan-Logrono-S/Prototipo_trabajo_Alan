package PRACTICA_1.Ejercicio_11;

public class Vehiculo {
    public String tipo = "Automovil";
    public int velocidadMaxima;
    private String placa ="";
    private String marca = "Toyota";

    public void setPlaca(String placa) {this.placa = placa;}

    public void mostrarInfo(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Velocidad Maxima: "+ velocidadMaxima);
        System.out.println("Placa: "+ placa);
        System.out.println("Marca: " + marca);
    }

}
