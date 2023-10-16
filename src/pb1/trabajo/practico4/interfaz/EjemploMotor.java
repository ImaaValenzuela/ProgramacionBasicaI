package pb1.trabajo.practico4.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico4.dominio.Motor;

public class EjemploMotor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcion;
		String tipoBombaString = null;
		do {
			System.out.println("Ingrese el tipo de bomba:");
			System.out.println("0 - Ningún valor definido");
			System.out.println("1 - Bomba de agua");
			System.out.println("2 - Bomba de gasolina");
			System.out.println("3 - Bomba de hormigón");
			System.out.println("4 - Bomba de pasta alimenticia");
			int tipoBomba = sc.nextInt();
		    switch (tipoBomba) {
	        case 0:
	        	tipoBombaString = "Sin definir";
	            System.out.println("No hay establecido un valor definido para el tipo de bomba");
	            break;
	        case 1:
	        	tipoBombaString = "Bomba de agua";
	            System.out.println("La bomba es una bomba de agua");
	            break;
	        case 2:
	        	tipoBombaString = "Bomba de gasolina";
	            System.out.println("La bomba es una bomba de gasolina");
	            break;
	        case 3:
	        	tipoBombaString = "Bomba de hormigón";
	            System.out.println("La bomba es una bomba de hormigón");
	            break;
	        case 4:
	        	tipoBombaString = "Bomba de pasta alimenticia";
	            System.out.println("La bomba es una bomba de pasta alimenticia");
	            break;
	        default:
	            System.out.println("No existe un valor válido para tipo de bomba");
	            break;
	    }
			System.out.println("Ingrese el tipo de fluido:");
			String tipoFluido = sc.next();
			System.out.println("Ingrese el tipo de combustible");
			String tipoCombustible = sc.next();
			Motor motor = new Motor(tipoBombaString, tipoFluido, tipoCombustible);
			System.out.println(motor.toString());
			System.out.println("Desea agregar otro motor?\n1. Si\n2. No");
			opcion = sc.nextInt();
		}while (opcion == 1);
		sc.close();
	}

}
