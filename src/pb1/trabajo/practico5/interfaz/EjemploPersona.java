package pb1.trabajo.practico5.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico5.dominio.Persona;

public class EjemploPersona {
	
    private static final int OPCION_ALIMENTAR = 1;
    private static final int OPCION_CRECER = 2;
    private static final int OPCION_CUMPLIR_ANOS = 3;
    private static final int OPCION_PESAR = 4;
    private static final int OPCION_ES_MAYOR_DE_EDAD = 5;
    private static final int OPCION_MORIR = 6;
    private static final int OPCION_SALIR = 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        Persona persona = obtenerDatosPersona(sc);
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case OPCION_ALIMENTAR:
                    alimentarPersona(sc, persona);
                    break;
                case OPCION_CRECER:
                    crecerPersona(sc, persona);
                    break;
                case OPCION_CUMPLIR_ANOS:
                    cumplirAnosPersona(sc, persona);
                    break;
                case OPCION_PESAR:
                    mostrarPeso(persona);
                    break;
                case OPCION_ES_MAYOR_DE_EDAD:
                    verificarSiEsMayorDeEdad(persona);
                    break;
                case OPCION_MORIR:
                    morirPersona(persona);
                    break;
                case OPCION_SALIR:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != OPCION_SALIR);
        sc.close();
    }
	
	private static void mostrarMenu() {
        System.out.println("\nMenú de Opciones:");
        System.out.println("1. Alimentar");
        System.out.println("2. Crecer");
        System.out.println("3. Cumplir Años");
        System.out.println("4. Pesar");
        System.out.println("5. Ver si es Mayor de Edad");
        System.out.println("6. Morir");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static Persona obtenerDatosPersona(Scanner sc) {
        System.out.println("Ingrese sus datos");
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Genero: ");
        String genero = sc.next();
        System.out.print("DNI: ");
        long dni = sc.nextLong();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        return new Persona(nombre, genero, dni, peso, altura, edad);
    }

    private static void alimentarPersona(Scanner sc, Persona persona) {
        System.out.print("Ingrese la cantidad de kilos para alimentar: ");
        double kilos = sc.nextDouble();
        persona.alimentar(kilos);
        mostrarPeso(persona);
    }

    private static void crecerPersona(Scanner sc, Persona persona) {
        System.out.print("Ingrese la cantidad de centímetros para crecer: ");
        double metros = sc.nextDouble();
        persona.crecer(metros);
        System.out.println("Ha crecido. Nueva altura: " + persona.getAltura());
    }

    private static void cumplirAnosPersona(Scanner sc, Persona persona) {
        System.out.print("Ingrese la cantidad de años que desea cumplir: ");
        int edadDeseada = sc.nextInt();
        persona.cumplirAnos(edadDeseada);
        System.out.println("¡Feliz Cumpleaños! Nueva edad: " + persona.getEdad());
    }

    private static void mostrarPeso(Persona persona) {
        System.out.println("El peso actual es: " + persona.pesar());
    }

    private static void verificarSiEsMayorDeEdad(Persona persona) {
        System.out.println("¿Es mayor de edad? " + persona.esMayorDeEdad());
    }

    private static void morirPersona(Persona persona) {
        persona.morir();
        System.out.println("La persona ha fallecido.");
    }

}
