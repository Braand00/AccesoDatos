package entregaEjerciciosBrando.ejercicio10NoEntregar;

// Implementación de la Impresora de Tinta
class ImpresoraTinta implements Impresora {
    private int velocidad;

    ImpresoraTinta(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimiendo en Impresora de Tinta: " + texto);
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}