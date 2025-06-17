package PRACTICA_5.Ejercicio_1;

public class CursoCertificado extends Curso {
    private double costoBase;
    private double recargo;

    public CursoCertificado(String nombre, double costoBase, double recargo) {
        super(nombre);
        this.costoBase = costoBase;
        this.recargo = recargo;
    }

    @Override
    public double calcularCosto() {
        return costoBase + recargo;
    }
}
