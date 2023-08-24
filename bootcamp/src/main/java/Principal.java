public class Principal {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(2, 7);
        Triangulo triangulo = new Triangulo(3, 4, 5);

        System.out.println(circulo.calcularArea());
        System.out.println(rectangulo.calcularArea());
        System.out.println(triangulo.calcularArea());
    }
}