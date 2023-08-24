import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Ingrese el valor de n:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] miArreglo = new int[n];
        Random numAleatorio = new Random();
        for (int i = 0; i < n; i++) {
            int valor = numAleatorio.nextInt(100);
            miArreglo[i] = valor;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("El elemento " + i + " es: " + miArreglo[i]);
        }
    }
}