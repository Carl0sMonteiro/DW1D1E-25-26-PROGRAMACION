package es.maos17.cdr.programacion.ut02.ejemplos;

import java.util.Scanner;

public class Ejercicio0423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número inicial: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Introduce el número final: ");
        int fin = scanner.nextInt();
        
        if (inicio > fin) {
            System.out.println("Error: El número inicial debe ser menor o igual al final.");
        } else {
            for (int i = inicio; i <= fin; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
    }
}