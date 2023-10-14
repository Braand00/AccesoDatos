package entregaEjerciciosBrando.ejercicio5NoEntregar;

import java.util.Scanner;

public class PersonaTest {
    public static void main(String[] args) {
        try {
            Scanner consola = new Scanner(System.in);
            System.out.println("Dame el nombre: ");
            String nombre = consola.nextLine();
            System.out.println("Dame tu Edad: ");
            int edad = Integer.parseInt(consola.nextLine());
            System.out.println("Dame tu dni Para validar la Letra: ");
            int dni = Integer.parseInt(consola.nextLine());
            System.out.println("Dame tu sexo: ");
            char sexo = consola.nextLine().charAt(0);
            System.out.println("Dame tu peso: ");
            double peso = Double.parseDouble(consola.nextLine());
            System.out.println("Dame tu altura: ");
            double altura = Double.parseDouble(consola.nextLine());

            // Crear un objeto Persona con los datos anteriores
            Persona persona = new Persona(nombre, edad, dni, sexo, peso, altura);
            System.out.println("IMC de " + persona.getNombre() + " es " + persona.calcularIMC());
            persona.validaDNI(); // Imprime el DNI correctamente

            // Crear un objeto Persona con el nombre, edad y sexo anterior
            Persona persona2 = new Persona("Victor", 25, 'H');
            persona2.setAltura(150);
            persona2.setPeso(56);
            System.out.println("IMC de " + persona2.getNombre() + " es " + persona2.calcularIMC());
            persona2.validaDNI(); // Imprime el DNI correctamente

            // Crear un objeto Persona con el constructor por defecto y asignar valores con setters
            Persona persona3 = new Persona();
            persona3.setNombre("Maria");
            persona3.setEdad(40);
            persona3.setSexo('M');
            persona3.setPeso(55);
            persona3.setAltura(165);
            persona3.generarDni(); // Genera el DNI
            System.out.println("IMC de " + persona3.getNombre() + " es " + persona3.calcularIMC());
            persona3.validaDNI(); // Imprime el DNI correctamente

            consola.close(); // Cierra el objeto Scanner cuando ya no se necesita
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
