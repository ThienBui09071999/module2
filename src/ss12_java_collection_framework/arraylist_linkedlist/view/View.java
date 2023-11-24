package ss12_java_collection_framework.arraylist_linkedlist.view;

import ss12_java_collection_framework.arraylist_linkedlist.controller.ProductController;
import ss12_java_collection_framework.arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.arraylist_linkedlist.service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
     static ProductService productController = new ProductService();

    private static Scanner scanner = new Scanner(System.in);
    private static final int DISPLAY =1;
    private static  final  int ADD =2;
    private static  final  int EDIT =3;
    private static  final  int REMOVE =4;
    private static  final  int SEARCH =5;
    private static  final  int SORT =6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1.Hiển thị danh sách\n" +
                    "2.Thêm mới\n" +
                    "3.Chỉnh sửa\n" +
                    "4.Xoá\n" +
                    "5.Tìm kiếm\n" +
                    "6.Sắp xếp\n" +
                    "7.Thoát");
            System.out.print("Chức năng bạn chọn là: ");
            int choose = Integer.parseInt(scanner.nextLine());
            int id;
            switch (choose){
                case DISPLAY:
                    ArrayList<Product> products= productController.getAll();
                    displayProductList(products);
                    break;
                case ADD:
                    System.out.println("Chức năng Thêm mới");
                    Product product = productController.inputDataProduct();
                    productController.add(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case EDIT:
                    System.out.println("Chức năng chỉnh sửa");
                    id = inputId();
                    productController.edit(id);
                    break;
                case REMOVE:
                    System.out.println("Chức năng xoá");
                    id = inputId();
                    productController.remove(id);
                    System.out.println("Xoá mới thành công");
                    break;
                case SEARCH:
                    System.out.println("Chức năng Tìm kiếm ");
                    System.out.print("Nhập tên bạn cần tìm kiếm: ");
                    String name  = scanner.nextLine();
                    productController.search(name);
                    break;
                case SORT:
                    System.out.println("Chức năng Sắp xếp ");
                    sort();
                    break;
                default:
                    flag = false;
                    System.out.println("Kết thúc");
            }
        } while (flag);
    }
    public static void displayProductList(ArrayList<Product> products){
        for (Product product:products){
            System.out.println(product);
        }
    }
//    public static void deleteProduct(int id) {
//        ArrayList<Product> products= productController.getAll();
//        for (Product product:products){
//            if (product.getId()==id){
//                products.remove(id);
//            }
//        }
//    }
    private static int inputId() {
        System.out.print("Nhập ID cần chỉnh sửa: ");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void sort(){
        System.out.println("Loại sắp xếp: ");
        System.out.println("1: Tăng dần");
        System.out.println("2: Giảm dần");
        System.out.println("Số khác. Quay lại Menu");
        System.out.print("Nhập loại cần sắp xếp: ");
        int value = Integer.parseInt(scanner.nextLine());
        switch (value){
            case 1:
                productController.sort(true);
                break;
            case 2:
                productController.sort(false);
                break;
        }
    }
}
