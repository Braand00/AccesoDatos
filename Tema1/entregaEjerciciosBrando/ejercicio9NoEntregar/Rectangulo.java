package entregaEjerciciosBrando.ejercicio9NoEntregar;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcuarArea() {
        this.total = base * altura;
    }
}
