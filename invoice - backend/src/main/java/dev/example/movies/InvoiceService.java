package dev.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;
    public List<Invoice> allInvoices() {
        return invoiceRepository.findAll();

    }

    public Optional<Invoice> singleInvoice(int invNum) {
        return invoiceRepository.findInvoicesByInvNum(invNum);
    }
}
