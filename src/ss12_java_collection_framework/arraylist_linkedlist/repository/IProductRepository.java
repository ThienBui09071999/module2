package ss12_java_collection_framework.arraylist_linkedlist.repository;

import ss12_java_collection_framework.arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    ArrayList<Product> getAll();
    void add(Product product);
    void remove(int id);
    void edit(int id, String name, String description, double price);
    List<Product> cloneProduct();

}
