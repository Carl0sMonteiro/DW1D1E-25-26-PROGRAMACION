package exepciones1;

import java.util.Scanner;

public class Utils {  
public static int leerNumero(Scanner sc) {
	int numero;
	while (true) {
	try {
	System.out.print("Introduzca un número entero: ");
	numero = Integer.parseInt(sc.nextLine());
	return numero;
} 
	catch (NumberFormatException e) {
	System.err.println("El valor introducido no es un número válido");
			}
		}
	}
}
