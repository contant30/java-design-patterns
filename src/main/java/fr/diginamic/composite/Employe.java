package fr.diginamic.composite;

public class Employe implements IElement {

    private String nom;
    private String prenom;
    private Double salaire;

    public Employe(String nom, String prenom, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public double calculerSalaire() {
        return salaire;
    }

    public String getNom() {return nom;}
    public Double getSalaire() {return salaire;}
    public String getPrenom() {return prenom;}



}
