package dev.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> allCustomers() {
        return customerRepository.findAll();

    }

    public Optional<Customer> singleCustomer(int custId) {
        return customerRepository.findCustomerByCustId(custId);
    }
}
