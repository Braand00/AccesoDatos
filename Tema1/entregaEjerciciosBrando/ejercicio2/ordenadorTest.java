package entregaEjerciciosBrando.ejercicio2;

public class ordenadorTest {
    public static void main(String[] args) {
        portatil port = new portatil(80, 1, "Corsair Vengeance", "AMD Ryzen 5 ", 185.99);
        System.out.println(port);

        sobremesa sobre = new sobremesa("Tiene 5 años de garantia como nadal", 1, "Kingston FURY Beast", "AMD Ryzen 7" , 650.89);
        System.out.println(sobre);
    }
    
}
