package pb1.trabajo.practico6.interfaz;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import pb1.trabajo.practico6.dominio.Persona;
import pb1.trabajo.practico6.dominio.Ascensor;

public class EjemploAscensor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ascensor ascensor = crearAscensor(sc);
        List<Persona> personas = new ArrayList<>();
        int opcion;

        do {
            while (true) {
                mostrarMenu(ascensor);
                int opcionMenu = sc.nextInt();
                switch (opcionMenu) {
                    case 1:
                        ascensor.abrirPuerta();
                        break;
                    case 2:
                        ascensor.cerrarPuerta();
                        break;
                    case 3:
                        ingresarPersona(sc, ascensor, personas);
                        break;
                    case 4:
                        sacarPersona(sc, ascensor, personas);
                        break;
                    case 5:
                        subirPiso(sc, ascensor);
                        break;
                    case 6:
                        bajarPiso(sc, ascensor);
                        break;
                    case 7:
                        System.out.println("Saliendo del simulador.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

                if (opcionMenu == 7) {
                    break;
                }
            }
            System.out.println("Desea simular otro ascensor?\n1. Si\n2. No");
            opcion = sc.nextInt();
        } while (opcion == 1);
        System.out.println("Gracias por usar el simulador de ascensor.");
        sc.close();
    }

    private static Ascensor crearAscensor(Scanner sc) {
        System.out.println("Ingrese los datos del ascensor");
        System.out.println("Piso maximo al que se puede dirigir: ");
        int pisoMaximo = sc.nextInt();
        System.out.println("Piso minimo al que se puede dirigir: ");
        int pisoMinimo = sc.nextInt();
        System.out.println("Por defecto la capacidad máxima de personas es de 3");
        System.out.println("Peso máximo: ");
        double pesoMaximo = sc.nextDouble();
        return new Ascensor(pisoMaximo, pisoMinimo, pesoMaximo);
    }

    private static void mostrarMenu(Ascensor ascensor) {
        System.out.println(ascensor.toString());
        System.out.println("Menu de opciones:\n");
        System.out.println("1. Abrir Puerta");
        System.out.println("2. Cerrar Puerta");
        System.out.println("3. Ingresar Persona");
        System.out.println("4. Sacar Persona");
        System.out.println("5. Subir de piso");
        System.out.println("6. Bajar de piso");
        System.out.println("7. Salir");
    }

    private static void ingresarPersona(Scanner sc, Ascensor ascensor, List<Persona> personas) {
        if (!ascensor.getPuertaAbierta()) {
            System.out.println("La puerta está cerrada. Debes abrirla para ingresar personas.");
        } else if (!ascensor.getSobrecarga()) {
            System.out.println("Por favor ingrese el peso de la persona que sube: ");
            double pesoPersona = sc.nextDouble();
            if (pesoPersona > 0) {
                Persona nuevaPersona = new Persona(pesoPersona);
                personas.add(nuevaPersona);
                ascensor.ingresar(pesoPersona);
            } else {
                System.out.println("El peso de la persona debe ser mayor que 0.");
            }
        } else {
            System.out.println("Sobrecarga. No se pueden agregar más personas.");
        }
    }

    private static void sacarPersona(Scanner sc, Ascensor ascensor, List<Persona> personas) {
        if (ascensor.getPuertaAbierta() && !ascensor.getSobrecarga()) {
            System.out.println("Por favor ingrese el peso de la persona que baja: ");
            double pesoPersonaSalir = sc.nextDouble();
            if (pesoPersonaSalir > 0) {
                ascensor.salir(pesoPersonaSalir);
                personas.removeIf(persona -> persona.getPeso() == pesoPersonaSalir);
            } else {
                System.out.println("El peso de la persona debe ser mayor que 0.");
            }
        } else {
            System.out.println("La puerta está cerrada o hay sobrecarga. No se pueden sacar personas.");
        }
    }

    private static void subirPiso(Scanner sc, Ascensor ascensor) {
        if (!ascensor.getPuertaAbierta()) {
            System.out.println("1. Subir un piso\n2. Elegir piso a subir");
            int pisoSubir = sc.nextInt();
            if (pisoSubir == 1) {
                ascensor.subir();
            } else if (pisoSubir == 2) {
                System.out.println("Ingrese el piso al que desea subir");
                int pisoElegido = sc.nextInt();
                ascensor.irAlPiso(pisoElegido);
            } else {
                System.out.println("Opción no válida.");
            }
        } else {
            System.out.println("La puerta está abierta. Debes cerrarla para subir.");
        }
    }

    private static void bajarPiso(Scanner sc, Ascensor ascensor) {
        if (!ascensor.getPuertaAbierta()) {
            System.out.println("1. Bajar un piso\n2. Elegir piso a bajar");
            int pisoBajar = sc.nextInt();
            if (pisoBajar == 1) {
                ascensor.bajar();
            } else if (pisoBajar == 2) {
                System.out.println("Ingrese el piso al que desea bajar");
                int pisoElegido = sc.nextInt();
                ascensor.irAlPiso(pisoElegido);
            } else {
                System.out.println("Opción no válida.");
            }
        } else {
            System.out.println("La puerta está abierta. Debes cerrarla para bajar.");
        }
    }
}
