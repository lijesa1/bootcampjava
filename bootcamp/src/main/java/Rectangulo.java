public class Rectangulo extends Figura {

    private double ancho;
    private double altura;

    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ancho * altura;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + altura);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
