package pb1.trabajo.practico2.dominios;

public class DiscoRigido {
	private double tamanio;
	
	public DiscoRigido(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public double capacidadDvd() {
		double conversorTamanio= tamanio * 1000;
		double dvd = conversorTamanio / 4.5;
		return (int)dvd;
	}
	
	public double capacidadBlueRay() {
		double conversorTamanio= tamanio * 1000;
		double blueray = conversorTamanio / 15;
		return (int)blueray;
	}
}
