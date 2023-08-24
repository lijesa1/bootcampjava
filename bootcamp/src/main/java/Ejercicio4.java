import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero:");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        for (int i = 1; i < numero; i=i+2) {
            System.out.println(i);
        }
    }
}
