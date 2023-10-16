package pb1.trabajo.practico4.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico4.dominio.Letra;

public class EjemploLetra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Ingrese una letra para verificar si es una vocal o no");
			char caracterIngresado = sc.next().charAt(0);
			Letra letra = new Letra(caracterIngresado);
			System.out.println("Es vocal: " + letra.esVocal());
			System.out.println("Desea ingresar otra letra?\n1. Si\n2. No");
			opcion = sc.nextInt();
		}while (opcion == 1);
		sc.close();
	}

}
