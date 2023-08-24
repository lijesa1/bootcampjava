public class Triangulo extends Figura {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - this.ladoA) * (semiperimetro - this.ladoB) * (semiperimetro - this.ladoC));
    }

    public double calcularPerimetro() {
        return (this.ladoA + this.ladoB + this.ladoC);
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

}