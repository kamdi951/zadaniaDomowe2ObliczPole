package zadaniaDomowe2ObliczPole;

public class Kwadrat implements Figura {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double obliczPowierzchnię() {
        double p = bok * bok;
        return p;
    }

    @Override
    public String komunikat() {
        return ("Pole Kwadratu o boku " + bok + " to: " + obliczPowierzchnię());
    }
}
