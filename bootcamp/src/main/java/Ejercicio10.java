import java.util.Random;
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        // Generar numero aleatorio
        Random rand = new Random();
        int numAleatorio = rand.nextInt(100);
        int numCandidato;
        int intentos = 0;

        do {
            System.out.println("Ingrese número a adivinar: ");
            Scanner input = new Scanner(System.in);
            numCandidato = input.nextInt();

            if (numCandidato == numAleatorio) {
                System.out.println("¡Felicidades! ¡Haz adivinado el número!, en " + intentos + " intentos");
            } else if (numCandidato > numAleatorio) {
                System.out.println("Número demasiado alto, intenta nuevamente.");
            } else {
                System.out.println("Número demasiado bajo, intenta nuevamente");
            }
            intentos++;
        } while (numCandidato != numAleatorio);

    }
}
