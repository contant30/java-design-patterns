package fr.factory;

import fr.diginamic.commun.Additif;
import fr.diginamic.commun.Allergene;
import fr.diginamic.commun.Element;
import fr.diginamic.commun.Ingredient;
import fr.diginamic.commun.TypeElement;
import fr.diginamic.commun.Unite;

public class ElementFactory {


    public static Element getInstance(TypeElement type, String nom, double valeur, Unite unite) {

        switch (type) {

            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            default:
                throw new IllegalArgumentException("Type d’élément inconnu : " + type);
        }
    }



}
