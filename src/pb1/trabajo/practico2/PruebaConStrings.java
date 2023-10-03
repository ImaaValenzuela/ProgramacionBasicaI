package pb1.trabajo.practico2;

public class PruebaConStrings {

	public static void main(String[] args) {
		String minuscula = "java es case sensitive";
		
		int cantidadDeCaracteres = minuscula.length();
		System.out.println("La cantidad de caracteres, incluyendo espacios, es: " + cantidadDeCaracteres);
		
		String mayuscula = minuscula.toUpperCase();
		System.out.println(mayuscula);
		
		mayuscula += ".";
		System.out.println(mayuscula);
	}

}
