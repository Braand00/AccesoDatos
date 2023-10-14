package entregaEjerciciosBrando.ejercicio10NoEntregar;

public class ImpresoraTest {
    public static void main(String[] args) {
        Impresora impresora1 = new ImpresoraLaser(55);
        Impresora impresora2 = new ImpresoraTinta(20);

        if (impresora1.esMasRapida(impresora2)) {
            System.out.println("La impresora láser es más rápida que la de tinta");
        } else {
            System.out.println("La impresora de tinta es más rápida que la láser");
        }
    }
}