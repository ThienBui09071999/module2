package ss8_mvc_product.service;

import ss8_mvc_product.model.Product;

public interface IProductService {
    Product[] getAll();
    void add(Product product);
}
