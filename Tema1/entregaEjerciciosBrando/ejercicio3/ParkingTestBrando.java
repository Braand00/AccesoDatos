package entregaEjerciciosBrando.ejercicio3;

public class ParkingTestBrando {
    

    public static void main(String[] args) {
        try {
        System.out.println("Inicio Parking test");
        Vehiculo coche1 = new Vehiculo("12545KML");
        ParkingVehiculo orcasitasParking = new ParkingVehiculo("Parking Orcasitas");
        orcasitasParking.aparcaCoche(coche1);
        orcasitasParking.sacaCoche(coche1);
        
        double dFactura =  orcasitasParking.getFactura(coche1);
        System.out.println(coche1 + " ; Factura: " + dFactura);
        
        int numeroPlaza = orcasitasParking.numPlaza;
        System.out.println("numero de plazas : " + numeroPlaza);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
