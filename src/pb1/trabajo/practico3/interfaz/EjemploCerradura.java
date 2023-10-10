package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.Cerradura;

public class EjemploCerradura {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Cerradura cerradura = null;

        System.out.println("Bienvenido. Cree su propia clave para la cerradura: ");
        int clave = sc.nextInt();
        cerradura = new Cerradura(clave);

        int intentosFallidos = 0;

        while (intentosFallidos < cerradura.getCantidadDeFallosConsecutivosQueLaBloquean()) {
            System.out.println("Ingrese la clave para acceder al menú de opciones: ");
            int claveIngresada = sc.nextInt();

            if (cerradura.abrir(claveIngresada)) {
                intentosFallidos = 0;
                break; 
            } else {
                System.out.println("Clave incorrecta. Intento " + (intentosFallidos + 1) + " de " + cerradura.getCantidadDeFallosConsecutivosQueLaBloquean());
                intentosFallidos++;
            }
        }

        if (intentosFallidos == cerradura.getCantidadDeFallosConsecutivosQueLaBloquean()) {

            System.out.println("Se ha bloqueado el acceso debido a demasiados intentos fallidos.");
            sc.close();
            return; 
        }

        int opcion;
        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Ver clave");
            System.out.println("2. Cambiar clave");
            System.out.println("3. Ver cantidad de fallos");
            System.out.println("4. Cerrar");
            System.out.println("5. Salir al menú principal");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La clave actual es: " + cerradura.getClaveApertura());
                    break;
                case 2:
                    System.out.println("Ingrese la nueva clave: ");
                    int nuevaClave = sc.nextInt();
                    cerradura.setClaveApertura(nuevaClave);
                    System.out.println("Clave cambiada exitosamente.");
                    break;
                case 3:
                    System.out.println("La cantidad de fallos consecutivos es: " + cerradura.getFallosConsecutivos());
                    break;
                case 4:
                    cerradura.cerrar();
                    System.out.println("La cerradura ha sido cerrada.");
                    break;
                case 5:
                    // Salir al menú principal
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        sc.close();
	}

}
