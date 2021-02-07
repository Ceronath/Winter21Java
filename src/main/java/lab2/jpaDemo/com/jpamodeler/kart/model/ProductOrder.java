package lab2.jpaDemo.com.jpamodeler.kart.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * @author jorda
 */
@Entity
public class ProductOrder {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String amount;
    @ManyToMany
    @JoinTable(name = "PRODUCTORDER_PRODUCT", joinColumns = @JoinColumn(name = "ORDERID"), inverseJoinColumns = @JoinColumn(name = "PRODUCTID"))
    private List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<>();
        }
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        getProducts().add(product);
    }

    public void removeProduct(Product product) {
        getProducts().remove(product);
    }

}