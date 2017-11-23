package io.just.oyu.model;

public class ToDoItem implements Comparable<ToDoItem> {
    private Long id;
    private String name;
    private boolean completed;

    @Override
    public int compareTo(ToDoItem toDoItem) {
        return 0;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
