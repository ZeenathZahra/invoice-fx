package dev.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productServices;

    @PostMapping(value = "/save")
    private String saveProduct(@RequestBody Product product) {

        productServices.saveorUpdate(product);
        return product.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Product> getProduct() {
        return productServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Product update(@RequestBody Product product, @PathVariable(name = "id") String _id) {
        product.set_id(_id);
        productServices.saveorUpdate(product);
        return product;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteProduct(@PathVariable("id") String _id) {
        productServices.deleteproduct(_id);
    }

    @RequestMapping("/search/{id}")
    private Product getProduct(@PathVariable(name = "id") String prodId) {
        return productServices.getProductByID(prodId);
    }

}