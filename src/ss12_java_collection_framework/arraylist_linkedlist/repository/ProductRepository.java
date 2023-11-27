package ss12_java_collection_framework.arraylist_linkedlist.repository;

import ss12_java_collection_framework.arraylist_linkedlist.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> products = new ArrayList<>();

    @Override
    public ArrayList<Product> getAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void remove(int i) {
        products.remove(i);
    }

    @Override
    public void edit(int id, String name, String description, double price) {
        products.get(id).setName(name);
        products.get(id).setDescription(description);
        products.get(id).setPrice(price);
    }

    @Override
    public List<Product> cloneProduct(){
        ArrayList<Product> productClone = new ArrayList<>();
        for (int i =0;i< products.size();i++){
            productClone.add(products.get(i));
        }
        return productClone;
    }
}
