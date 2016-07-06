package javaee.tasklist.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SampleBean {

    private String text;

    public SampleBean() {
    }

    public String action1() {
        setText("action1");
        return null;
    }

    public String action2() {
        setText("action2");
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
