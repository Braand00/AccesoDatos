package entregaEjerciciosBrando.ejercicio10NoEntregar;

// Definición de la interfaz Impresora
interface Impresora {
    void imprimir(String texto);
    int getVelocidad();

    default boolean esMasRapida(Impresora otra) {
        return this.getVelocidad() > otra.getVelocidad();
    }
}


