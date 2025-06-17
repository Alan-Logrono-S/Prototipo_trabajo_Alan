package PRACTICA_5.Ejercicio_1;

public class CursoRegular extends Curso {
    private double costoBase;

    public CursoRegular(String nombre, double costoBase) {
        super(nombre);
        this.costoBase = costoBase;
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }
}
