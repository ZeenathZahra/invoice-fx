package dev.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepositery productRepositery;

    public void saveorUpdate(Product product) {

        productRepositery.save(product);
    }

    public Iterable<Product> listAll() {

        return this.productRepositery.findAll();
    }


    public void deleteproduct(String _id) {

        productRepositery.deleteById(_id);
    }

    public Product getProductByID(String prodId) {

        return productRepositery.findById(prodId).get();
    }
}

