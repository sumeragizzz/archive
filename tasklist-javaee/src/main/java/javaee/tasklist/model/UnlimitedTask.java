package javaee.tasklist.model;

public class UnlimitedTask implements Task {

    private int id;

    private String title;

    private String memo;

    private TaskStatus status;

    public UnlimitedTask() {
    }

    public UnlimitedTask(String title, String memo) {
        this.title = title;
        this.memo = memo;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

}
