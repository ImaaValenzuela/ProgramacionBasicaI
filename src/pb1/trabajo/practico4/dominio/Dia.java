package pb1.trabajo.practico4.dominio;

public class Dia {
	private String dia;
	
	public Dia (String dia) {
		this.dia = dia;
	}
	
	public int numeroDia() {
		String diaIngresado = dia.toLowerCase();
		int numero = -1;
		switch(diaIngresado) {
		case "domingo":
			numero = 1;
			break;
		case "lunes":
			numero = 2;
			break;
		case "martes":
			numero = 3;
			break;
		case "miercoles":
			numero = 4;
			break;
		case "jueves":
			numero = 5;
			break;
		case "viernes":
			numero = 6;
			break;
		case "sabado":
			numero = 7;
			break;
		}
		return numero;	
	}
}
