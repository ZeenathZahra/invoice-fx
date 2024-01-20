package dev.example.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "invoices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Id
    private ObjectId id;
    private int invNum;
    private String invoice_date;
    private String customer_name;
    @DocumentReference
    private List<Customer> customer_id;
    private String product_names;
    @DocumentReference
    private List<Product> product_id;
    private List<String> units_per_product;
    private List<String> total_price_per_product;
    private List<String> discount_per_product;




}

