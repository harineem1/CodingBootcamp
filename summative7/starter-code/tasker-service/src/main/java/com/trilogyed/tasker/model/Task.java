package com.trilogyed.tasker.model;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Objects;

public class Task {

    private int id;
    private String description;
    private LocalDate createDate;
    private LocalDate dueDate;
    private String category;

    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return getId() == task.getId() &&
                Objects.equals(getDescription(), task.getDescription()) &&
                Objects.equals(getCreateDate(), task.getCreateDate()) &&
                Objects.equals(getDueDate(), task.getDueDate()) &&
                Objects.equals(getCategory(), task.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getCreateDate(), getDueDate(), getCategory());
    }
}
