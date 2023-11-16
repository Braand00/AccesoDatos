package ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) throws IOException {
        Scanner consola = new Scanner(System.in);
        String nombreRuta = "Tema2\\ejerciciosEntrega\\entrega\\src\\ejercicio3\\agenda.txt";
        FileWriter escribir = new FileWriter(nombreRuta, true);
        BufferedReader br = new BufferedReader(new FileReader(nombreRuta));
        int menu = 0;
        boolean salirMenu = false;
        int contadorContactos = 0;

        try {
            while (!salirMenu) {
                System.out.println("Elige la siguiente opción:");
                System.out.println("1 - Nuevo Contacto");
                System.out.println("2 - Buscar por nombre");
                System.out.println("3 - Mostrar todos");
                System.out.println("4 - Salir");

                menu = consola.nextInt();
                consola.nextLine(); // Consumir el salto de línea pendiente

                switch (menu) {
                    case 1:
                        agregarNuevoContacto(consola, nombreRuta, escribir, br, contadorContactos);
                        salirMenu = true;
                        break;
                    case 2:
                        buscarPorNombre(consola, nombreRuta);
                        break;
                    case 3:
                        mostrarTodos(br);
                        salirMenu = true;
                        break;
                    case 4:
                        salirMenu = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            escribir.close();
            br.close();
        }
    }

    private static void agregarNuevoContacto(Scanner consola, String nombreRuta, FileWriter escribir, BufferedReader br, int contadorContactos) throws IOException {
        if (contadorContactos >= 20) {
            System.out.println("Se alcanzó el número máximo de contactos");
        } else {
            boolean contactoExistente = false;
            System.out.println("Introduce el nombre: ");
            String nombre = consola.nextLine();
            BufferedReader comprobarContacto = new BufferedReader(new FileReader(nombreRuta));
            String lineas;
            while ((lineas = comprobarContacto.readLine()) != null) {
                if (lineas.split(" ")[0].equalsIgnoreCase(nombre)) {
                    contactoExistente = true;
                    break;
                }
            }
            if (!contactoExistente) {
                System.out.println("Introduce el teléfono: ");
                int telefono = consola.nextInt();
                consola.nextLine(); // Consumir el salto de línea pendiente
                escribir.write(nombre + " " + telefono + "\n");
                contadorContactos++;
                System.out.println("Contacto añadido");
            } else {
                System.out.println("Contacto ya existe");
            }
        }
    }

    private static void buscarPorNombre(Scanner consola, String nombreRuta) throws IOException {
        System.out.println("Indique las letras para iniciar la búsqueda:");
        String busqueda = consola.nextLine();
        ArrayList<String> nombreAlmacenado = new ArrayList<>();
        BufferedReader busquedaContacto = new BufferedReader(new FileReader(nombreRuta));
        String linea;
        while ((linea = busquedaContacto.readLine()) != null) {
            String[] numLineas = linea.split(" ");
            for (String numLinea : numLineas) {
                if (numLinea.toLowerCase().startsWith(busqueda.toLowerCase())) {
                    nombreAlmacenado.add(numLinea);
                }
            }
        }
        System.out.println("Los nombres con la búsqueda son:");
        for (String nombre : nombreAlmacenado) {
            System.out.println(nombre);
        }
    }

    private static void mostrarTodos(BufferedReader br) throws IOException {
        String lineas;
        while ((lineas = br.readLine()) != null) {
            String[] numLineas = lineas.split(" ");
            System.out.println(Arrays.toString(numLineas));
        }
    }
}
