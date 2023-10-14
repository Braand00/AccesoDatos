package entregaEjerciciosBrando.ejercicio7NoEntregar;

public class Electrodomestico {
    private String marca;
    private String modelo;
    private double precio;
    private String color;
    private double potenciaWatios;
    private double horasUsoDiarias;
    private double diasUsoAnuales;
    private double precioEnergia;

    public Electrodomestico(){
        this.marca = "Bosch";
        this.modelo = "7200";
        this.precio = 400;
        this.color = "Gris";
        this.potenciaWatios = 2300;
        this.horasUsoDiarias = 1 ;
        this.diasUsoAnuales = 3;
        this.precioEnergia = 0.40397;
    }

    public Electrodomestico(String marca , String modelo , double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

     // Constructor con todos los atributos como parámetros
public Electrodomestico(String marca, String modelo, double precio, String color, double potenciaWatios, 
                        double horasUsoDiarias, int diasUsoAnuales, double precioEnergia) {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    this.color = color;
    this.potenciaWatios = potenciaWatios;
    this.horasUsoDiarias = horasUsoDiarias;
    this.diasUsoAnuales = diasUsoAnuales;
    this.precioEnergia = precioEnergia;
}
//Metodos
public double consumoAnual() {
    double calculoVatios = this.potenciaWatios / 100;
    double horasUso = calculoVatios * this.horasUsoDiarias;
    double semanasAnyo = this.diasUsoAnuales * 52;
    double factura = horasUso * semanasAnyo * this.precioEnergia;
    return factura;
}


//Getters and Setters
public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public double getPotenciaWatios() {
    return potenciaWatios;
}

public void setPotenciaWatios(double potenciaWatios) {
    this.potenciaWatios = potenciaWatios;
}

public double getHorasUsoDiarias() {
    return horasUsoDiarias;
}

public void setHorasUsoDiarias(double horasUsoDiarias) {
    this.horasUsoDiarias = horasUsoDiarias;
}

public double getDiasUsoAnuales() {
    return diasUsoAnuales;
}

public void setDiasUsoAnuales(int diasUsoAnuales) {
    this.diasUsoAnuales = diasUsoAnuales;
}

public double getPrecioEnergia() {
    return precioEnergia;
}

public void setPrecioEnergia(double precioEnergia) {
    this.precioEnergia = precioEnergia;
}
  //ToString
@Override
public String toString() {
    return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
            + ", potenciaWatios=" + potenciaWatios + ", horasUsoDiarias=" + horasUsoDiarias + ", diasUsoAnuales="
            + diasUsoAnuales + ", precioEnergia=" + precioEnergia + "]";
}
  
}
