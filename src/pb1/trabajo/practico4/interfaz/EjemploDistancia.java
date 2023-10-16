package pb1.trabajo.practico4.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico4.dominio.Distancia;


public class EjemploDistancia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Ingrese la unidad de distancia de entrada:\n1. Decametro\n2. Hectometro\n3. Kilometro");
			byte unidadIngresada= (byte)sc.nextInt();
			
			System.out.println("Ingrese el valor de la distancia");
			double valor = sc.nextDouble();
			
			Distancia distancia = new Distancia (valor, unidadIngresada);
			
			System.out.println("Elija la unidad de distancia que desea convertir:\n1. Decametro\n2. Hectometro\n3. Kilometro");
			byte unidadConversionIngresada = (byte)sc.nextInt();
			
			double valorConvertido = distancia.convertir(unidadConversionIngresada);
			
			System.out.println("El valor en la nueva unidad de distancia es: " + valorConvertido);
			
			System.out.println("Desea convertir otra distancia?\n1. Si\n2. No");
			opcion = sc.nextInt();
		}while(opcion == 1);
		
		sc.close();
	}

}
