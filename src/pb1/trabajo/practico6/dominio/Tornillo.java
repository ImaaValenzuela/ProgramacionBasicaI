package pb1.trabajo.practico6.dominio;

public class Tornillo {
	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;
	
	public Tornillo(char tipoDeCabeza, int longitud, int cantidadRosca) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadRosca;
		this.posicionActual = 0;
	}

	public char getTipoDeCabeza() {
		return TIPO_DE_CABEZA;
	}

	public int getLongitud() {
		return LONGITUD;
	}
	
	public int getCantidadRosca() {
		return CANTIDAD_DE_ROSCA;
	}
	
	
	
	
	public int getPosicionActual() {
		return posicionActual;
	}

    public boolean girar(char sentido, int cantidadGiro) {
        if (sentido == '1') {
            while (cantidadGiro > 0) {
                if (posicionActual < CANTIDAD_DE_ROSCA) {
                    posicionActual++;
                } else {
                    // No puedes girar más si ya alcanzaste la cantidad de rosca
                    return false;
                }
                cantidadGiro--;
            }
            return true;
        } else if (sentido == '2') {
            while (cantidadGiro > 0) {
                if (posicionActual > 0) {
                    posicionActual--;
                } else {
                    // No puedes girar en sentido negativo si estás en la posición 0
                    return false;
                }
                cantidadGiro--;
            }
            return true;
        } else {
            return false;
        }
    }
	
	
}
