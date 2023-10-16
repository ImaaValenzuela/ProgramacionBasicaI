package pb1.trabajo.practico4.dominio;

public class Temperatura {
	public final byte CELSIUS = 1;
	public final byte FAHRENHEIT = 2;
	public final byte KELVIN = 3;
	private double valor;
	
	public Temperatura (double valor, byte unidad) {
		setValor(valor, unidad);
	}

	public double getValor() {
		return valor;
	}

	
	public void setValor(double valor,byte unidad) {
		switch (unidad) {
		case CELSIUS:
			this.valor = valor;
			break;
		case FAHRENHEIT:
			this.valor = (valor - 32) * 5.0 / 9.0;
			break;
		case KELVIN:
			this.valor = valor - 273.15;
			break;
		default:
			System.out.println("Unidad no valida");
		}
	}
	
	public double convertir(byte unidad) {
		switch (unidad) {
		case CELSIUS:
			return valor;
		case FAHRENHEIT:
			return ((valor * 9.0) / 5.0) + 32;
		case KELVIN:
			return valor + 273.15;
		default:
			System.out.println("Unidad no valida");
			return valor;
		}
	}
	
	
	
}
