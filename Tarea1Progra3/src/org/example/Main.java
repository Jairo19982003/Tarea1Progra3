package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();

        int[] numeros = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un numero entre 0 y 10 para definir la posicion " + i + " : ");
            int numero = scanner.nextInt();

            while (numero < 0 || numero > 10) {
                System.out.println("El numero ingresado esta fuera del rango permitido. Por favor, ingrese un numero entre 0 y 10 para definir la posicion ");
                System.out.println("Ingrese un numero entre 0 y 10 para definir la posicion " + i + " : ");
                numero = scanner.nextInt();
            }

            numeros[i] = numero;
        }

        System.out.println("El array ingresado es: ");
        for(int numero : numeros) {
            System.out.println(numero + " ");
        }

        scanner.close();

    }
}