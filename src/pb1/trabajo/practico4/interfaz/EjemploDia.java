package pb1.trabajo.practico4.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico4.dominio.Dia;

public class EjemploDia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcion;
		do {
			System.out.println("Ingrese un dia para saber su numero");
			String diaIngresado = sc.next();
			Dia dia = new Dia (diaIngresado);
			System.out.println("El dia ingresado es el numero " + dia.numeroDia());
			System.out.println("Desea ingresar otro dia?\n1. Si\n2. No");
			opcion = sc.nextInt();
		}while (opcion == 1);
		sc.close();
	}

}
