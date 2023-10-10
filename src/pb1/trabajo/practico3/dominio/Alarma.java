package pb1.trabajo.practico3.dominio;

public class Alarma {
    private boolean sensorDeMovimiento;
    private boolean sensorDeContacto;
    private boolean sensorDeSonido;
    private boolean encendida;
    private int codigoDeSeguridad;

    public Alarma(int codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }

    public void setCodigoDeSeguridad(int codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }
    
    public void encender(int codigoIngresado) {
        if (verificarClave(codigoIngresado)) { encendida = true;}
    }

    public void apagar(int codigoIngresado) {
        if (verificarClave(codigoIngresado)) { encendida = false;}
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public boolean estaActivada() {
        return sensorDeContacto || sensorDeMovimiento || sensorDeSonido;
    }

    public void activarSensorDeMovimiento() {
        sensorDeMovimiento = true;
    }

    public void desactivarSensorDeMovimiento() {
        sensorDeMovimiento = false;
    }

    public void activarSensorDeContacto() {
        sensorDeContacto = true;
    }

    public void desactivarSensorDeContacto() {
        sensorDeContacto = false;
    }

    public void activarSensorDeSonido() {
        sensorDeSonido = true;
    }

    public void desactivarSensorDeSonido() {
        sensorDeSonido = false;
    }
    
    public boolean verificarClave(int clave) {
        return codigoDeSeguridad == clave;
    }

}
