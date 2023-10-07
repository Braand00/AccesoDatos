package entregaEjerciciosBrando.ejercicio2;

public class ordenadorTest {
    public static void main(String[] args) {
        ordenadores orde = new ordenadores(1, "Memoria RAM Crucial ", "Intel Core 7", 800);
        System.out.println(orde);
        
        portatil port = new portatil(80, 1, "Corsair Vengeance", "AMD Ryzen 5 ", 185.99);
        System.out.println(port);

        sobremesa sobre = new sobremesa("Tiene 5 años de garantia como nadal", 1, "Kingston FURY Beast", "AMD Ryzen 7" , 650.89);
        System.out.println(sobre);
    }
    
}
