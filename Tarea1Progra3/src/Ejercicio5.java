import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        //Ejercicio  5
        char[] abedecerio = new char[26];
        for(int i = 0; i < 26; i++) {
            abedecerio[i] = (char) ('A' + i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una letra: ");
        for(char letra : abedecerio) {
            System.out.println(letra + " ");
        }
        System.out.println();

        int posicion;
        do{
            System.out.println("Ingrese la letra que desea obtener la posicion: ");
            posicion = scanner.nextInt();

            if(posicion >= 0 && posicion < 26){
                System.out.println("La letra " + abedecerio[posicion] + " esta en la posicion " + posicion);
            }else if(posicion != -1){
                System.out.println("La posicion ingresada esta fuera del rango permitido. Por favor, ingrese un numero entre 0 y 25 para definir la posicion ");
            }
        }while(posicion != -1);

        scanner.close();
        }
    }

