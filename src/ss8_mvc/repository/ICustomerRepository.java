package ss8_mvc.repository;


import ss8_mvc.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    List<Customer> searchByName(String searchName);
    void add(Customer customer);
    void delete(int id);
}
