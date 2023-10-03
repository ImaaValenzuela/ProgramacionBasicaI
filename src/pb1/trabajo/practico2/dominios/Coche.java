package pb1.trabajo.practico2.dominios;

public class Coche {
	private final int CERO_KM = 0;
	private final int ANIO_ACTUAL = 2023;
	private static int cantidadCoches = 0;
	private String marca;
	private String modelo;
	private int kilometros;
	private int anio;
	private double precio;
	
	public Coche (String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		cantidadCoches++;
	}
	
	public Coche (String marca, String modelo, double precio, int kilometros, int anio) {
		this(marca, modelo, precio);
		this.anio = anio;
		this.kilometros = kilometros;
	}
	
	public static int getCantidadCoches() {
		return cantidadCoches;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo
				+ ", kilometros=" + kilometros + ", anio=" + anio + ", precio=" + precio + "]";
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	public int getKilometros(){
		if (kilometros == CERO_KM) return CERO_KM;
		return kilometros;
	}
	
	public void setPrecio (double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int calcularAntiguedad() {
	    if (ANIO_ACTUAL == anio) {
	        return 0;
	    } else {
	        return ANIO_ACTUAL - anio;
	    }
	}
	
	
}
