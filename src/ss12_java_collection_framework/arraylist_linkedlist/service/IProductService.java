package ss12_java_collection_framework.arraylist_linkedlist.service;

import ss12_java_collection_framework.arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.arraylist_linkedlist.repository.ProductRepository;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> getAll();
    void add(Product product);
    void remove(int id);
    void edit(int id);
    Product inputDataProduct();
    void search(String name);
    void sort(boolean reverse);

}
