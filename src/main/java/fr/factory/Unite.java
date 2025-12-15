package fr.factory;

public enum Unite {

    MICRO(0.000001),
    MILLI(0.001);

    private final double facteur;

    Unite(double facteur) {
        this.facteur = facteur;
    }

    public double getFacteur() {
        return facteur;
    }
}