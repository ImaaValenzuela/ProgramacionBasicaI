package pb1.trabajo.practico6.dominio;

public class PersonaPrueba {
    public static final int BAJO_PESO = -1;
    public static final int PESO_NORMAL = 0;
    public static final int SOBRE_PESO = 1;

    private String nombre;
    private int edad;
    private double peso;

    public PersonaPrueba(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public int calcularIMC() {
        double imc = peso / Math.pow(edad, 2);
        if (imc < 18.5) {
            return BAJO_PESO;
        } else if (imc >= 18.5 && imc <= 24.9) {
            return PESO_NORMAL;
        } else {
            return SOBRE_PESO;
        }
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }
}
