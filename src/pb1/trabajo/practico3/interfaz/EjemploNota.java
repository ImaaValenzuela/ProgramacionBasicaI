package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.Nota;

public class EjemploNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Ingrese la nota de su parcial");
			float nota = sc.nextFloat();
			Nota notaParcial = new Nota(nota);
			System.out.println("Usted se saco un: " + notaParcial.getValor() + "\nAprobado: " + notaParcial.aprobado());
            System.out.println("¿Desea ingresar otra nota?\n1. Sí\n2. No");
            opcion = sc.nextInt();
		}while(opcion == 1);
		System.out.println("Gracias por usarlo");
		sc.close();
	}

}
