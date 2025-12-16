package fr.diginamic.builder;

import fr.diginamic.commun.Additif;
import fr.diginamic.commun.Allergene;
import fr.diginamic.commun.Categorie;
import fr.diginamic.commun.Ingredient;
import fr.diginamic.commun.Marque;

import java.util.ArrayList;
import java.util.List;

public class Produit {

    private String nom;
    private String grade;

    private List<Additif> additifs = new ArrayList<>();
    private List<Ingredient> ingredients = new ArrayList<>();
    private List<Allergene> allergenes = new ArrayList<>();
    private Marque marque;
    private Categorie categorie;

    public Produit(String nom, String grade) {
        this.nom = nom;
        this.grade = grade;
    }

    public Produit() {}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getGrade() {return grade;}
    public void setGrade(String grade) {this.grade = grade;}
    public List<Additif> getAdditifs() {return additifs;}
    public void setAdditifs(List<Additif> additifs) {this.additifs = additifs;}
    public List<Ingredient> getIngredients() {return ingredients;}
    public List<Allergene> getAllergenes() {return allergenes;}
    public Marque getMarque() {return marque;}
    public void setMarque(Marque marque) {this.marque = marque;}
    public Categorie getCategorie() {return categorie;}
    public void setCategorie(Categorie categorie) {this.categorie = categorie;}
    public void ajouterIngredient(Ingredient ingredient) {this.ingredients.add(ingredient);}
    public void ajouterAllergene(Allergene allergene) {this.allergenes.add(allergene);}

    public void ajouterAdditif(Additif additif) {
        this.additifs.add(additif);
    }

}
