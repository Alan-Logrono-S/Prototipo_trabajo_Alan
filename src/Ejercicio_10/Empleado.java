package Ejercicio_10;

public class Empleado {
    public String departamento = "Ventas";
    public String horario;
    private String nombre = "";
    private double salario = 0.0;

    public String getDepartamento() {return departamento;}
    public String getHorario() {return horario;}
    public String getNombre() {return nombre;}
    public double getSalario() {return salario;}

    public void setDepartamento(String departamento) {this.departamento = departamento;}
    public void setHorario(String horario) {this.horario = horario;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setSalario(double salario) {this.salario = salario;}
}
