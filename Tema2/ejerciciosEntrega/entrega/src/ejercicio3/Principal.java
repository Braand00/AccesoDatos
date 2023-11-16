package ejercicio3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner consola = new Scanner(System.in);

        // Ruta del archivo de agenda
        String nombreRuta = "ejerciciosEntrega\\entrega\\src\\ejercicio3\\agenda.txt";

        // FileWriter y BufferedReader inicializados a null
        FileWriter escribir = null;
        BufferedReader br = null;

        // Contador de contactos
        int contadorContactos = 0;

        try {
            // Crear FileWriter para escribir en el archivo, con la opción de agregar al final (true)
            escribir = new FileWriter(nombreRuta, true);

            // Crear BufferedReader para leer el archivo de la ruta especificada
            br = new BufferedReader(new FileReader(nombreRuta));

            // Menú principal
            int menu = 0;
            boolean salirMenu = false;

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
                        if (contadorContactos >= 20) {
                            System.out.println("Se alcanzó el número máximo de contactos");
                        } else {
                            // Verificar si el contacto ya existe
                            boolean contactoExistente = false;
                            System.out.println("Introduce el nombre: ");
                            String nombre = consola.nextLine();

                            // Recorre las líneas del archivo para verificar la existencia del contacto
                            BufferedReader comprobarContacto = new BufferedReader(new FileReader(nombreRuta));
                            while ((lineas = comprobarContacto.readLine()) != null) {
                                if (lineas.split(" ")[0].equalsIgnoreCase(nombre)) {
                                    contactoExistente = true;
                                    break;
                                }
                            }

                            // Si el contacto no existe, agregarlo
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
                        break;

                    case 2:
                        System.out.println("Indique las letras para iniciar la búsqueda:");
                        String busqueda = consola.nextLine();
                        ArrayList<String> nombreAlmacenado = new ArrayList<>();
                        // Buscar coincidencias en el archivo y almacenar los nombres
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
                        // Mostrar los nombres encontrados
                        System.out.println("Los nombres con la búsqueda son:");
                        for (String nombre : nombreAlmacenado) {
                            System.out.println(nombre);
                        }
                        break;

                    case 3:
                        // Mostrar todos los contactos en el archivo
                        while ((lineas = br.readLine()) != null) {
                            String[] numLineas = lineas.split(" ");
                            System.out.println(Arrays.toString(numLineas));
                        }
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
        } catch (IOException e) {
            // Manejo de excepciones en caso de error de entrada/salida
            e.printStackTrace();
        } finally {
            // Cerrar FileWriter y BufferedReader al finalizar
            if (escribir != null) {
                escribir.close();
            }
            if (br != null) {
                br.close();
            }
        }
    }
}
