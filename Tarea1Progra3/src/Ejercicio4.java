import java.util.Random;
public class Ejercicio4 {
    public static void main(String[] args) {
        //Ejercicio 4
    int longitud = 10;

    int[] numerosAleatorios = new int[longitud];

    Random random = new Random();
    for(int i = 0; i < numerosAleatorios.length; i++) {
        numerosAleatorios[i] = random.nextInt(11);
    }

    System.out.println("Los numeros aleatorios generados son: ");
    for(int numero : numerosAleatorios) {
        System.out.println(numero + " ");
    }
    }
}
