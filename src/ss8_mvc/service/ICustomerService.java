package ss8_mvc.service;

import ss8_mvc.model.Customer;

public interface ICustomerService {
    Customer[] getAll();
    void add(Customer customer);
}
