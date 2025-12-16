package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Configuration {

    private static final Configuration SINGLETON = new Configuration();

    private ResourceBundle configuration;

    // Constructeur
    private Configuration() {
        configuration = ResourceBundle.getBundle("configuration");
    }

        public static Configuration getInstance() {
        return SINGLETON;
    }

    public String getValeur(String key) {
        return configuration.getString(key);
    }
}