import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Ingrese el valor de n:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}