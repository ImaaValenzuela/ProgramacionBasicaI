package pb1.trabajo.practico5.dominio;

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	
	public Persona (String nombre, String genero, long dni, double peso, double altura, int edad) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		viva = true;
	}

	@Override
	public String toString() {
		return "Datos de la persona:\n Nombre: " + nombre + "\n Genero: " + genero + "\n Dni: " + dni + "\n Peso: " + peso + "\n Altura: "
				+ altura + "\n Edad: " + edad + "\n Vitalidad:" + viva;
	}
	
	public void alimentar(double kilos) {
		peso += kilos;
	}
	
	public void crecer(double metros) {
		altura += metros;
	}
	
	public void cumplirAnos(int anosDeseados) {
	    for (int i = 0; i < anosDeseados; i++) edad++;   
	}
	
	public void morir() {
		viva = false;
	}
	
	public double pesar() {
		return this.peso;
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
	
}
