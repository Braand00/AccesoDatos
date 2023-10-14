package entregaEjerciciosBrando.ejercicio4;

public class Punto {
    protected int coordenadaX;
    protected int coordenadaY;

    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    //metodo
    public double distancia(Punto otroPunto){
       int difX = coordenadaX - coordenadaY;
       int dify = coordenadaY - coordenadaX;
       return Math.sqrt(difX * difX + dify * dify);
    }
    //Getters and Setters
    public int getCoordenadaX() {
        return coordenadaX;
    }
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
    public int getCoordenadaY() {
        return coordenadaY;
    }
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    @Override
    public String toString() {
        return "Punto [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + "]";
    }
}
