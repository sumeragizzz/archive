package javaee.tasklist.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import javaee.tasklist.model.Task;
import javaee.tasklist.model.UnlimitedTask;

@Named
@RequestScoped
public class TaskListBean {

    private String registerTitle;

    private String registerMemo;

    private List<Task> taskList;

    public TaskListBean() {
        taskList = new ArrayList<>();
        // TODO テストデータ設定
        taskList.add(new UnlimitedTask("AAA", "memoA"));
        taskList.add(new UnlimitedTask("BBB", null));
        taskList.add(new UnlimitedTask("CCC", "memoC"));
    }

    public String register() {
        setRegisterTitle("registered : " + getRegisterTitle());
        setRegisterMemo("registered : " + getRegisterMemo());
//        registerTask(getRegisterTitle(), getRegisterMemo());
        return null;
    }

    private void registerTask(String title, String memo) {
        taskList.add(new UnlimitedTask(title, memo));
    }

    public String getRegisterTitle() {
        return registerTitle;
    }

    public void setRegisterTitle(String registerTitle) {
        this.registerTitle = registerTitle;
    }

    public String getRegisterMemo() {
        return registerMemo;
    }

    public void setRegisterMemo(String registerMemo) {
        this.registerMemo = registerMemo;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

}
