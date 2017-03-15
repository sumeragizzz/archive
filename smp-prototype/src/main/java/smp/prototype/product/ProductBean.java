package smp.prototype.product;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ProductBean implements Serializable {

    String name;

    @PostConstruct
    public void init() {
    }

    public String execute() {
        name = name + "z";
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
