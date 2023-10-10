package pb1.trabajo.practico3.dominio;

public class Ascensor {
    private final int PISO_MAXIMO = 13;
    private final int PISO_MINIMO = 0;
    private final double PESO_MAXIMO;
    private final int CAPACIDAD_MAXIMA;
    private boolean puertaAbierta;
    private boolean sobrecarga;
    private int pisoActual;
    private double pesoActual;
    private int capacidadActual;
    
    public Ascensor(int capacidadMaxima, double pesoMaximo) {
        this.CAPACIDAD_MAXIMA = capacidadMaxima;
        this.PESO_MAXIMO = pesoMaximo;
    }
    
    public void ingresar(double peso) {
        if (capacidadActual < CAPACIDAD_MAXIMA && pesoActual + peso <= PESO_MAXIMO) {
            pesoActual += peso;
            capacidadActual++;
        } else {
            sobrecarga = true;
        }
    }
    
    public void salir(double peso) {
        if (capacidadActual > 0) {
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
        if (!sobrecarga && pisoActual < PISO_MAXIMO) {
            pisoActual++;
        }
    }
    
    public void bajar() {
        if (pisoActual > PISO_MINIMO) {
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
    
}