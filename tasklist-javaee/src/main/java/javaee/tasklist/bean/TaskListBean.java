package javaee.tasklist.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import javaee.tasklist.model.Task;
import javaee.tasklist.model.UnlimitedTask;

@Named
@SessionScoped
public class TaskListBean implements Serializable {

    private String registerTitle;

    private String registerMemo;

    private List<Task> taskList;

    public TaskListBean() {
        taskList = new ArrayList<>();
    }

    public String register() {
        registerTask(getRegisterTitle(), getRegisterMemo());
        return null;
    }

    public String delete(int index) {
        taskList.remove(index);
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
