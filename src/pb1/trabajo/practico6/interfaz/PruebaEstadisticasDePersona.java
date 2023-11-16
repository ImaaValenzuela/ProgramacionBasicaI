package pb1.trabajo.practico6.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico6.dominio.PersonaPrueba;

public class PruebaEstadisticasDePersona {
	private static final int TAMANO_MUESTRA = 50;

	public static void main(String[] args) {
		PersonaPrueba[] muestra = ingresarMuestra();
		calcularEstadisticas(muestra);
	}

	private static PersonaPrueba[] ingresarMuestra() {
		PersonaPrueba[] muestra = new PersonaPrueba[TAMANO_MUESTRA];
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (i < TAMANO_MUESTRA) {
			System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();
			System.out.print("Edad: ");
			int edad = scanner.nextInt();
			System.out.print("Peso (en kg): ");
			double peso = scanner.nextDouble();

			muestra[i] = new PersonaPrueba(nombre, edad, peso);

			// Limpiar el buffer del scanner
			scanner.nextLine();

			i++;
			System.out.print("¿Desea ver los promedios (V) o ingresar otra persona (I)? ");
			String opcion = scanner.nextLine().toUpperCase();
			if (opcion.equals("V")) {
				calcularEstadisticas(muestra);
				break; // Salir del bucle de ingreso si se eligió ver los promedios
			} else if (!opcion.equals("I")) {
				System.out.println("Opción no válida. Continuando con la siguiente persona.");
			}
		}

		return muestra;

	}

	private static void calcularEstadisticas(PersonaPrueba[] muestra) {
	    double sumaPesos = 0;
	    int personasBajoPeso = 0;
	    int personasPesoNormal = 0;
	    int personasSobrePeso = 0;
	    int sumaEdadBajoPeso = 0;
	    int sumaEdadSobrePeso = 0;

	    int index = 0;
	    while (index < muestra.length && muestra[index] != null) {
	        PersonaPrueba persona = muestra[index];
	        sumaPesos += persona.getPeso();

	        if (persona.calcularIMC() == PersonaPrueba.BAJO_PESO) {
	            personasBajoPeso++;
	            sumaEdadBajoPeso += persona.getEdad();
	        } else if (persona.calcularIMC() == PersonaPrueba.SOBRE_PESO) {
	            personasSobrePeso++;
	            sumaEdadSobrePeso += persona.getEdad();
	        } else {
	            personasPesoNormal++;
	        }

	        index++;
	    }

	    double pesoPromedio = sumaPesos / TAMANO_MUESTRA;

	    System.out.println("a. Peso promedio: " + pesoPromedio);
	    System.out.println("b. Cantidad de personas con bajo peso: " + personasBajoPeso);
	    System.out.println("c. Cantidad de personas con peso normal: " + personasPesoNormal);
	    System.out.println("d. Cantidad de personas con sobre peso: " + personasSobrePeso);

	    if (personasBajoPeso > 0) {
	        double promedioEdadBajoPeso = (double) sumaEdadBajoPeso / personasBajoPeso;
	        System.out.println("e. Promedio de edad de las personas con bajo peso: " + promedioEdadBajoPeso);
	    } else {
	        System.out.println("e. No hay personas con bajo peso en la muestra.");
	    }

	    if (personasSobrePeso > 0) {
	        double promedioEdadSobrePeso = (double) sumaEdadSobrePeso / personasSobrePeso;
	        System.out.println("f. Promedio de edad de las personas con sobre peso: " + promedioEdadSobrePeso);
	    } else {
	        System.out.println("f. No hay personas con sobre peso en la muestra.");
	    }
	}
}