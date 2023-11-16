package pb1.trabajo.practico6.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico6.dominio.Destornillador;
import pb1.trabajo.practico6.dominio.Tarugo;
import pb1.trabajo.practico6.dominio.Tornillo;

public class EjemploTornillo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tornillo tornillo = null;
        Destornillador destornillador = null;
        Tarugo tarugo = null;
        int opcion;

        do {
            System.out.println("1. Crear un nuevo tornillo\n2. Girar el tornillo\n3. Crear un destornillador\n" +
                    "4. Atornillar con destornillador\n5. Desatornillar con destornillador\n6. Crear un tarugo\n" +
                    "7. Atornillar con tarugo\n8. Desatornillar con tarugo\n9. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tipo de cabeza que desee utilizar:\nP. Plana\nH. Phillips\nA. Allen");
                    char tipoCabeza = Character.toLowerCase(sc.next().charAt(0));
                    System.out.println("Ingrese la longitud del tornillo");
                    int longitud = sc.nextInt();
                    System.out.println("Ingrese la cantidad de rosca que necesita");
                    int cantidadRosca = sc.nextInt();
                    tornillo = new Tornillo(tipoCabeza, longitud, cantidadRosca);
                    break;

                case 2:
                    if (tornillo != null) {
                        System.out.println("Ingrese el sentido (1 o 2) y la cantidad de giro:");
                        char sentido = sc.next().charAt(0);
                        int cantidadGiro = sc.nextInt();
                        if (tornillo.getCantidadRosca() < cantidadGiro)
                            System.out.println("No puedes girar más de la longitud");
                        tornillo.girar(sentido, cantidadGiro);
                    } else {
                        System.out.println("Primero debe crear un tornillo.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el tipo de cabeza del destornillador:\nP. Plana\nH. Phillips\nA. Allen");
                    char tipoDestornillador = Character.toLowerCase(sc.next().charAt(0));
                    destornillador = new Destornillador(tipoDestornillador);
                    break;

                case 4:
                    if (tornillo != null && destornillador != null) {
                        destornillador.atornillar(tornillo);
                    } else {
                        System.out.println("Primero debe crear un tornillo y un destornillador.");
                    }
                    break;

                case 5:
                    if (tornillo != null && destornillador != null) {
                        destornillador.desatornillar(tornillo);
                    } else {
                        System.out.println("Primero debe crear un tornillo y un destornillador.");
                    }
                    break;

                case 6:
                    System.out.println("Ingrese la longitud del tarugo");
                    int longitudTarugo = sc.nextInt();
                    tarugo = new Tarugo(longitudTarugo);
                    break;

                case 7:
                    if (tornillo != null && tarugo != null) {
                        destornillador.atornillar(tornillo, tarugo);
                    } else {
                        System.out.println("Primero debe crear un tornillo y un tarugo.");
                    }
                    break;

                case 8:
                    if (tornillo != null && tarugo != null) {
                        destornillador.desatornillar(tornillo, tarugo);
                    } else {
                        System.out.println("Primero debe crear un tornillo y un tarugo.");
                    }
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 9);

        sc.close();
    }
}
