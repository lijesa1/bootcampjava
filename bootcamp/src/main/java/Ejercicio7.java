import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero para hallar el factorial : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Ejercicio7 ejercicio7 = new Ejercicio7();
        long factorial = ejercicio7.resolverFactorial(num);
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    public long resolverFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
