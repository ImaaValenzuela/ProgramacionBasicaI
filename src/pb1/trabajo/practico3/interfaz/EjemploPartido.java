package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.PartidoTenis;

public class EjemploPartido {
    private static final String SI = "SI";

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            jugarPartido(sc);
            System.out.println("Desea jugar otro partido?\n1. SI\n2. NO");
            opcion = sc.next().toUpperCase();
        } while (opcion.equals(SI));

        sc.close();
        System.out.println("Partido terminado");
	}
	
    private static void jugarPartido(Scanner sc) {
        System.out.println("Ingrese el nombre del jugador 1:");
        String jugador1 = sc.next();
        System.out.println("Ingrese el nombre del jugador 2:");
        String jugador2 = sc.next();

        PartidoTenis partido = new PartidoTenis(jugador1, jugador2);

        for (int i = 0; i < 5; i++) {
            System.out.println("Jugando set " + (i + 1));
            partido.jugarSet();
            System.out.println("El ganador del set es: " + partido.obtenerResultadoSet());
        }

        System.out.println(partido.obtenerHistorial());
        System.out.println("El ganador del partido es: " + partido.getGanador());
    }
    
    

}
