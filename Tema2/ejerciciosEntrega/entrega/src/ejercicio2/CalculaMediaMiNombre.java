package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CalculaMediaMiNombre {
    public static void main(String[] args) throws FileNotFoundException {
          /*Creacion de un objeto File */
        File f=new File("Tema2\\ejerciciosEntrega\\entrega\\src\\ejercicio2\\jugadores.txt");
        
        /*Para leer el contenido de un archivo BufferedReder o FileInputStream*/
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String lineas;
            int vueltaEdad = 0;
            double vueltaAltura = 0;
            int contador = 0;

            while ((lineas = br.readLine()) != null){
                String[] columna = lineas.split(" ");// Divide la línea en un arreglo de cadenas usando el espacio (" ")

                vueltaEdad += Integer.parseInt(columna[1]);//Convierte de String a entero
                vueltaAltura += Double.parseDouble(columna[2]);//Convierte de Strin a double
            
                contador++;

            }
            System.out.println("suma: " + vueltaEdad /contador);
             System.out.println("suma: " + vueltaAltura /contador);

        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
           
        }
        

    }
}
