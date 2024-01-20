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
@RequestMapping("/api/v1/invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;
    @GetMapping
    public ResponseEntity<List<Invoice>> getAllInvoice(){
        return new ResponseEntity<List<Invoice>>(invoiceService.allInvoices(), HttpStatus.OK);
    }
    @GetMapping("/{invNum}")
    public ResponseEntity<Optional<Invoice>> getSingleCustomer(@PathVariable int invNum) {
        return new ResponseEntity<Optional<Invoice>>(invoiceService.singleInvoice(invNum), HttpStatus.OK);

    }

}
