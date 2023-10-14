package entregaEjerciciosBrando.ejercicio7NoEntregar;

import java.util.ArrayList;

public class ElectordTes {
    public static void main(String[] args) {
        try {
        ArrayList<Electrodomestico> listaElectrodomestico = new ArrayList<Electrodomestico>();
        listaElectrodomestico.add(new Electrodomestico("Bosch", "7200" ,400 , "Gris", 2300, 1, 3, 0.40397));
        listaElectrodomestico.add(new Nevera("Samsung", "1234", 800, 300, 200));
        listaElectrodomestico.add(new Televisor("Lg", "5678", 1500, 65));
        listaElectrodomestico.add(new Televisor("Sony", "9874", 1800, 45));

        // Recorrer el ArrayList y mostrar el consumoAnual de cada electrodoméstico
        double totalConsumoAnual = 0;
        for (int i = 0; i < listaElectrodomestico.size(); i++) {
            Electrodomestico electrodomestico = listaElectrodomestico.get(i);
            double consumoAnual = electrodomestico.consumoAnual();
             System.out.println("Consumo anual del electrodoméstico en la posición " + i + ": " + consumoAnual + " euros");
            totalConsumoAnual += consumoAnual;
}
    System.out.println("Suma total del consumo anual de todos los electrodomésticos: " + totalConsumoAnual + " euros");

        } catch (Exception e) {
          
        }
    }
}
