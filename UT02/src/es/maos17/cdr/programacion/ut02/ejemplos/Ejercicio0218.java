package es.maos17.cdr.programacion.ut02.ejemplos;
import java.util.Scanner;

public class Ejercicio0218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el año: ");
        int año = scanner.nextInt();
        
        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt();
        
        if (año < 0 || mes < 1 || mes > 12) {
            System.out.println("ERROR: Datos incorrectos");
        } else {
            int dias;
            
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dias = 30;
                    break;
                case 2:
                    // Verificar año bisiesto
                    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                default:
                    dias = -1;
                    break;
            }
            
            System.out.println("El mes tiene " + dias + " días");
        }

    }
}