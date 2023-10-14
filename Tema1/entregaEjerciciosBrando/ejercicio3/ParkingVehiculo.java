package entregaEjerciciosBrando.ejercicio3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class ParkingVehiculo implements Parking{

    private ArrayList<Vehiculo> listaVehiculos;
    public String direccion = "";
    private int plazasOcup = 0;
    private final double precioMinuto = 0.0425; 
    final int numPlaza = 100;

    int contador = plazasOcup;


public ParkingVehiculo (String direccion){
    this.direccion = direccion;
    this.listaVehiculos = new ArrayList<>();
}

    public boolean hayPlaza(int plazasOcup , int numPlaza){
        if(plazasOcup > numPlaza){
            return false;
        }else{
            return true;
        }
        
    }

    public void aparcaCoche(Vehiculo vehiculo){
        if(plazasOcup < numPlaza){
        listaVehiculos.add(vehiculo);
        contador++;
        vehiculo.setFechaInicio(LocalDateTime.now());
        }else {
            System.out.println("El parking está lleno. No se puede estacionar el coche.");
        } 
    }

    public void sacaCoche(Vehiculo vehiculo){
        listaVehiculos.remove(vehiculo);
        contador--;
        vehiculo.setFechaFin(LocalDateTime.now().plusHours(1));
    }

    public int numeroCoches(Vehiculo vehiculo){
        return listaVehiculos.size();
    }
   
    public double getFactura(Vehiculo vehiculo){
      return (vehiculo.getFechaInicio().until(vehiculo.getFechaFin(),ChronoUnit.MINUTES)) * precioMinuto;
    }
}
