package entregaEjerciciosBrando.ejercicio3;

public interface Parking{
    void aparcaCoche(Vehiculo vehiculo);
    
    void sacaCoche(Vehiculo vehiculo);
    
    double getFactura(Vehiculo vehiculo);

    int numeroCoches(Vehiculo vehiculo);
}