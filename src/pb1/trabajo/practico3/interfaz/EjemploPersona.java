package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.Persona;

public class EjemploPersona {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Persona persona = null;
		System.out.println("Ingrese sus datos");
		System.out.println("Nombre");
		String nombre = sc.next();
		System.out.println("Genero");
		String genero = sc.next();
		System.out.println("Dni");
		long dni = sc.nextLong();
		System.out.println("Peso");
		double peso = sc.nextDouble();
		System.out.println("Altura");
		double altura = sc.nextDouble();
		System.out.println("Edad");
		int edad = sc.nextInt();
		persona = new Persona (nombre, genero, dni, peso, altura, edad);
		System.out.println(persona.toString());
		int opcion;
		
		 do {
	            System.out.println("\nMenú de Opciones:");
	            System.out.println("1. Alimentar");
	            System.out.println("2. Crecer");
	            System.out.println("3. Cumplir Años");
	            System.out.println("4. Pesar");
	            System.out.println("5. Ver si es Mayor de Edad");
	            System.out.println("6. Morir");
	            System.out.println("7. Salir");

	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Ingrese la cantidad de kilos para alimentar:");
	                    double kilos = sc.nextDouble();
	                    persona.alimentar(kilos);
	                    System.out.println("Se ha alimentado. Nuevo peso: " + persona.pesar());
	                    break;

	                case 2:
	                    System.out.println("Ingrese la cantidad de metros para crecer:");
	                    double metros = sc.nextDouble();
	                    persona.crecer(metros);
	                    System.out.println("Ha crecido. Nueva altura: " + persona.getAltura());
	                    break;

	                case 3:
	                    persona.cumpliAnos();
	                    System.out.println("¡Feliz Cumpleaños! Nueva edad: " + persona.getEdad());
	                    break;

	                case 4:
	                    System.out.println("El peso actual es: " + persona.pesar());
	                    break;

	                case 5:
	                    System.out.println("¿Es mayor de edad? " + persona.esMayorDeEdad());
	                    break;

	                case 6:
	                    persona.morir();
	                    System.out.println("La persona ha fallecido.");
	                    break;

	                case 7:
	                    System.out.println("Saliendo del programa.");
	                    break;

	                default:
	                    System.out.println("Opción no válida. Intente nuevamente.");
	                    break;
	            }

	        } while (opcion != 7);
		sc.close();
	}

}
