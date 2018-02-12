package com.kodilla.hibernate.tasklist;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLIST")
@Access(AccessType.PROPERTY)

public class TaskList {

    private int ID;
    private String listName;
    private String description;

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Column(name="NAME")
    @NotNull
    public String getListName() {
        return listName;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    @Column(name="DESCRIPTION")
    @NotNull
    private String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
