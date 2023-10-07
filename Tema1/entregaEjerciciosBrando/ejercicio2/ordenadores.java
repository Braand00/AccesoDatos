package entregaEjerciciosBrando.ejercicio2;

public class ordenadores {
    //Atributos
    private int codigo;
    private String ram;
    private String cpu;
    private double precio;

    //Constructor 
    public ordenadores(int codigo , String ram , String cpu , double precio){
        this.codigo = codigo;
        this.ram = ram;
        this.cpu = cpu;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "ordenadores [codigo=" + codigo + ", ram=" + ram + ", cpu=" + cpu + ", precio=" + precio + "]";
    }
    
}
