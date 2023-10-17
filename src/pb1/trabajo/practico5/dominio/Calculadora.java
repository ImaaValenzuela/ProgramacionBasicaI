package pb1.trabajo.practico5.dominio;

public class Calculadora {
	double operador1;
	double operador2;
	
	public Calculadora() {}
	
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
	
    public double potencia() {
    	double base = operador1;
    	double exponente = operador2;
    	if (exponente == 1) return operador1;
    	
    	double resultado = 1;
    	
    	if (exponente > 0 && esPositivo()) for(int i = 1; i <= exponente; i++) resultado *= base;
    	
    	return resultado;
    }
    
    public int sumatoria(int limite) {
    	int resultado = 0;
    	for (int i = 1; i < limite; i++) resultado += i;
    	return resultado;
    }
    
    public int sumatoria(int limiteInferior, int limiteSuperior) {
    	int resultado = 0;
    	for (int i = limiteInferior; i <= limiteSuperior; i++) resultado += i;
    	return resultado;
    }
    
    public int productoria(int limite) {
    	int resultado = 1;
    	for (int i = 1; i < limite; i++) resultado *= i;
    	return resultado;
    }
    
    public int productoria(int limiteInferior, int limiteSuperior) {
    	int resultado = 1;
    	for (int i = limiteInferior; i <= limiteSuperior; i++) resultado *= i;
    	return resultado;
    }
    
    public int contarDivisores (int numero) {
    	int resultado = 0;
    	for (int i = 1; i<= numero; i++) if(numero % i == 0) resultado++;
    	return resultado;
    }
    
	public boolean esPositivo() {
        return (operador1 > 0) && (operador2 > 0);
	}
	
	
}
