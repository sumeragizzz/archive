package javaee.tasklist.model;

public interface Task {

    String getId();

    String getTitle();

    String getMemo();

    TaskStatus getStatus();

}
