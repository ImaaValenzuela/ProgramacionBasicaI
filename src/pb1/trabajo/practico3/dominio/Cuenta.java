package pb1.trabajo.practico3.dominio;

public class Cuenta {
	private String titular;
	private double saldo = 0;
	
	public Cuenta (String titular) {
		this.titular = titular;
	}
	
	public Cuenta (String titular, double saldo) {
		this(titular);
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double cantidad) {
		saldo += cantidad;
	}
	
	public void retirar(double cantidad) {
		if (permitirExtraccion()) saldo -= cantidad;
	}
	
	public boolean permitirExtraccion() {
		return saldo > 0;
	}
	
	
}
