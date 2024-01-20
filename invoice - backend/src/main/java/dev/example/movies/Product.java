package dev.example.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String _id;
    private String prodId;
    private String product_name;
    private String description;
    private float purchase_price;
    private float selling_price;
    private int quantity;
    private String product_image;
    private List<String> backdrops;

    public String get_id() {
        return _id;
    }

    public String getProdId() {
        return prodId;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getDescription() {
        return description;
    }

    public float getPurchase_price() {
        return purchase_price;
    }

    public float getSelling_price() {
        return selling_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProduct_image() {
        return product_image;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPurchase_price(float purchase_price) {
        this.purchase_price = purchase_price;
    }

    public void setSelling_price(float selling_price) {
        this.selling_price = selling_price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public void setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
    }

    @Override
    public String toString() {
        return "Product{" +
                "_id='" + _id + '\'' +
                ", prodId=" + prodId +
                ", product_name='" + product_name + '\'' +
                ", description='" + description + '\'' +
                ", purchase_price=" + purchase_price +
                ", selling_price=" + selling_price +
                ", quantity=" + quantity +
                ", product_image='" + product_image + '\'' +
                ", backdrops=" + backdrops +
                '}';
    }
}

