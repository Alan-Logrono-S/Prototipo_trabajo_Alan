package Ejercicio_10;

public class Main {
    public static void main (String [] args){
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Pepe");
        empleado1.setHorario("Matutino");
        empleado1.setSalario(500);
        empleado1.setDepartamento(empleado1.departamento);

        System.out.println("Nombre: "+ empleado1.getNombre());
        System.out.println("Horario: "+ empleado1.getHorario());
        System.out.println("Salario: "+ empleado1.getSalario());
        System.out.println("Departamento: "+ empleado1.getDepartamento());
    }
}
