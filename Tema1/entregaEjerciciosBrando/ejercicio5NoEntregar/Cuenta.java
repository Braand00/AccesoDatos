package entregaEjerciciosBrando.ejercicio5NoEntregar;

import java.util.regex.Pattern;

public class Cuenta {
    // Atributos
    String dni;
    String nombre;
    private String numCuenta;
    private double saldo;

    // Constructor
    public Cuenta(String dni, String nombre, String numCuenta, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    // Métodos
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Ingreso de " + cantidad + " realizado. Saldo actual: " + saldo);
    }

    public void sacarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para retirar " + cantidad);
        } else {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado. Saldo actual: " + saldo);
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }

    public void cambioTitular(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("El titular se ha actualizado a: " + nuevoNombre);
    }

    public void transferencia(Cuenta cuentaDestino, double importe) {
        if (importe > saldo) {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        } else {
            saldo -= importe;
            cuentaDestino.ingresarDinero(importe);
            System.out.println("Transferencia de " + importe + " realizada con éxito a la cuenta " + cuentaDestino.numCuenta);
        }
    }
    // Validación del número de cuenta bancaria utilizando una expresión regular
     boolean validarCuentaBancaria(String numCuenta) {
        String regex = "[A-Z]{2}\\d{22}";
        return Pattern.matches(regex, numCuenta);
    }

    public String getNombre() {
        return null;
    }


}
