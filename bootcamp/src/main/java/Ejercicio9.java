import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del arreglo : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] miArreglo = new int[n];

        for (int i = 0; i < miArreglo.length; i++) {
            System.out.println("Ingrese valor de elemento: " + i);
            int valor = input.nextInt();
            miArreglo[i] = valor;
        }

        revertir(miArreglo, miArreglo.length);
    }

    static void revertir(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("arreglo revertido es: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
}