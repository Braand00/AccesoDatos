package entregaEjerciciosBrando.ejercicio5NoEntregar;

import java.util.Arrays;
import java.util.Random;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    int dni;
    char sexo;
    double peso;
    double altura;

    private static final char HOMBRE = 'H';
    private static final char MUJER = 'M';

    char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                    'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                    'C', 'K', 'E'};

    //Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.sexo = HOMBRE;
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
        generarDni();
    }

    //Constructor con los parametros nombre,edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        if (validaSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = HOMBRE; // Si el sexo no es válido, se asigna por defecto HOMBRE
        }
        generarDni();
    }

    //Constructor con todos los parametros
    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        if (validaSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = HOMBRE; // Si el sexo no es válido, se asigna por defecto HOMBRE
        }
        this.peso = peso;
        this.altura = altura;
    }

    //Metodos:
    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public void validaDNI() {
        int resto;
        resto = this.dni % 23;
        System.out.println("La letra del dni seria: " + this.dni + "-" + letra[resto]);
    }

    boolean validaSexo(char sexo) {
        return sexo == HOMBRE || sexo == MUJER;
    }

    protected void generarDni() {
        Random random = new Random();
        // Generar 8 números aleatorios en una sola línea
        for (int i = 0; i < 8; i++) {
            int numeroAleatorio = random.nextInt(10); // Genera números aleatorios entre 0 y 9
            this.dni = this.dni * 10 + numeroAleatorio;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static char getHombre() {
        return HOMBRE;
    }

    public static char getMujer() {
        return MUJER;
    }

    public char[] getLetra() {
        return letra;
    }

    public void setLetra(char[] letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + ", letra=" + Arrays.toString(letra) + "]";
    }

    
}
