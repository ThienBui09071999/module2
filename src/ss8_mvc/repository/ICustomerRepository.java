package ss8_mvc.repository;

import ss8_mvc.model.Customer;

public interface ICustomerRepository {
    Customer[] getAll();
    void add(Customer customer);
}
