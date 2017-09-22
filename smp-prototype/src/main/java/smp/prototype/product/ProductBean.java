package smp.prototype.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ProductBean implements Serializable {

    private ProductSerchCondition condition;

    private List<Product> products;

    @PostConstruct
    public void init() {
        condition = new ProductSerchCondition();
        products = new ArrayList<>();
    }

    public String add() {
        if (condition.getName() != null) {
            products.add(new Product(condition.getName()));
        }
        return null;
    }

    public String edit(int index) {
        products.get(index).setName(condition.getName());
        return null;
    }

    public String remove(int index) {
        products.remove(index);
        return null;
    }

    public ProductSerchCondition getCondition() {
        return condition;
    }

    public void setCondition(ProductSerchCondition condition) {
        this.condition = condition;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
