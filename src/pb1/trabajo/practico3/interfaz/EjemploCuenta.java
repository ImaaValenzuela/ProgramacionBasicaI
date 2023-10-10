package pb1.trabajo.practico3.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico3.dominio.Cuenta;

public class EjemploCuenta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta = new Cuenta(null, 10000);
		System.out.println("Bienvenido al Banco, por favor ingrese el nombre del titular de la cuenta");
		cuenta.setTitular(sc.next());
		int opcion;
		do {
			System.out.println("Hola " + cuenta.getTitular().toUpperCase() + ", usted tiene un saldo de: " + cuenta.getSaldo());
			System.out.println("Que desea hacer?\n1. Realizar deposito\n2. Realizar extraccion ");
			int opcion2 = sc.nextInt();
			if(opcion2 == 1) {
				System.out.println("Ingrese la cantidad que desea depositar:");
				cuenta.depositar(sc.nextDouble());
				System.out.println("Su deposito ha sido realizado con exito,su saldo actual es de: " + cuenta.getSaldo());
			} else if (opcion2 == 2) {
				System.out.println("Ingrese la cantidad que desea retirar: ");
				cuenta.retirar(sc.nextDouble());
				if (!cuenta.permitirExtraccion()) {
				    System.out.println("No se puede realizar extracción, saldo insuficiente");
				} else {
				    System.out.println("Extracción realizada con éxito, su saldo actual es de: " + cuenta.getSaldo());
				}
			} else System.out.println("No eligio ninguna opcion correcta, se redirigira al inicio");
			System.out.println("Desea realizar otra operacion?\n1. Si\n2. No");
			opcion = sc.nextInt();
		}while(opcion == 1);
		System.out.println("Gracias por usar nuestra plataforma");
		sc.close();
	}

}
