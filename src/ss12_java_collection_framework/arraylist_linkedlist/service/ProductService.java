package ss12_java_collection_framework.arraylist_linkedlist.service;

import ss12_java_collection_framework.arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.arraylist_linkedlist.repository.IProductRepository;
import ss12_java_collection_framework.arraylist_linkedlist.repository.ProductRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public ArrayList<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void add(Product product) {
    productRepository.add(product);
    }

    @Override
    public void remove(int id) {
       ArrayList<Product> temp=productRepository.getAll();
        boolean isExist = false;
        for (int i=0;i< temp.size();i++) {
            if (temp.get(i).getId() == id) {
                productRepository.remove(i);
                isExist = true;
                System.out.println("Xoá thành công");
            }
        }
        if (!isExist) {
            System.out.println("K tim thay id can xoa");
        }
    }

    @Override
    public void edit(int id) {
        ArrayList<Product> temp = productRepository.getAll();
        boolean isExist = false;
        for (int i=0;i< temp.size();i++) {
            if (temp.get(i).getId() == id) {
                System.out.print("Nhập tên mới :");
                String name = scanner.nextLine();
                System.out.print("Nhập giá tiền mới:");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập miêu tả mới: ");
                String description = scanner.nextLine();
                productRepository.edit(id,name,description,price);
                isExist = true;
                System.out.println("chỉnh sửa thành công");
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy sản phẩm cần chỉnh sửa");
        }
    }

    @Override
    public Product inputDataProduct() {
        int id = inputId();
        System.out.print("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá thành tiền : ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập mô tả : ");
        String description = scanner.nextLine();
        return new Product(id, name, description, price);
    }

    private  int inputId() {
        System.out.print("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        while (true){
            if(checkExistId(id)){
                System.out.println("ID đã tồn tại. Nhập lại");
                System.out.println("ID:");
                id = Integer.parseInt(scanner.nextLine());
            } else  return id;
        }
    }

    private   boolean checkExistId(int id){
        ArrayList<Product> temp = productRepository.getAll();
        for(Product product :temp){
            if (id == product.getId()){
                return true;
            }
        }
        return  false;
    }

    @Override
    public void search(String name) {
        ArrayList<Product> temp = productRepository.getAll();
        boolean isExist = false;
        for (Product product : temp) {
            if (product.getName().equals(name) ) {
                isExist = true;
                System.out.println("Tìm thấy sản phẩm");
                System.out.println(product);
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy sản phẩm cần tìm");
        }
    }

    @Override
    public void sort(boolean reverse) {
        List<Product> temp =new ArrayList<>();
        temp =productRepository.cloneProduct();
        if(reverse){
            Collections.sort(temp,new SortProductByPriceASC());
        } else Collections.sort(temp,new SortProductByPriceDEC());
        for (Product product : temp) {
            System.out.println(product);
        }
    }
}
