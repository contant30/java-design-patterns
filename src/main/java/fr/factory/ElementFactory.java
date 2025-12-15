package fr.factory;

import fr.factory.type.Additif;
import fr.factory.type.Allergene;
import fr.factory.type.Ingredient;

public class ElementFactory {


    public static Element getInstance(TypeElement type,String nom,double valeur,Unite unite) {

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
