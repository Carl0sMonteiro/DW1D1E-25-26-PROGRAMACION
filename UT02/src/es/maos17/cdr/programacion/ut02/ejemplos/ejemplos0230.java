package es.maos17.cdr.programacion.ut02.ejemplos;
	import java.util.Scanner;
public class ejemplos0230 {

	public static void main(String[] args) {
		Scanner sc = new Sacanner(System.in);
				
				int i = 1;
				
				int numero = 0;
				
				while (numero <1 || numero >10) {
					System.out.print("introduce el numero del 1 al 10");
					numero = sc.nectInt();
				}
				
		
	}

}
