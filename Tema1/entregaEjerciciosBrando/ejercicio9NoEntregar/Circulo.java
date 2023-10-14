package entregaEjerciciosBrando.ejercicio9NoEntregar;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcuarArea() {
        this.total = Math.PI * radio * radio;
    }
}