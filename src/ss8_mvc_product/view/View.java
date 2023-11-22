package ss8_mvc_product.view;

import ss8_mvc_product.controller.ProductController;
import ss8_mvc_product.model.Product;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static final int DISPLAY =1;
    private static  final  int ADD =2;
    private static  final  int EDIT =3;

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1.Hiển thị danh sách\n" +
                    "2.Thêm mới\n" +
                    "3.Chỉnh sửa\n" +
                    "4.Thoát");
            System.out.print("Chức năng bạn chọn là: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case DISPLAY:
                    Product[] products = productController.getAll();
                    displayProductList(products);
                    break;
                case ADD:
                    Product product = inputDataProduct();
                    productController.add(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case EDIT:
                    System.out.println("Chức năng chỉnh sửa");
                    break;
                default:
                    flag = false;
                    System.out.println("Kết thúc");
            }
        } while (flag);
    }
    public static void displayProductList(Product[] products){
        for (Product product:products){
            if (product != null){
                System.out.println(product);
            } else {
                break;
            }
        }
    }
    public static Product inputDataProduct(){
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("/nNhập tên: ");
        String name = scanner.nextLine();
        System.out.print("/nNhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("/nNhập mô tả:");
        String description = scanner.nextLine();
        Product product = new Product(id,name,price,description);
        return product;
    }
}
