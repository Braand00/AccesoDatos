package entregaEjerciciosBrando.ejercicio9NoEntregar;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        //HOLA
    }

    @Override
    public void calcuarArea() {
        this.total = (base * altura) / 2;
    }
}