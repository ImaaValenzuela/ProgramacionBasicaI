package pb1.trabajo.practico2;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		double PI = Math.PI;
		do{
			System.out.println("Ingrese el radio del circulo");
			float radio = sc.nextFloat();
			double area = PI * (radio * radio);
			System.out.println("El area del circulo es: " + area);
	        System.out.println("¿Desea realizar otra operación?\n1. Sí\n2. No");
			opcion = sc.nextInt();
		}while (opcion == 1);
		sc.close();
		System.out.println("Gracias por usar el calculador de Area");
	}

}
