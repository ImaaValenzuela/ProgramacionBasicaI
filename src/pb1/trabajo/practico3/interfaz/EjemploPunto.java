package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.Punto;

public class EjemploPunto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Ingrese el punto:");
			Punto coordenadas = new Punto(0,0);
			coordenadas.setX(sc.nextDouble());
			coordenadas.setY(sc.nextDouble());
			System.out.println(coordenadas.toString());
			System.out.println("Que desea realizar con sus coordenadas?\n1. Mostrar Eje X\n2. Mostrar Eje Y\n3. Cambiar coordenadas\n4. Está sobre el eje de las X?\n5. Está sobre el eje de las Y?\n6. Esta en el origen?");
			int opcion2 = sc.nextInt();
			switch(opcion2){
			case 1:
				System.out.println(coordenadas.getX());
				break;
			case 2:
				System.out.println(coordenadas.getY());
				break;
			case 3:
				System.out.println("Ingrese las nuevas coordenadas:");
				coordenadas.setX(sc.nextDouble());
				coordenadas.setY(sc.nextDouble());
				System.out.println(coordenadas.toString());
				break;
			case 4:
				System.out.println(coordenadas.puntoEnEjeX());
				break;
			case 5:
				System.out.println(coordenadas.puntoEnEjeY());
				break;
			case 6: 
				System.out.println(coordenadas.puntoEnOO());
				break;
			default:
				System.out.println("No selecciono ninguna opcion, saldra del menu.");
				break;
			}
			
			System.out.println("Desea buscar otro punto?\n1. Si\n2. No");
			opcion = sc.nextInt();
		}while (opcion == 1);
		System.out.println("Gracias por usar el programa");
		sc.close();
	}

}
