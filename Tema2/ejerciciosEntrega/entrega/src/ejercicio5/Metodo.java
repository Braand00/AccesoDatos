package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class Metodo {
    private List<Clientes> clientes = new ArrayList<>();

    // Método para dar de alta a un cliente
    public void altaCliente(Scanner scanner) {
        System.out.println("Ingrese el DNI del cliente:");
        String dni = scanner.nextLine();
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del cliente (dd/MM/yyyy):");
        String fechaNacimiento = scanner.nextLine();
        System.out.println("Ingrese el saldo del cliente:");
        double saldo = Double.parseDouble(scanner.nextLine());

        Clientes nuevoCliente = new Clientes(dni, nombre, fechaNacimiento, saldo);
        clientes.add(nuevoCliente);
        System.out.println("Cliente dado de alta correctamente.");

        // Guardamos la lista actualizada en el archivo
        guardarClientesEnArchivo();
    }

    // Método para dar de baja a un cliente
    public void bajaCliente(Scanner scanner) {
        System.out.println("Ingrese el DNI del cliente a dar de baja:");
        String dni = scanner.nextLine();

        for (Clientes cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                clientes.remove(cliente);
                System.out.println("Cliente dado de baja correctamente.");

                // Guardamos la lista actualizada en el archivo
                guardarClientesEnArchivo();
                return;
            }
        }

        System.out.println("No se encontró ningún cliente con ese DNI.");
    }

    // Método para listar clientes por saldo de mayor a menor
    public void listarClientesPorSaldo() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        Collections.sort(clientes, Comparator.comparing(Clientes::getSaldo).reversed());

        System.out.println("Listado de clientes (saldo de mayor a menor):");
        for (Clientes cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    // Método para calcular el saldo medio de los clientes
    public void saldoMedioClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        double sumaSaldos = 0;
        for (Clientes cliente : clientes) {
            sumaSaldos += cliente.getSaldo();
        }

        double saldoMedio = sumaSaldos / clientes.size();
        System.out.println("El saldo medio de los clientes es: " + saldoMedio);
    }

    private void guardarClientesEnArchivo() {
        // Implementa la lógica para guardar la lista de clientes en el archivo si es necesario.
        // Puedes usar la instancia de FileWriter y el nombre del archivo proporcionado en Principal.
        // Asegúrate de manejar las excepciones adecuadamente.
    }
}