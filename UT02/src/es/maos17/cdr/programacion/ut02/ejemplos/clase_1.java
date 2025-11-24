package es.maos17.cdr.programacion.ut02.ejemplos;

public class clase_1 {

	public static void main(String[] args) {
		calculamedias("miguel", 5, 7, 4, 9);
		calculamedias("maria", 8, 9, 6, 9, 5, 4);
		calculamedias("pedro", 8, 1);

	}
	public static void calculamedias(String nombre, int...notas ) {
		System.out.println("vamos a calcular la calificacion media de " + nombre);
		if (notas.length == 0) {
			System.out.println("no se han recibido datos");
		}
		else {
			int suma = 0;
			double media;
			for(int nota: notas){
				suma += nota;
			}
			media = (double) suma / notas.length;
			System.out.printf("la calificacion media es %.2f.\n", media);
		}
		
	}

}
