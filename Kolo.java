package zadaniaDomowe2ObliczPole;

public class Kolo implements Figura {
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPowierzchnię() {
        double p = promien * promien * Math.PI;
        return p;
    }

    @Override
    public String komunikat() {
        return "Pole Koła o promieniu " + promien + " to: " + obliczPowierzchnię();
    }
}


