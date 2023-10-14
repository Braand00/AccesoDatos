package entregaEjerciciosBrando.ejercicio10NoEntregar;

class ImpresoraLaser implements Impresora {
    private int velocidad;

    ImpresoraLaser(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimiendo en Impresora Láser: " + texto);
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}