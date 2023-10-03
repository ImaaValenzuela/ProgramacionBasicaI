package pb1.trabajo.practico1;
import java.util.Scanner;

public class NotaAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese las nota de sus dos parciales");
		int primerParcial = sc.nextInt();
		int segundoParcial = sc.nextInt();
		
		boolean promociono = primerParcial >= 7 && segundoParcial >= 7;
		boolean desaprobo = primerParcial < 4 && segundoParcial < 4;
		boolean aprobo = !promociono && !desaprobo;
		
		System.out.println("Promociono: " + promociono);
		System.out.println("Aprobo: " + aprobo);
		System.out.println("Desaprobo: " + desaprobo);
		
		sc.close();
	}

}
