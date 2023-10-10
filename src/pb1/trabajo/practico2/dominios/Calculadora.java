package pb1.trabajo.practico2.dominios;

public class Calculadora {
	double operador1;
	double operador2;
	
    public Calculadora(double operador1, double operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public double sumar() {
        if (esPositivo()) {
            return operador1 + operador2;
        } else {
            return Double.NaN;
        }
    }

    public double restar() {
        if (esPositivo()) {
            return operador1 - operador2;
        } else {        
            return Double.NaN;
        }
    }

    public double multiplicar() {
        if (esPositivo()) {
            return operador1 * operador2;
        } else {
        	return Double.NaN;
        }
    }

    public double dividir() {
        if (esPositivo() && operador2 != 0) {
            return operador1 / operador2;
        } else {
            return Double.NaN;
        }
    }
	
	public boolean esPositivo() {
        return (operador1 > 0) && (operador2 > 0);
	}
}
