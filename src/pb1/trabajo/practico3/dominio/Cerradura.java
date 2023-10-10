package pb1.trabajo.practico3.dominio;

public class Cerradura {
	private int claveApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean = 3;
	private int fallosConsecutivos;
	
	public Cerradura (int claveApertura) {
		this.claveApertura = claveApertura;
		this.fallosConsecutivos = 0;
	}
	
    public void setClaveApertura(int claveApertura) {
		this.claveApertura = claveApertura;
	}

    
	public int getClaveApertura() {
		return claveApertura;
	}

	public int getFallosConsecutivos() {
		return fallosConsecutivos;
	}

	public boolean abrir(int clave) {
        if (claveApertura == clave) {
            fallosConsecutivos = 0;
            return true;
        } else {
            fallosConsecutivos++;
            return false;
        }
    }
	
    public void cerrar() {
        fallosConsecutivos = 0;
    }
	
    public boolean estaAbierta() {
        return fallosConsecutivos < cantidadDeFallosConsecutivosQueLaBloquean;
    }
	
    public boolean fueBloqueada() {
        return fallosConsecutivos >= cantidadDeFallosConsecutivosQueLaBloquean;
    }

	public int getCantidadDeFallosConsecutivosQueLaBloquean() {
		return cantidadDeFallosConsecutivosQueLaBloquean;
	}


}
