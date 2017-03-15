package smp.prototype.product;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ProductBean implements Serializable {

    Product product;

    @PostConstruct
    public void init() {
        product = new Product();
    }

    public String execute() {
        product.setName(product.getName() + "z");
        return null;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
