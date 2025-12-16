package fr.diginamic.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SingletonTest {

    @Test
    public void testGetInstance_RetourneToujoursLaMemeInstance() {
        Configuration config1 = Configuration.getInstance();
        Configuration config2 = Configuration.getInstance();

        assertSame(config1, config2); // Vérifie que c'est bien la même instance
    }

    @Test
    public void testGetValeur_RetourneLaValeurCorrespondante() {
        Configuration config = Configuration.getInstance();
        String url = config.getValeur("db.url");
        String user = config.getValeur("db.user");
        String password = config.getValeur("db.password");

        assertEquals("jdbc:mysql://localhost:3306/mabase", url);
        assertEquals("root", user);
        assertEquals("1234", password);

        System.out.println(url);
    }

    @Test
    public void testGetValeur_DbUser_RetourneRoot() {
        Configuration config = Configuration.getInstance();
        String user = config.getValeur("db.user");

        assertEquals("root", user);
    }

}