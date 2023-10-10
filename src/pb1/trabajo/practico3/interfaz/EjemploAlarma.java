package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.Alarma;

public class EjemploAlarma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alarma alarma = null;

        System.out.println("Por favor, cree su clave para la alarma:");
        int codigo = sc.nextInt();
        alarma = new Alarma(codigo);
        int opcion;

        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Activar sensores");
            System.out.println("2. Desactivar sensores");
            System.out.println("3. Verificar si la alarma está encendida");
            System.out.println("4. Verificar si la alarma está activada");
            System.out.println("5. Apagar alarma");
            System.out.println("6. Encender alarma");
            System.out.println("7. Cambiar clave");
            System.out.println("8. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarSubMenuActivarSensores(sc, alarma);
                    break;
                case 2:
                    mostrarSubMenuDesactivarSensores(sc, alarma);
                    break;
                case 3:
                    if (alarma.estaEncendida()) {
                        System.out.println("La alarma está encendida.");
                    } else {
                        System.out.println("La alarma está apagada.");
                    }
                    break;
                case 4:
                    if (alarma.estaActivada()) {
                        System.out.println("La alarma está activada.");
                    } else {
                        System.out.println("La alarma está desactivada.");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese su clave para apagar la alarma:");
                    int codigoApagar = sc.nextInt();
                    if (alarma.verificarClave(codigoApagar)) {
                        alarma.apagar(codigoApagar);
                        System.out.println("La alarma se ha apagado correctamente");
                    } else {
                        System.out.println("Clave incorrecta. No se pudo apagar la alarma.");
                    }
                case 6:
                    System.out.println("Ingrese su clave para encender la alarma:");
                    int codigoEncender = sc.nextInt();
                    if (alarma.verificarClave(codigoEncender)) {
                        alarma.encender(codigoEncender);
                        System.out.println("La alarma se ha encendido correctamente");
                    } else {
                        System.out.println("Clave incorrecta. No se pudo encender la alarma.");
                    }
                    break;
                case 7:
                    System.out.println("Ingrese su nueva clave:");
                    int nuevaClave = sc.nextInt();
                    alarma.setCodigoDeSeguridad(nuevaClave);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 8);

        sc.close();
    }

    private static void mostrarSubMenuActivarSensores(Scanner sc, Alarma alarma) {
        int opcion;
        do {
            System.out.println("Submenú - Activar Sensores:");
            System.out.println("1. Activar sensor de movimiento");
            System.out.println("2. Activar sensor de contacto");
            System.out.println("3. Activar sensor de sonido");
            System.out.println("4. Volver al menú anterior");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su clave para activar el sensor de movimiento de la alarma:");
                    int codigoMovimiento = sc.nextInt();
                    if (alarma.verificarClave(codigoMovimiento)) {
                        alarma.activarSensorDeMovimiento();
                        System.out.println("Se ha activado el sensor correctamente");
                    } else {
                        System.out.println("Clave incorrecta. No se pudo activar el sensor de la alarma.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese su clave para activar el sensor de contacto de la alarma:");
                    int codigoContacto = sc.nextInt();
                    if (alarma.verificarClave(codigoContacto)) {
                        alarma.activarSensorDeContacto();
                        System.out.println("Se ha activado el sensor correctamente");
                    } else {
                        System.out.println("Clave incorrecta. No se pudo activar el sensor de la alarma.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese su clave para activar el sensor de sonido de la alarma:");
                    int codigoSonido = sc.nextInt();
                    if (alarma.verificarClave(codigoSonido)) {
                        alarma.activarSensorDeSonido();
                        System.out.println("Se ha activado el sensor correctamente");
                    } else {
                        System.out.println("Clave incorrecta. No se pudo activar el sensor de la alarma.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }

    private static void mostrarSubMenuDesactivarSensores(Scanner sc, Alarma alarma) {
        int opcion;
        do {
            System.out.println("Submenú - Desactivar Sensores:");
            System.out.println("1. Desactivar sensor de movimiento");
            System.out.println("2. Desactivar sensor de contacto");
            System.out.println("3. Desactivar sensor de sonido");
            System.out.println("4. Volver al menú anterior");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su clave para desactivar el sensor de movimiento de la alarma:");
                    int codigoMovimiento = sc.nextInt();
                    if (alarma.verificarClave(codigoMovimiento)) {
                        alarma.desactivarSensorDeMovimiento();
                        System.out.println("Se ha desactivado el sensor correctamente");
                    } else {
                        System.out.println("Clave incorrecta. No se pudo desactivar el sensor de la alarma.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese su clave para desactivar el sensor de contacto de la alarma:");
                    int codigoContacto = sc.nextInt();
                    if (alarma.verificarClave(codigoContacto)) {
                        alarma.desactivarSensorDeContacto();
                        System.out.println("Se ha desactivado el sensor correctamente");
                    } else {
                        System.out.println("Clave incorrecta. No se pudo desactivar el sensor de la alarma.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese su clave para desactivar el sensor de sonido de la alarma:");
                    int codigoSonido = sc.nextInt();
                    if (alarma.verificarClave(codigoSonido)) {
                        alarma.desactivarSensorDeSonido();
                        System.out.println("Se ha desactivado el sensor correctamente");
                    } else {
                        System.out.println("Clave incorrecta. No se pudo desactivar el sensor de la alarma.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
}