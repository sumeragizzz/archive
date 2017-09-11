package attendance.report;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Sample1Bean implements Serializable {

    private String textValue;

    public Sample1Bean() {
        System.out.println("Constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct");
    }

    public String returnNull() {
        textValue += "N";
        return null;
    }

    public String returnUrl() {
        textValue += "U";
        return "sample1.xhtml";
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

}
