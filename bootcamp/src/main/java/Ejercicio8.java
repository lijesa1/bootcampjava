import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int mayor = 0;
        System.out.println("Ingrese el tamaño del arreglo : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] miArreglo = new int[n];

        for (int i = 0; i < miArreglo.length; i++) {
            System.out.println("Ingrese valor de elemento: " + i);
            int valor = input.nextInt();
            miArreglo[i] = valor;
        }
        for (int i = 0; i < miArreglo.length; i++) {
            System.out.println("elemento : " + i + " = " + miArreglo[i]);
            if (miArreglo[i] > mayor) {
                mayor = miArreglo[i];
            }
        }
        System.out.println("El elemento mas grande es: "+mayor);
    }
}