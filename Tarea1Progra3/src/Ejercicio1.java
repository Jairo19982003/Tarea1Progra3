public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio 1
        int[] numeros = new int[100];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //Ejercicio 2
        int suma = 0;
        for(int numero : numeros) {
            suma += numero;
        }

        double media = (double) suma / numeros.length;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La media de los numeros es: " + media);

    }
}
