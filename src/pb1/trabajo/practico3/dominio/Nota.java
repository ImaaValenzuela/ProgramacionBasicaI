package pb1.trabajo.practico3.dominio;

public class Nota {
	private float valor;
	
	public Nota(float valorInicial) {
		this.valor = valorInicial;
	}

	public float getValor() {
		return valor;
	}
	
	public boolean aprobado() {
		return valor >= 4;
	}
	
	public void recuperar(float nuevoValor) {
		this.valor = nuevoValor;
	}
	
	
}
