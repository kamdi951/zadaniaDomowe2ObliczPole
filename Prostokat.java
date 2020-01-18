package zadaniaDomowe2ObliczPole;

public class Prostokat implements Figura {
    private double bok1;
    private double bok2;

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public double obliczPowierzchnię() {
        double p = bok1 * bok2;
        return p;
    }

    @Override
    public String komunikat() {
        return ("Pole Prostokąta o bokach " + bok1 + " i " + bok2 + " to: " + obliczPowierzchnię());
    }
}
