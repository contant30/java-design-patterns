package fr.diginamic.builder;

import fr.diginamic.commun.Unite;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProduitBuilderTest {


    @Test
    public void renseigneLeNom() {
        Produit produit = new ProduitBuilder()
                .withNomProduit("Pizza 4 fromages")
                .withGrade("B")
                .assemble();

        assertEquals("Pizza 4 fromages", produit.getNom());
    }

    @Test(expected = IllegalStateException.class)
    public void sansNom() {
        new ProduitBuilder()
                .withGrade("B")
                .assemble();
    }

    @Test
    public void casNominal() {
        Produit produit = new ProduitBuilder()
                .withNomProduit("Pizza")
                .withGrade("B")
                .withCategorie("Plats préparés")
                .withMarque("Carrefour")
                .addIngredient("Mozzarella", 30.0, Unite.MICRO)
                .addAdditif("E250", 5.0, Unite.MILLI)
                .assemble();

        assertEquals("Pizza", produit.getNom());
        assertEquals("B", produit.getGrade());
        assertNotNull(produit.getCategorie());
        assertEquals("Plats préparés", produit.getCategorie().getNom());
        assertNotNull(produit.getMarque());
        assertEquals("Carrefour", produit.getMarque().getNom());
        assertEquals(1, produit.getIngredients().size());
        assertEquals(1, produit.getAdditifs().size());
    }

    @Test
    public void casAlternatif() {
        Produit produit = new ProduitBuilder()
                .withNomProduit("Pizza 4 fromages")
                .withGrade("d")
                .addIngredient("Mozzarella", 30.0, Unite.MICRO)
                .addAdditif("E250", 5.0, Unite.MILLI)
                .assemble();

        assertEquals("Pizza 4 fromages", produit.getNom());
        assertEquals("d", produit.getGrade());
        assertNull(produit.getCategorie());
        assertNull(produit.getMarque());
        assertEquals(1, produit.getIngredients().size());
        assertEquals(1, produit.getAdditifs().size());
    }
}
