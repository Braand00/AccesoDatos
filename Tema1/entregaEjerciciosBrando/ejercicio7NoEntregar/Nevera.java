package entregaEjerciciosBrando.ejercicio7NoEntregar;

public class Nevera extends Electrodomestico {
    double capFrigorifico;
    double capaCongelador;
    double sonoridadDecibelios;

    public Nevera(double capaFrigorifico , double capaCongelador){
        this.capFrigorifico= 300;
        this.capaCongelador= 200;
    }

    public Nevera(String marca , String modelo , double precio,  double capacidadFrigorifico , double capacidadCongelador ){
        super(marca, modelo, precio);
        this.capaCongelador = capacidadCongelador;
        this.capFrigorifico = capacidadFrigorifico;
    }

    
    public double consumoAnual() {
        double consumoSuperClase = super.consumoAnual();
        if (this.capFrigorifico > 300 || this.capaCongelador > 200) {
        } else {
            return consumoSuperClase + 50;
        }
        return consumoSuperClase;
    }

    public double getCapFrigorifico() {
        return capFrigorifico;
    }

    public void setCapFrigorifico(double capFrigorifico) {
        this.capFrigorifico = capFrigorifico;
    }

    public double getCapaCongelador() {
        return capaCongelador;
    }

    public void setCapaCongelador(double capaCongelador) {
        this.capaCongelador = capaCongelador;
    }

    public double getSonoridadDecibelios() {
        return sonoridadDecibelios;
    }

    public void setSonoridadDecibelios(double sonoridadDecibelios) {
        this.sonoridadDecibelios = sonoridadDecibelios;
    }

    @Override
    public String toString() {
        return "Nevera [capFrigorifico=" + capFrigorifico + ", capaCongelador=" + capaCongelador
                + ", sonoridadDecibelios=" + sonoridadDecibelios + " Marca: "+ this.getMarca() + " Modelo: "+ this.getModelo() + " Precio: "+ this.getPrecio()+"]";
    }
}
