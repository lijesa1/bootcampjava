import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ingrese la edad del usuario:");
        Scanner input = new Scanner(System.in);
        int edad = input.nextInt();
        if (edad >= 15) {
            System.out.println("Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0:");
            int regalo = input.nextInt();
            if (regalo == 1) {
                System.out.println("El invitado sí puede ingresar a la fiesta.");
            }else{
                System.out.println("Usted no puede ingresar a la fiesta porque es mayor de 15 y no trajo regalo");
            }
        } else {
            System.out.println("El invitado si puede ingresar a la fiesta");
        }

    }
}