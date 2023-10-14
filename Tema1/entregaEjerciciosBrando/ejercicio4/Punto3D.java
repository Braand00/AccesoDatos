package entregaEjerciciosBrando.ejercicio4;

public class Punto3D extends Punto{
    //Atributo
    private int coordenadaZ;
    //Contructor con super de la clase padre
    public Punto3D(int coordenadaX , int coordenadaY , int coordenadaZ){
        super(coordenadaX, coordenadaY);
        this.coordenadaZ = coordenadaZ;
        distancia(null);
    }
    
      public int getCoordenadaZ() {
        return coordenadaZ;
    }

    public void setCoordenadaZ(int coordenadaZ) {
        this.coordenadaZ = coordenadaZ;
    }

    
    @Override
    public String toString() {
        return "Punto3D [coordenadaZ=" + coordenadaZ + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + "]";
    }
    

    public double distancia(Punto otroPunto3D){
        int difX = otroPunto3D.getCoordenadaX() * this.getCoordenadaX();
        int dify = otroPunto3D.getCoordenadaY() * this.getCoordenadaY();
        int difZ = coordenadaZ  - coordenadaZ;
        return Math.sqrt(difX * difX + dify * dify + difZ * difZ);
    }

}
