package fr.diginamic.composite;

import fr.diginamic.composite.Service;


public class CompositeTest {

    public static void main(String[] args) {

        // DSIN
        Service dsin = new Service("DSIN");

        Employe directrice = new Employe("RASPEY", "Cécile", 100000.0);
        Employe architecte = new Employe("BECHKAR", "Bilal", 80000.);

        dsin.ajouterElement(directrice);
        dsin.ajouterElement(architecte);

        // Big Data
        Service bigData = new Service("Big Data");

        Employe chefBigData = new Employe("RAMEY", "JB", 75000.);
        Employe concepteur = new Employe("DOE", "Jane", 35000.);

        bigData.ajouterElement(chefBigData);
        bigData.ajouterElement(concepteur);

        // Java Dev
        Service javaDev = new Service("Java Dev");

        Employe chefJava = new Employe("GUINEAU", "Kevin", 75000.);
        Employe leadDev = new Employe("MARTIN", "Paul", 35000.);

        javaDev.ajouterElement(chefJava);
        javaDev.ajouterElement(leadDev);


        dsin.ajouterElement(bigData);
        dsin.ajouterElement(javaDev);

        System.out.println("Salaire total Big Data : " + bigData.calculerSalaire());
        System.out.println("Salaire total Java Dev : " + javaDev.calculerSalaire());
        System.out.println("Salaire total DSIN : " + dsin.calculerSalaire());


    }
}
