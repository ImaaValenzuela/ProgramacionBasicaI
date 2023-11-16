package pb1.trabajo.practico6.dominio;


public class Ascensor {
    private final int PISO_MAXIMO;
    private final int PISO_MINIMO;
    private final double PESO_MAXIMO;
    private final int CAPACIDAD_MAXIMA = 3;
    private boolean puertaAbierta;
    private boolean sobrecarga;
    private int pisoActual;
    private double pesoActual;
    private int capacidadActual;
    
    public Ascensor(int pisoMaximo, int pisoMinimo, double pesoMaximo) {
        this.PISO_MAXIMO = pisoMaximo;
        this.PISO_MINIMO = pisoMinimo;
        this.PESO_MAXIMO = pesoMaximo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del ascensor:\n");
        sb.append("Piso actual: ").append(pisoActual).append("\n");
        sb.append("Puerta: ").append(puertaAbierta ? "Abierta" : "Cerrada").append("\n");
        sb.append("Sobrecarga: ").append(sobrecarga ? "Sí" : "No").append("\n");
        sb.append("Peso actual: ").append(pesoActual).append(" kg\n");
        sb.append("Capacidad actual: ").append(capacidadActual).append(" personas\n");
        sb.append("Piso máximo: ").append(PISO_MAXIMO).append("\n");
        sb.append("Piso mínimo: ").append(PISO_MINIMO).append("\n");
        sb.append("Peso máximo: ").append(PESO_MAXIMO).append(" kg\n");
        sb.append("Capacidad máxima: ").append(CAPACIDAD_MAXIMA).append(" personas\n");

        return sb.toString();
    }
	public void ingresar(double peso) {
        if (puertaAbierta && capacidadActual < CAPACIDAD_MAXIMA && pesoActual + peso <= PESO_MAXIMO) {
            pesoActual += peso;
            capacidadActual++;
        } else {
            sobrecarga = true;
        }
    }
    
    public void salir(double peso) {
        if (puertaAbierta && capacidadActual > 0) {
            pesoActual -= peso;
            capacidadActual--;
        }
    }
    
    public void abrirPuerta() {
        if (!puertaAbierta) {
            puertaAbierta = true;
        }
    }
    
    public void cerrarPuerta() {
        if (puertaAbierta) {
            puertaAbierta = false;
        }
    }
    
    public void subir() {
        if (!sobrecarga && !puertaAbierta &&  pisoActual < PISO_MAXIMO) {
            pisoActual++;
        }
    }
    
    public void bajar() {
        if (!puertaAbierta && pisoActual > PISO_MINIMO ) {
            pisoActual--;
        }
    }
    
    public int getPisoActual() {
        return pisoActual;
    }
    
    public boolean getPuertaAbierta() {
        return puertaAbierta;
    }
    
    public boolean getSobrecarga() {
        return sobrecarga;
    }
    
    public double getPesoActual() {
        return pesoActual;
    }
    
    public int getCapacidadActual() {
        return capacidadActual;
    }
    
    public int irAlPiso(int destino) {
        if (destino < PISO_MINIMO || destino > PISO_MAXIMO) {
            return pisoActual;
        }

        if (puertaAbierta) {
            cerrarPuerta();
        }

        if (destino > pisoActual) {
            while (pisoActual < destino && !sobrecarga) {
                subir();
            }
        } else if (destino < pisoActual) {
            while (pisoActual > destino && !sobrecarga) {
                bajar();
            }
        }

        if (!puertaAbierta) {
            abrirPuerta();
        }

        return pisoActual;
    }
    
}
