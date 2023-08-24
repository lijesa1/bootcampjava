import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Ingrese el consumo de agua en litros:");
        Scanner input = new Scanner(System.in);
        double consumo = input.nextDouble();
        double pagoConsumo200=0;
        double pagoConsumo50=0;
        double pagoConsumoTotal = 0.0;

        if (consumo > 200) {
            pagoConsumo200 = 1.5 * (consumo - 200);
            pagoConsumo50 = 0.5 * 150;
        } else if (consumo > 50) {
            pagoConsumo50 = 0.5 * (consumo - 50);
        }

        pagoConsumoTotal = 10 + pagoConsumo50 + pagoConsumo200;
        System.out.println("El pago por el consumo de " + consumo + " litros, es: $" + pagoConsumoTotal);
    }
}
