package entregaEjerciciosBrando.ejercicio9NoEntregar;

public class FiguraTest {
    public static void main(String[] args) {
        Rectangulo miRect = new Rectangulo(5, 4);
        Circulo miCirc = new Circulo(2.8);
        Triangulo miTri = new Triangulo(3, 4);

        Figura[] listFiguras = {miRect , miCirc , miTri};

        for(int i = 0 ; i < listFiguras.length;i++){
            listFiguras[i].calcuarArea();
            listFiguras[i].mostrarArea();
        }
    }
}
