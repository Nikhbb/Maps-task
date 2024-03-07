package app.entity;

public class Product {
    private String name;
    private int count;
    private int priceCop;

    public Product(String name, int count, int priceCop) {
        this.name = name;
        this.count = count;
        this.priceCop = priceCop;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", count=" + count +
                ", priceCop=" + priceCop;
    }
}
