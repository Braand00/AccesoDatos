package entregaEjerciciosBrando.ejercicio1;

public class complejoTest {
    public static void main(String[] args) {
        complejo numero1 = new complejo(0, 0);
        
        numero1.asignar(2.5, 5.5);
        numero1.sumar(numero1, numero1);
        numero1.imprimir();
    }
}
