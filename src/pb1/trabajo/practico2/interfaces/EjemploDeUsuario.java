package pb1.trabajo.practico2.interfaces;

import pb1.trabajo.practico2.dominios.Usuario;

public class EjemploDeUsuario {

	public static void main(String[] args) {
		Usuario imaavalenzuela = new Usuario("imaavalenzuela", null, "Imanol", "Valenzuela", 45181607, 0);
		System.out.println("El usuario es: " + imaavalenzuela.getUsuario());
		imaavalenzuela.setContrasenia("contrasenia");
		imaavalenzuela.setEdad(19);
		System.out.println("La contraseña del usuario es: " + imaavalenzuela.getContrasenia());
	}

}
