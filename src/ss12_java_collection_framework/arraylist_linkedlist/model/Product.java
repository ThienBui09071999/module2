package ss12_java_collection_framework.arraylist_linkedlist.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name,  String description,double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+" [id=" + id + ", description=" + description + ", price=" + price + "]";
    }
}
