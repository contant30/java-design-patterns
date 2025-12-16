package fr.diginamic.builder;

import fr.diginamic.commun.Additif;
import fr.diginamic.commun.Allergene;
import fr.diginamic.commun.Categorie;
import fr.diginamic.commun.Ingredient;
import fr.diginamic.commun.Marque;
import fr.diginamic.commun.Unite;

public class ProduitBuilder {

    private final Produit produit;


    public ProduitBuilder() {
        this.produit = new Produit();
    }

    public ProduitBuilder withNomProduit(String nomProduit) {
        this.produit.setNom(nomProduit);
        return this;
    }

    public ProduitBuilder withGrade(String grade) {
        this.produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder withCategorie(String nomCategorie) {
        if (nomCategorie != null && !nomCategorie.isBlank()) {
            this.produit.setCategorie(new Categorie(nomCategorie));
        }
        return this;
    }

    public ProduitBuilder withMarque(String nomMarque) {
        if (nomMarque != null && !nomMarque.isBlank()) {
            this.produit.setMarque(new Marque(nomMarque));
        }
        return this;
    }

    public ProduitBuilder addIngredient(String nom, double valeur, Unite unite) {
        this.produit.ajouterIngredient(new Ingredient(nom, valeur, unite));
        return this;
    }

    public ProduitBuilder addAllergene(String nom, double valeur, Unite unite) {
        this.produit.ajouterAllergene(new Allergene(nom, valeur, unite));
        return this;
    }

    public ProduitBuilder addAdditif(String nom, double valeur, Unite unite) {
        this.produit.ajouterAdditif(new Additif(nom, valeur, unite));
        return this;
    }

    // Contrôle
    public Produit assemble() {
        if (produit==null){
            throw new IllegalStateException("le produit est null");
        }

        if (produit.getNom() == null || produit.getNom().isBlank()) {
            throw new IllegalStateException("Le nom du produit est obligatoire");
        }
        return this.produit;
    }
}