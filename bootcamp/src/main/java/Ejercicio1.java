import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingrese horas trabajadas:");
        Scanner input = new Scanner(System.in);
        int horasTrab = input.nextInt();
        int horasExtras;
        int pagoTotal = 0;
        if (horasTrab > 40) {
            horasExtras = horasTrab - 40;
            if (horasExtras > 8) {
                pagoTotal = 3 * (horasExtras - 8) * 40 + 2 * 8 * 40  + 1 * 40 * 40;
            } else  {
                pagoTotal = 2 * horasExtras * 40 + 1 * 40 * 40;
            }
        } else {
            pagoTotal = horasTrab * 40;
        }
        System.out.println("El pago por las " + horasTrab + " horas trabajadas es: $" + pagoTotal);
    }
}
