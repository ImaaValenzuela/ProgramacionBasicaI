package pb1.trabajo.practico2.interfaces;

import java.util.Scanner;

import pb1.trabajo.practico2.dominios.Calculadora;

public class EjemploCalculadora {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Ingrese dos números para operar:");
            double numero1 = sc.nextDouble();
            double numero2 = sc.nextDouble();
            
            Calculadora casio = new Calculadora(numero1, numero2);
            Calculadora celular = new Calculadora(numero1, numero2);
            Calculadora calculadoraElegida = null;
            
            System.out.println("Ingrese qué calculadora quiere utilizar:\n1. Casio\n2. Celular");
            int opcionCalculadora = sc.nextInt();
            
            switch (opcionCalculadora) {
                case 1:
                    calculadoraElegida = casio;
                    break;
                case 2:
                    calculadoraElegida = celular;
                    break;
                default:
                    System.out.println("Opción inválida, se utilizará la calculadora Casio.");
                    calculadoraElegida = casio;
            }
            
            System.out.println("Ingrese qué operación quiere realizar:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
            int opcionOperacion = sc.nextInt();
            
            double resultado = 0.0;
            
            switch (opcionOperacion) {
                case 1:
                    resultado = calculadoraElegida.sumar(numero1, numero2);
                    break;
                case 2: 
                    resultado = calculadoraElegida.restar(numero1, numero2);
                    break;
                case 3:
                    resultado = calculadoraElegida.multiplicar(numero1, numero2);
                    break;
                case 4:
                    resultado = calculadoraElegida.dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Operación no válida.");
            }
            
            System.out.println("Resultado: " + resultado);
            
            System.out.println("¿Desea realizar otra operación?\n1. Sí\n2. No");
            opcion = sc.nextInt();
        } while (opcion == 1);
        
        System.out.println("Gracias por usar la calculadora.");
        sc.close();
    }
}
