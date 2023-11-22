package ss8_mvc.view;


import ss8_mvc.controller.CustomerController;
import ss8_mvc.model.Customer;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static final int DISPLAY =1;
    private static  final  int ADD =2;
    private static  final  int EDIT =3;

    public static void main(String[] args) {
        // khai báo một controller
        CustomerController customerController = new CustomerController();
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
                    Customer[] customers = customerController.getAll();
                    displayCustomerList(customers);
                    break;
                case ADD:
                    Customer customer = inputDataCustomer();
                    customerController.add(customer);
                    System.out.println("Thêm mới thành công");
                    break;
                case EDIT:
                    System.out.println("Chức năng chỉnh sửa");
                    break;
                default:
                    flag = false;
                    System.out.println("Kết thúc");
            }

        }while (flag);
    }
    // method hiển thị dữ liệu
    public  static void displayCustomerList(Customer[] customers){
        for (Customer cus: customers) {
            if (cus!=null){
                System.out.println(cus);
            } else {
                break;
            }

        }
    }
    // method nhập dữ liệu cho Customer
    public static Customer inputDataCustomer(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        Customer customer = new Customer(id, name);
        return customer;
    }
}
