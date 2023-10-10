package pb1.trabajo.practico3.dominio;

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	
	public Persona(String nombre, String genero, long dni, double peso, double altura, int edad) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		this.viva = true;
	}

	@Override
	public String toString() {
	    return "Información de la Persona:\n" +
	            "Nombre: " + nombre + "\n" +
	            "Género: " + genero + "\n" +
	            "DNI: " + dni + "\n" +
	            "Peso: " + peso + " kg\n" +
	            "Altura: " + altura + " metros\n" +
	            "Edad: " + edad + " años\n" +
	            "Estado Vital: " + viva;
	}
	
	public void alimentar(double kilos) {
		peso += kilos;
	}
	
	public void crecer (double metros) {
		altura += metros;
	}
	
	public void cumpliAnos () {
		edad++;
	}
	
	public void morir() {
		viva = false;
	}
	
	public double pesar() {
		return peso;
	}
	
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}

	public double getAltura() {
		return altura;
	}

	public int getEdad() {
		return edad;
	}

	public double getPeso() {
		return peso;
	}
	
	
	
	
}
