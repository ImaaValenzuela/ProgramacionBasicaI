package pb1.trabajo.practico3.dominio;

public class Punto {
	private double x;
	private double y;
	
	public Punto (double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public boolean puntoEnEjeX() {
		return y == 0;
	}
	
	public boolean puntoEnEjeY() {
		return x == 0;
	}
	
	public boolean puntoEnOO() {
		return (x == 0) && (y == 0);
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
}
