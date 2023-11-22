package ss8_mvc.controller;

import ss8_mvc.model.Customer;
import ss8_mvc.service.ICustomerService;
import ss8_mvc.service.impl.CustomerService;

public class CustomerController {

    private ICustomerService customerService = new CustomerService();

    public Customer[] getAll(){
        // goi từ service
        return customerService.getAll();
    }
    public void add (Customer customer){
        // gọi service
        customerService.add(customer);
    }
}
