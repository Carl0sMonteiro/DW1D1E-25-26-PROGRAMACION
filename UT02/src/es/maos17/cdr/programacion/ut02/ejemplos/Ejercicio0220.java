package es.maos17.cdr.programacion.ut02.ejemplos;

		import java.util.Scanner;

		public class Ejercicio0220 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Introduce el primer número: ");
		        double num1 = scanner.nextDouble();
		        
		        System.out.print("Introduce el segundo número: ");
		        double num2 = scanner.nextDouble();
		        
		        System.out.println("\nOperaciones disponibles:");
		        System.out.println("1 - Suma");
		        System.out.println("2 - Resta");
		        System.out.println("3 - Multiplicación");
		        System.out.println("4 - División");
		        
		        System.out.print("Selecciona la operación (1-4): ");
		        int operacion = scanner.nextInt();
		        
		        double resultado;
		        boolean operacionValida = true;
		        
		        switch (operacion) {
		            case 1:
		                resultado = num1 + num2;
		                System.out.println("Resultado: " + resultado);
		                break;
		            case 2:
		                resultado = num1 - num2;
		                System.out.println("Resultado: " + resultado);
		                break;
		            case 3:
		                resultado = num1 * num2;
		                System.out.println("Resultado: " + resultado);
		                break;
		            case 4:
		                if (num2 != 0) {
		                    resultado = num1 / num2;
		                    System.out.println("Resultado: " + resultado);
		                } else {
		                    System.out.println("ERROR: No se puede dividir por cero");
		                }
		                break;
		            default:
		                System.out.println("ERROR: Operación no válida");
		                break;
		        }
		        
		    }
		}