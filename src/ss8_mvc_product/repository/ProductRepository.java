package ss8_mvc_product.repository;

import ss8_mvc_product.model.Product;

public class ProductRepository implements IProductRepository{
    private static Product[] products = new Product[10];
    static {
        products[0] = new Product(1,"iPhone11",12000000,"Gold Pink");
        products[1] = new Product(2,"iPhone12",15000000,"Green");
        products[2] = new Product(3,"iPhone13",17000000,"Black Star");
    }

    @Override
    public Product[] getAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null){
                products[i] = product;
                break;
            }
        }
    }

}
