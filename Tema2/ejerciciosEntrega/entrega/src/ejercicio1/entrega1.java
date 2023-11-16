package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class entrega1 {
    public static void main(String[] args) {
        try {
            /*Creacion de un objeto File */
            File file = new File("C:\\Users\\Brand\\OneDrive\\Documentos\\AccesoDatos\\Tema2\\ejerciciosEntrega\\entrega\\src\\ejercicio1\\calculanumeros.txt");

            /*Para leer el contenido de un archivo BufferedReder o FileInputStream*/
            BufferedReader br = new BufferedReader(new FileReader(file));

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] numeros= linea.split(" ");//utiliza para dividir una cadena en subcadenas
                double suma = 0;

                for(String num : numeros){
                    suma += Integer.parseInt(num);
                }
                System.out.println("La suma de los numeros seria: " + suma/14);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
