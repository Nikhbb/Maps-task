package app.view;

import app.entity.Product;

import java.util.Map;
import java.util.Scanner;

public class ViewApp {
    public void printMenu() {
        System.out.println("\nMENU\n0-exit\n1-print all products\n2-print one product");
    }

    public void printCollection(Map<Integer, Product> products) {
        int i = 1;
        System.out.println("\nPrint all products:");
        for (Map.Entry<Integer, Product> element : products.entrySet()) {
            System.out.println(i + ") id=" + element.getKey() + ", " + element.getValue());
            i++;
        }
    }

    public void printProductToIndex(Map<Integer, Product> products, int id) {
        System.out.println("\nPrint one product:");
        try {
            System.out.println("id=" + id + ", " + products.get(id));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("This id not found.");
        }
    }

    public int getMenuNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choose: ");
        return sc.nextInt();
    }

    public int getIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input index: ");
        return sc.nextInt();
    }
}
