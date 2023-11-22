package ss8_mvc.service.impl;

import ss8_mvc.model.Customer;
import ss8_mvc.repository.CustomerRepository;
import ss8_mvc.repository.ICustomerRepository;
import ss8_mvc.service.ICustomerService;

public class CustomerService implements ICustomerService {
    // khai báo một repository
   private ICustomerRepository customerRepository = new CustomerRepository();
   @Override
   public Customer[] getAll() {
       // sử dụng method của repostiory
       return customerRepository.getAll();
   }

   @Override
   public void add(Customer customer) {
       // sử dụng method của repository
       customerRepository.add(customer);
   }
}
