package pb1.trabajo.practico4.dominio;

public class Distancia {
	public final byte DECAMETRO = 1;
	public final byte HECTOMETRO = 2;
	public final byte KILOMETRO = 3;
	private double valor;
	
	public Distancia (double valor, byte unidad) {
		setValor(valor, unidad);
	}

	public double getValor() {
		return valor;
	}

	
	public void setValor(double valor,byte unidad) {
		switch (unidad) {
		case DECAMETRO:
			this.valor = valor;
			break;
		case HECTOMETRO:
			this.valor = valor * 10 ;
			break;
		case KILOMETRO:
			this.valor = valor * 100 ;
			break;
		default:
			System.out.println("Unidad no valida");
		}
	}
	
	public double convertir(byte unidad) {
		switch (unidad) {
		case DECAMETRO:
			return valor;
		case HECTOMETRO:
			return valor / 10;
		case KILOMETRO:
			return valor / 100;
		default:
			System.out.println("Unidad no valida");
			return valor;
		}
	}
	
}
