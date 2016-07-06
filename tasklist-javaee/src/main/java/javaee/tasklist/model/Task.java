package javaee.tasklist.model;

public interface Task {

    int getId();

    String getTitle();

    String getMemo();

    TaskStatus getStatus();

}
