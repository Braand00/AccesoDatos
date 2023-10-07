package entregaEjerciciosBrando.ejercicio1;

public class complejo {
    //Atributos
    private double dPReal;
    private double dPImag;

 
    //constructor 
    public  complejo(double dPReal , double dPImag){
        this.dPImag = dPImag;
        this.dPReal = dPReal;
    }

    //Metodos:
    public void asignar(double x , double y){
        this.dPReal = x;
        this.dPImag = y;
    }

    public complejo sumar(complejo c1, complejo c2) {
        dPImag = c1.dPReal + c2.dPImag;
        dPReal = c1.dPImag + c2.dPReal;
        return new complejo(dPImag , dPReal);
    }

    public void imprimir(){
        System.out.println("dPImag: "+ dPImag + "  y dPReal:" + dPReal );
    }
}
