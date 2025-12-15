package fr.factory;

public enum Unite {

    MICRO("Micro"),
    MILLI("Milli");

    private String libelle;

    Unite(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}