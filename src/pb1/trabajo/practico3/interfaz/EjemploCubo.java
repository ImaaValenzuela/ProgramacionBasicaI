package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.Cubo;

public class EjemploCubo {

	public static void main(String[] args) {
		Cubo longitudCubo = new Cubo(0);
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
		    System.out.println("Ingrese la longitud del lado de un cubo:");
		    float nuevaLongitud = sc.nextFloat();
		    longitudCubo.setLongitudLado(nuevaLongitud);
		    
		    System.out.println("La longitud de un lado es de: " + nuevaLongitud);
		    
		    int opcion2;
		    do {
		        System.out.println("Que operación desea realizar?\n1. Cambiar la longitud de un lado\n2. Ver la superficie del cubo\n3. Ver el volumen del cubo\n4. Volver al Inicio");
		        opcion2 = sc.nextInt();
		        switch (opcion2) {
		            case 1:
		                System.out.println("Ingrese la nueva longitud");
		                nuevaLongitud = sc.nextFloat();
		                longitudCubo.setLongitudLado(nuevaLongitud);
		                System.out.println("La longitud de un lado es de: " + nuevaLongitud);
		                break;
		            case 2:
		                System.out.println("La superficie del cubo es de: " + longitudCubo.getSuperficie());
		                break;
		            case 3:
		                System.out.println("El volumen del cubo es de: " + longitudCubo.getVolumen());
		                break;
		            case 4:
		                break;
		            default:
		                System.out.println("No se ingreso una opción correcta");
		                break;
		        }
		    } while (opcion2 != 4);
		    
		    System.out.println("Desea escribir otra longitud?\n1. Si\n2. No");
		    opcion = sc.nextInt();
		} while (opcion == 1);
		System.out.println("Fin");
		sc.close();
	}

}
