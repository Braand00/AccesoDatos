package entregaEjerciciosBrando.ejercicio2;

public class sobremesa extends ordenadores {
    
    private String descripcion;

    public sobremesa(String descripcion , int codigo , String ram , String cpu , double precio ){
        super(codigo, ram, cpu, precio);
         this.descripcion = descripcion;
    }

    

    public String getDescripcion() {
        return descripcion;
    }



    @Override
    public String toString() {
        return "sobremesa [descripcion=" + descripcion + ", " + super.toString() +"]";
    }
 
}
