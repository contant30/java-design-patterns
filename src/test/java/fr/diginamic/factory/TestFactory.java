package fr.diginamic.factory;

import fr.factory.type.Additif;
import fr.factory.type.Allergene;
import fr.factory.Element;
import fr.factory.ElementFactory;
import fr.factory.type.Ingredient;
import fr.factory.TypeElement;
import fr.factory.Unite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestFactory {

    // test création d'un ingredient
    @Test
    public void testCreationIngredient() {

        Element e = ElementFactory.getInstance(TypeElement.INGREDIENT, "Sucre", 5.0, Unite.MILLI);

        assertTrue(e instanceof Ingredient);
        assertEquals("Sucre", e.getNom());
        assertEquals(5.0, e.getValeur(), 0.0000001);
        assertEquals(Unite.MILLI, e.getUnite());
    }

    // test création d'un Allergene
    @Test
    public void testCreationAllergene() {

        Element e = ElementFactory.getInstance(TypeElement.ALLERGENE, "Gluten", 0.111, Unite.MICRO);

        assertTrue(e instanceof Allergene);
        assertEquals("Gluten", e.getNom());
        assertEquals(0.1, e.getValeur(), 0.0000001);
        assertEquals(Unite.MICRO, e.getUnite());
    }

    // test création d'un Additif

    @Test
    public void testCreationAdditif() {

        Element e = ElementFactory.getInstance(TypeElement.ADDITIF, "E330", 10.0, Unite.MILLI);

        assertTrue(e instanceof Additif);
        assertEquals("E330", e.getNom());
        assertEquals(2.0, e.getValeur(), 0.0000001);
        assertEquals(Unite.MILLI, e.getUnite());
    }
}