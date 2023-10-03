package pb1.trabajo.practico2.interfaces;

import pb1.trabajo.practico2.dominios.Coche;

public class EjemploDeCoche {

	public static void main(String[] args) {
		
		System.out.println("Advertencia:\t Los precios de los autos estan en dolares");
		Coche camaro = new Coche("Chevrolet", "Chevrolet Camaro", 95000, 0, 2023);
		System.out.println(camaro);
		System.out.println("La antiguedad del auto es de: " + camaro.calcularAntiguedad() + " años");
		System.out.println("El auto tiene: " + camaro.getKilometros() + " km");
		camaro.setKilometros(40);
		System.out.println("Sali a pasear y el auto ahora tiene: " + camaro.getKilometros() + " km");
		
		Coche sentra = new Coche("Nissan", "Nissan Sentra", 30000);
		System.out.println(sentra);
		sentra.setKilometros(10000);
		System.out.println("El auto tiene: " +sentra.getKilometros()+ " km");
		sentra.setPrecio(25000);
		System.out.println("El auto ahora vale: " + sentra.getPrecio() + " U$D");
		
		int cantidad = Coche.getCantidadCoches();
		
		System.out.println("La cantidad de coches que hay es de: " + cantidad);
	}

}
