package PRACTICA_4.Ejercicio_5;

public class Estudiante {
    private double nota;

    public void setNota(double nota) {
        if (nota> 0 && nota <10){
            this.nota = nota;
            System.out.println("Nota valida Registrada: "+ nota);
        }
        else {
            System.out.println("ERROR: Nota fuera de rango");
        }
    }

    public double getNota() {
        return nota;
    }
}
