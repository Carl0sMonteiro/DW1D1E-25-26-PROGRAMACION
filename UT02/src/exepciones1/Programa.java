package exepciones1;

import java.util.Scanner;

public class Programa {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int numero = Utils.leerNumero(sc);
	System.out.printf("El número es: %d.\n", numero);
	}
}
