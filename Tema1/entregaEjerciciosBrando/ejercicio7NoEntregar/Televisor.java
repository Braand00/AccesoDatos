package entregaEjerciciosBrando.ejercicio7NoEntregar;

public class Televisor extends Electrodomestico {
    double resoulucion;

    public Televisor(double resoulucion){
        this.resoulucion = 65;
    }

    public Televisor(String marca , String modelo , double precio , double resoulucion){
        super(marca, modelo, precio);
        this.resoulucion = resoulucion;
    }

    public double consumoAnual(){
        double consumoSuperclase = super.consumoAnual();
        if (this.resoulucion > 50){
            return consumoSuperclase +30;
        }else{
        return consumoSuperclase;
        }
    }

    public double getResoulucion() {
        return resoulucion;
    }

    public void setResoulucion(double resoulucion) {
        this.resoulucion = resoulucion;
    }

    @Override
    public String toString() {
        return "Televisor [resoulucion=" + resoulucion + "Marca: "+this.getMarca()+ " Modelo: " +this.getModelo()+ " Precio: "+ this.getPrecio() + "]";
    }    
}
