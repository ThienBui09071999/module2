package ss8_mvc_product.repository;

import ss8_mvc_product.model.Product;

public interface IProductRepository {
    Product[] getAll();
    void add(Product product);
}
