package smp.prototype.product;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
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

    public String getValue() {
        return name;
    }

    public void setValue(String value) {
        this.name = value;
    }

}
