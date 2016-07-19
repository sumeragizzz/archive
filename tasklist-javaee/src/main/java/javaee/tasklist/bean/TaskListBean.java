package javaee.tasklist.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import javaee.tasklist.model.Task;

@Named
@SessionScoped
public class TaskListBean implements Serializable {

    private String registerTitle;

    private String registerMemo;

    private List<Task> taskList;

    private EntityManager em;

    public TaskListBean() {
    }

    @PostConstruct
    public void initialize() {
        em = Persistence.createEntityManagerFactory("tasklist").createEntityManager();
        selectTask();
    }

    public String register() {
        registerTask(getRegisterTitle(), getRegisterMemo());
        selectTask();
        return null;
    }

    public String delete(int index) {
        deleteTask(taskList.get(index));
        selectTask();
        return null;
    }

    private void selectTask() {
        CriteriaQuery<Task> cq = em.getCriteriaBuilder().createQuery(Task.class);
        Root<Task> r = cq.from(Task.class);
        taskList = em.createQuery(cq.select(r)).getResultList();
    }

    private void registerTask(String title, String memo) {
        Task task = new Task(title, memo);
        em.persist(task);
    }

    private void deleteTask(Task task) {
        em.remove(task);
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
