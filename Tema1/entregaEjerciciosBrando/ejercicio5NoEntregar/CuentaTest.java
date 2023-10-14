package entregaEjerciciosBrando.ejercicio5NoEntregar;

public class CuentaTest {
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Cuenta
        try {
            Cuenta cuenta1 = new Cuenta("12345678A", "Juan Perez", "ES1234567890123456789012", 1000);
            Cuenta cuenta2 = new Cuenta("87654321B", "Maria Lopez", "ES2109876543210987654321", 500);

            cuenta1.mostrarSaldo();
            cuenta1.ingresarDinero(500);
            cuenta1.sacarDinero(200);
            cuenta1.mostrarSaldo();

            cuenta2.mostrarSaldo();
            cuenta1.transferencia(cuenta2, 300);
            cuenta2.mostrarSaldo();

            cuenta1.cambioTitular("Pedro Martinez");
            System.out.println("Nuevo titular de cuenta1: " + cuenta1.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}