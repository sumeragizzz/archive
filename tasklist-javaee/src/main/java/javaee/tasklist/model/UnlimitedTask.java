package javaee.tasklist.model;

import java.io.Serializable;

public class UnlimitedTask implements Task, Serializable {

    private long id;

    private String title;

    private String memo;

    private int status;

    public UnlimitedTask() {
    }

    public UnlimitedTask(String title, String memo) {
        this.title = title;
        this.memo = memo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
