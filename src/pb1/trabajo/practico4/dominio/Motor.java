package pb1.trabajo.practico4.dominio;

public class Motor {
	private int tipoBomba;
	private String tipoFluido;
	private String combustible;
	private String tipoBombaStr;
	
	public Motor (String tipoBombaStr, String tipoFluido, String combustible) {
		this.tipoBombaStr = tipoBombaStr;
		this.tipoFluido = tipoFluido;
		this.combustible = combustible;
	}

	public int getTipoBomba() {
		return tipoBomba;
	}

	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public String getTipoFluido() {
		return tipoFluido;
	}

	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Motor:\n Tipo de bomba: " + tipoBombaStr + "\n Tipo de Fluido: " + tipoFluido + "\n Combustible: " + combustible ;
	}
	
	
}
