package ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Uso de try-with-resources para garantizar que los recursos se cierren adecuadamente
        try (Scanner consola = new Scanner(System.in)) {
            // Ruta del archivo de registro de temperaturas
            final String nombreRuta = "Tema2\\ejerciciosEntrega\\entrega\\src\\ejercicio4\\meteo.txt";

            // Try-with-resources para FileWriter y BufferedReader
            try (FileWriter escribir = new FileWriter(nombreRuta, true);
                 BufferedReader br = new BufferedReader(new FileReader(nombreRuta))) {

                int menu = 0;
                do {
                    // Menú principal
                    System.out.println("1-Registrar nueva Temperatura");
                    System.out.println("2-Mostrar Historial de registro");
                    System.out.println("3-Mostrar media de Temperatura");
                    System.out.println("4-Salir");
                    menu = consola.nextInt();
                    consola.nextLine(); // Consumir el salto de línea pendiente

                    // Switch para manejar las opciones del menú
                    switch (menu) {
                        case 1:
                            registrarTemperatura(consola);
                            break;

                        case 2:
                            mostrarHistorial(consola, br);
                            break;

                        case 3:
                            mediaTemperatura(br, consola);
                            break;

                        case 4:
                            System.out.println("Saliendo del programa. ¡Hasta luego!");
                            break;

                        default:
                            System.out.println("Opcion Invalida");
                    }
                } while (menu != 4);
            } catch (IOException e) {
                // Manejo de excepciones en caso de error de entrada/salida
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    // Método para registrar temperatura
    public static void registrarTemperatura(Scanner consola) {
        try {
            // Solicitar información al usuario
            System.out.println("Dame la ciudad");
            String ciudad = consola.nextLine();
            System.out.println("Dame la fecha");
            String fecha = consola.nextLine();
            System.out.println("Dame Tem Maxima");
            int temMax = consola.nextInt();
            System.out.println("Dame Tem Minima");
            int temMin = consola.nextInt();
            consola.nextLine(); // Consumir el salto de línea pendiente

            // Escribir los datos en el archivo
            FileWriter escribir = new FileWriter("Tema2\\ejerciciosEntrega\\entrega\\src\\ejercicio4\\meteo.txt", true);
            escribir.write(ciudad + " " + fecha + " " + temMax + " " + temMin + "\n");
            escribir.close();

            System.out.println("Datos registrados exitosamente.");
        } catch (IOException e) {
            // Manejo de excepciones en caso de error de entrada/salida
            System.err.println("Error al registrar la temperatura: " + e.getMessage());
        }
    }

    // Método para mostrar el historial de temperatura de una ciudad
    public static void mostrarHistorial(Scanner consola, BufferedReader br) throws IOException {
        // Solicitar el nombre de la ciudad al usuario
        System.out.println("Dame el nombre de la ciudad");
        String ciudad = consola.nextLine();

        String linea;
        while ((linea = br.readLine()) != null) {
            // Dividir la línea en partes utilizando el espacio como delimitador
            String[] datosCiudad = linea.split(" ");

            if (datosCiudad.length > 0 && datosCiudad[0].equalsIgnoreCase(ciudad)) {
                // Mostrar el historial para la ciudad especificada
                System.out.println("Historial para la ciudad: " + ciudad);

                // Imprimir cada dato asociado a la ciudad actual
                for (String dato : datosCiudad) {
                    System.out.println(dato);
                }
            }
        }

        // Mensaje en caso de que no se encuentre historial para la ciudad
        System.out.println("No se encontró historial para la ciudad: " + ciudad);
    }

    // Método para calcular la media de temperatura
    public static void mediaTemperatura(BufferedReader br, Scanner consola) throws IOException {
        // Solicitar el nombre de la ciudad al usuario
        System.out.println("Dame el nombre de la ciudad para calcular la media de la temperatura");
        String ciudad = consola.nextLine();

        // Variables para almacenar datos de temperatura
        int vueltaTemMaxima = 0;
        int vueltaTemMinima = 0;
        int suma = 0;
        int contador = 0;

        String linea;

        // Leer el archivo línea por línea
        while ((linea = br.readLine()) != null) {
            // Dividir la línea en partes utilizando el espacio como delimitador
            String[] datosCiudad = linea.split(" ");

            if (datosCiudad.length > 0 && datosCiudad[0].equalsIgnoreCase(ciudad)) {
                // Sumar las temperaturas máxima y mínima
                vueltaTemMaxima += Integer.parseInt(datosCiudad[2]);
                vueltaTemMinima += Integer.parseInt(datosCiudad[3]);
                suma = vueltaTemMaxima + vueltaTemMinima;
                contador++;
            }
        }

        // Calcular y mostrar la media de temperatura
        if (contador > 0) {
            suma = vueltaTemMaxima + vueltaTemMinima;
            System.out.println("La media de temperatura es " + (double) suma / contador);
        } else {
            System.out.println("No hay datos para la ciudad");
        }
    }
}
