package PRACTICA_1.Ejercicio_12;

public class Cliente {
    public int codigoCliente;
    public boolean activo=true;
    private String nombre="";
    private String telefono="";

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public void verCliente(){
        System.out.println("Codigo del Cliente: "+ codigoCliente);
        System.out.println("Activo: "+activo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Telefono: "+telefono);
    }
}
