package pb1.trabajo.practico2.dominios;

public class Calculadora {
	double operador1;
	double operador2;
	
	public Calculadora() {};
	
	public Calculadora( double operador1, double operador2) {
	};
	
	public double sumar(){
		return 0;
	};
	
	public double sumar(double operador1 , double operador2) {
		return operador1 + operador2;
	};
	
	public double restar(){
		return 0;
	};
	
	public double restar(double operador1 , double operador2) {
		return operador1 - operador2;
	};
	
	public double multiplicar(){
		return 0;
	};
	
	public double multiplicar(double operador1 , double operador2) {
		return operador1 * operador2;
	};
	
	public double dividir(){
		return 0;
	};
	
	public double dividir(double numerador , double divisor) {
		this.operador1 = numerador;
		this.operador2 = divisor;
		if(divisor == 0) {
			System.out.println("Error, no se puede dividir por cero");
		};
		return numerador / divisor;
	};
}
