package fr.diginamic.singleton;

import java.util.HashMap;
import java.util.ResourceBundle;

public class Configuration {

    private static final Configuration SINGLETON = new Configuration();

    private HashMap<String, String> stockage = new HashMap<>();

    // Constructeur
    private Configuration() {
        ResourceBundle res = ResourceBundle.getBundle("configuration");
        for (String cle : res.keySet()){
            String valeur = res.getString(cle);
            stockage.put(cle, valeur);
        }
    }


    public static Configuration getInstance() {
        return SINGLETON;
    }

    public String getValeur(String cle) {
        return stockage.get(cle);
    }
}