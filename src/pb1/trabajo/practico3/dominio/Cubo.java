package pb1.trabajo.practico3.dominio;

public class Cubo {
	private float longitudLado;
	
	public Cubo (float lado) {
		this.longitudLado = lado;
	}

	public float getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(float longitudLado) {
		this.longitudLado = longitudLado;
	}
	
	public float getSuperficie() {
		return 6 * (longitudLado * longitudLado);
	}
	
	public float getVolumen() {
		return longitudLado * longitudLado * longitudLado;
	}
}
