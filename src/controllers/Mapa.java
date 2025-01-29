package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        //hashMapa();
        //linkedHashMapa();
        //treeMapa();
    }

    public void hashMapa() {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazo", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        // containsKey  cuenta las claves
        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("Kiwi"));

        // Optener valor
        System.out.println("Valor de pera: " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");

        System.out.println(mapa);
    }

    public void linkedHashMapa() {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazo", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        // containsKey  cuenta las claves
        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("Kiwi"));

        // Optener valor
        System.out.println("Valor de pera: " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");

        System.out.println(mapa);
    }

    public void treeMapa() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazo", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        // containsKey  cuenta las claves
        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("Kiwi"));

        // Optener valor
        System.out.println("Valor de pera: " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");

        System.out.println(mapa);
    }
}
