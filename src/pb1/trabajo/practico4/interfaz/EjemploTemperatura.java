package pb1.trabajo.practico4.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico4.dominio.Temperatura;

public class EjemploTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Ingrese la unidad de temperatura de entrada:\n1. Celsius\n2. Farenheit\n3. Kelvin");
			byte unidadIngresada= (byte)sc.nextInt();
			
			System.out.println("Ingrese el valor de la temperatura");
			double valor = sc.nextDouble();
			
			Temperatura temperatura = new Temperatura (valor, unidadIngresada);
			
			System.out.println("Elija la unidad de temperatura que desea convertir:\n1. Celsius\n2. Farenheit\n3. Kelvin");
			byte unidadConversionIngresada = (byte)sc.nextInt();
			
			double valorConvertido = temperatura.convertir(unidadConversionIngresada);
			
			System.out.println("El valor en la nueva unidad de temperatura es: " + valorConvertido);
			
			System.out.println("Desea convertir otro grado?\n1. Si\n2. No");
			opcion = sc.nextInt();
		}while(opcion == 1);
		
		sc.close();
	}

}
