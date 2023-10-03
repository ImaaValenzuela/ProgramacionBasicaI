package pb1.trabajo.practico2.dominios;

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva = true;
	
	public Persona (String nombre, String genero, long dni, double peso, double altura){
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", dni=" + dni + ", peso=" + peso + ", altura="
				+ altura + ", edad=" + edad + ", viva=" + viva + "]";
	}
	
	public void alimentar(double kilos) {
		peso += kilos;
	}
	
	public void crecer(double metros) {
		altura += metros;
	}
	
	public void cumplirAnos () {
		edad += 1;
	}
	
	public void morir() {
		viva = false;
	}
	
	public double pesar() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public int getEdad() {
		return edad;
	}
}
