package pb1.trabajo.practico6.interfaz;

public class TablaAscii {

	public static void main(String[] args) {
        imprimirCaracteresNumericos();
        imprimirLetrasMinusculas();
        imprimirLetrasMayusculas();
        imprimirCaracteresEspeciales();
	}


    private static void imprimirCaracteresNumericos() {
        System.out.println("Caracteres numéricos:");
        int i = 48;
        while (i <= 57) {
            System.out.print(" " + i + " - " + (char) i + ",");
            i++;
        }
        System.out.println();
    }

    private static void imprimirLetrasMinusculas() {
        System.out.println("Letras minúsculas:");
        int i = 97;
        while (i <= 122) {
            System.out.print(" " + i + " - " + (char) i + ",");
            i++;
        }
        System.out.println();
    }

    private static void imprimirLetrasMayusculas() {
        System.out.println("Letras mayúsculas:");
        int i = 65;
        while (i <= 90) {
            System.out.print(" " + i + " - " + (char) i + ",");
            i++;
        }
        System.out.println();
    }

    private static void imprimirCaracteresEspeciales() {
        System.out.println("Caracteres especiales:");
        int i = 32;
        while (i <= 47) {
            System.out.print(" " + i + " - " + (char) i + ",");
            i++;
        }
        System.out.println();
        i = 58;
        while (i <= 64) {
            System.out.print(" " + i + " - " + (char) i + ",");
            i++;
        }
        System.out.println();
        i = 91;
        while (i <= 96) {
            System.out.print(" " + i + " - " + (char) i + ",");
            i++;
        }
        System.out.println();
        i = 123;
        while (i <= 126) {
            System.out.print(" " + i + " - " + (char) i + ",");
            i++;
        }
        System.out.println();
    }

}
