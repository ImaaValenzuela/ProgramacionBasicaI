package pb1.trabajo.practico2.interfaces;

import pb1.trabajo.practico2.dominios.Persona;

public class EjemploDeVida {
	public static void main(String args[]) {
		Persona sofia = new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50);
		System.out.println(sofia);
		System.out.println("La altura de Sofia es de: " + sofia.getAltura());
		System.out.println("El peso de Sofia es de: " + sofia.getPeso());
		sofia.alimentar(1);
		sofia.crecer(0.50);
		sofia.cumplirAnos();
		System.out.println("Sofia cumplio años, asi que crecio y se alimento: " + "\nAhora mide: " + sofia.getAltura() + "\nAhora pesa: " + sofia.getPeso() + "\nAhora tiene: " + sofia.getEdad() + " año");
	}
}
