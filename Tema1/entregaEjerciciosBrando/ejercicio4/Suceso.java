package entregaEjerciciosBrando.ejercicio4;

import java.util.Objects;

public class Suceso extends Punto3D {
    private String descripcion;
    private String tiempo;

    public Suceso(int coordenadaX, int coordenadaY, int coordenadaZ , String tiempo , String descripcion) {
        super(coordenadaX, coordenadaY, coordenadaZ);
        this.tiempo = tiempo;
        this.descripcion= descripcion;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Suceso)) return false;
        if (!super.equals(o)) return false;
        Suceso suceso = (Suceso) o;
        return Objects.equals(descripcion, suceso.descripcion) && Objects.equals(tiempo, suceso.tiempo);
    }
}
