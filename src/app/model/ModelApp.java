package app.model;

import app.entity.Product;

import java.util.HashMap;
import java.util.Map;

public class ModelApp {

    public Map<Integer, Product> initMap() {
        Map<Integer, Product> map = new HashMap<>();

        map.put(15, new Product("Boll", 15, 15300));
        map.put(201, new Product("Doll", 25, 35950));
        map.put(3, new Product("Car", 7, 28535));
        map.put(481, new Product("Plain", 5, 20000));

        return map;
    }
}
