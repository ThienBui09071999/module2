package ss8_mvc.repository;

import ss8_mvc.model.Customer;

public class CustomerRepository implements ICustomerRepository {
    // tam thời tạo một mảng giả để lưu dữ liệu
    private static Customer[] customers = new Customer[10];
    static {
        customers[0] = new Customer(1,"Chánh1");
        customers[1] = new Customer(2,"Chánh1");
        customers[2] = new Customer(3,"Chánh1");
    }
    @Override
    public Customer[] getAll() {
        // sau nay sẽ đọc dữ liệu từ  file
        // hiện tại sẽ trả về mảng giả thôi
        return customers;
    }

    @Override
    public void add(Customer customer) {
        // sau này sẽ ghi vào file
        for (int i = 0; i < customers.length; i++) {
            if (customers[i]==null){
                customers[i]= customer;
                break;
            }
        }
    }

}
