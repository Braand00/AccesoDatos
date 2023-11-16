package ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.ejecutar();
    }

    Scanner scanner = new Scanner(System.in);
    int opcion; // Declaración de la variable 'opcion'

    // Ruta del archivo.txt
    final String nombreRuta = "Tema2\\ejerciciosEntrega\\entrega\\src\\ejercicio5\\Clientes.txt";

    // FileWriter y BufferedReader inicializados a null
    FileWriter escribir = null;
    BufferedReader br = null;

    public void ejecutar() {
        try {
            // Creamos un objeto FileWriter para escribir en el archivo, con la opción de agregar al final (true)
            escribir = new FileWriter(nombreRuta, true);

            // Creamos un objeto BufferedReader para leer el archivo de la ruta especificada
            br = new BufferedReader(new FileReader(nombreRuta));

            Metodo metodo = new Metodo();

            do {
                // Menú principal y switch...
                System.out.println("Menú Principal:");
                System.out.println("1. Alta Cliente");
                System.out.println("2. Baja Cliente");
                System.out.println("3. Listar Clientes por Saldo (mayor a menor)");
                System.out.println("4. Saldo Medio de Clientes");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                // Aseguramos que se ingrese un número válido
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next();
                }

                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                switch (opcion) {
                    case 1:
                        metodo.altaCliente(scanner);
                        break;

                    case 2:
                        metodo.bajaCliente(scanner);
                        break;

                    case 3:
                        metodo.listarClientesPorSaldo();
                        break;

                    case 4:
                        metodo.saldoMedioClientes();
                        break;

                    case 5:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (opcion != 5);

            // Cerrar el scanner al finalizar
            scanner.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Cerrar recursos al finalizar
            try {
                if (br != null) br.close();
                if (escribir != null) escribir.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }
}
