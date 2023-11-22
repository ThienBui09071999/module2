package ss8_mvc_product.controller;

import ss8_mvc_product.model.Product;
import ss8_mvc_product.service.IProductService;
import ss8_mvc_product.service.ProductService;

public class ProductController {
    private IProductService productService = new ProductService();

    public Product[] getAll(){
        return productService.getAll();
    }
    public void add (Product product){
        productService.add(product);
    }
}
