package entregaEjerciciosBrando.ejercicio2;

public class portatil extends ordenadores {

  private double peso;

    public portatil(double peso , int codigo, String ram, String cpu, double precio) {
        super(codigo, ram, cpu, precio);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "portatil [peso=" + peso + ", " + super.toString() + "]";
    }
    
    
}
