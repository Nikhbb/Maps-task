package app.controller;

import app.entity.Product;
import app.model.ModelApp;
import app.view.ViewApp;

import java.util.Map;

public class ControllerApp {
    private Map<Integer, Product> productMap;
    private final ViewApp viewApp = new ViewApp();
    private final ModelApp modelApp = new ModelApp();

    public void run() {
        productMap = modelApp.initMap();
        int menuNumber;

        do {
            viewApp.printMenu();
            menuNumber = viewApp.getMenuNumber();

            switch (menuNumber) {
                case 0:
                    System.out.println("See you.");
                    break;
                case 1:
                    viewApp.printCollection(productMap);
                    break;
                case 2:
                    viewApp.printProductToIndex(productMap, viewApp.getIndex());
                    break;
                default:
                    System.out.println("Enter 0 for EXIT");
            }
        } while (menuNumber != 0);
    }

}
