package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.Ascensor;
import pb1.trabajo.practico3.dominio.Persona;

public class EjemploAscensor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ascensor consorcioCallePeron = new Ascensor(4, 150.0);
		Persona persona1 = new Persona("Imanol", "M", 0, 60, 185, 19);
		Persona persona2 = new Persona("Imanol2", "M", 0, 80, 185, 19);
		Persona persona3 = new Persona("Imanol3", "M", 0, 90, 185, 19);
		System.out.println("El ascensor se encuentra en el piso " + consorcioCallePeron.getPisoActual());
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		System.out.println("El ascensor se encuentra en el piso " + consorcioCallePeron.getPisoActual());
		consorcioCallePeron.abrirPuerta();
		consorcioCallePeron.ingresar(persona1.getPeso());
		System.out.println(consorcioCallePeron.getPesoActual());
		System.out.println(persona1.getPeso());
;
		consorcioCallePeron.ingresar(persona2.getPeso());
		System.out.println(consorcioCallePeron.getPesoActual());
		System.out.println(persona2.getPeso());
		consorcioCallePeron.ingresar(persona3.getPeso());
		System.out.println(consorcioCallePeron.getPesoActual());
		System.out.println(persona3.getPeso());
		consorcioCallePeron.cerrarPuerta();
		System.out.println(consorcioCallePeron.getPesoActual());
		consorcioCallePeron.subir();
		System.out.println(consorcioCallePeron.getSobrecarga());
		System.out.println("El ascensor se encuentra en el piso " + consorcioCallePeron.getPisoActual());
		sc.close();

	}

}
