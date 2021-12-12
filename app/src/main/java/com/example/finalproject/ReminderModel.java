package com.example.finalproject;

public class ReminderModel {
    private int id;
    private String name;
    private String description;
    private String date;

    public ReminderModel(String name, String description, String date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public ReminderModel(int id, String name, String description, String date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }
}