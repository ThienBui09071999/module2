package ss12_java_collection_framework.arraylist_linkedlist.controller;

import ss12_java_collection_framework.arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.arraylist_linkedlist.service.IProductService;
import ss12_java_collection_framework.arraylist_linkedlist.service.ProductService;

import java.util.ArrayList;

public class ProductController {
    private IProductService productService = new ProductService();

    public ArrayList<Product> getAll(){
        return productService.getAll();
    }
    public void add(Product product){
        productService.add(product);
    }
    public void remove(int id){
        productService.remove(id);
    }
    public void edit(int id){
        productService.edit(id);
    }
    public Product inputDataProduct(){
        return productService.inputDataProduct();
    }
    public void search(String name){
        productService.search(name);
    }
    public void sort(boolean reverse){
        productService.sort(reverse);
    }

}
