package dev.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomer(){
        return new ResponseEntity<List<Customer>>(customerService.allCustomers(), HttpStatus.OK);
    }
    @GetMapping("/{custId}")
    public ResponseEntity<Optional<Customer>> getSingleCustomer(@PathVariable int custId) {
        return new ResponseEntity<Optional<Customer>>(customerService.singleCustomer(custId), HttpStatus.OK);

    }

}
