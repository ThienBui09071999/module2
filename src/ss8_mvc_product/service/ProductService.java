package ss8_mvc_product.service;

import ss8_mvc_product.model.Product;
import ss8_mvc_product.repository.IProductRepository;
import ss8_mvc_product.repository.ProductRepository;

public class ProductService implements IProductService{
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public Product[] getAll() {
        return productRepository.getAll();
    }

    @Override
    public void add(Product product) {
    productRepository.add(product);
    }
}
