package pb1.trabajo.practico5.interfaz;

import java.util.Scanner;

import pb1.trabajo.practico5.dominio.Calculadora;


public class EjemploCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            Calculadora calculadora = null;

            System.out.println("Ingrese qué operación quiere realizar:");
            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Potencia\n6. Sumatoria\n7. Productoria\n8. Contar Divisores");
            int opcionOperacion = sc.nextInt();

            double resultado = 0.0;

            if (opcionOperacion >= 1 && opcionOperacion <= 5) {
                System.out.println("Ingrese dos números para operar:");
                double numero1 = sc.nextDouble();
                double numero2 = sc.nextDouble();
                calculadora = new Calculadora(numero1, numero2);
            }

            switch (opcionOperacion) {
                case 1:
                    resultado = calculadora.sumar();
                    break;
                case 2:
                    resultado = calculadora.restar();
                    break;
                case 3:
                    resultado = calculadora.multiplicar();
                    break;
                case 4:
                    resultado = calculadora.dividir();
                    break;
                case 5:
                    resultado = calculadora.potencia();
                    break;
                case 6:
                	System.out.println("Seleccione la sumatoria que desee realizar:\n1. Sumatoria con un limite inferior y superior incluidos\n2. Sumatoria con limite sin incluir");
                	int opcionSumatoria = sc.nextInt();
                	if (opcionSumatoria == 1) {
                        System.out.println("Ingrese el límite inferior");
                        int limiteInferior = sc.nextInt();
                        System.out.println("Ingrese el limite superior");
                        int limiteSuperior = sc.nextInt();
                        calculadora = new Calculadora();
                        resultado = calculadora.sumatoria(limiteInferior, limiteSuperior);
                	} else if(opcionSumatoria == 2) {
                        System.out.println("Ingrese el límite");
                        int limite = sc.nextInt();
                        calculadora = new Calculadora();
                        resultado = calculadora.sumatoria(limite);
                	} else System.out.println("Opcion no encontrada");
                    break;
                case 7:
                	System.out.println("Seleccione la sumatoria que desee realizar:\n1. Sumatoria con un limite inferior y superior incluidos\n2. Sumatoria con limite sin incluir");
                	int opcionProductoria = sc.nextInt();
                	if (opcionProductoria == 1) {
                        System.out.println("Ingrese el límite inferior");
                        int limiteInferior = sc.nextInt();
                        System.out.println("Ingrese el limite superior");
                        int limiteSuperior = sc.nextInt();
                        calculadora = new Calculadora();
                        resultado = calculadora.productoria(limiteInferior, limiteSuperior);
                	} else if(opcionProductoria == 2) {
                        System.out.println("Ingrese el límite");
                        int limite = sc.nextInt();
                        calculadora = new Calculadora();
                        resultado = calculadora.productoria(limite);
                	} else System.out.println("Opcion no encontrada");
                    break;
                case 8:
                	System.out.println("Ingrese el numero para obtener la cantidad de divisores");
                	int numero = sc.nextInt();
                	calculadora = new Calculadora();
                	resultado = calculadora.contarDivisores(numero);
                    break;
                default:
                    System.out.println("Operación no válida.");
            }

            if (Double.isNaN(resultado)) {
                System.out.println("Error: al menos uno de los operadores no es positivo o es cero.");
            } else {
                System.out.println("Resultado: " + resultado);
            }

            System.out.println("¿Desea realizar otra operación?\n1. Sí\n2. No");
            opcion = sc.nextInt();
        } while (opcion == 1);

        System.out.println("Gracias por usar la calculadora.");
        sc.close();
    }
}
