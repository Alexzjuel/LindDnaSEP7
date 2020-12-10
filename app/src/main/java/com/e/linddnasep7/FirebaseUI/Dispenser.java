package com.e.linddnasep7.FirebaseUI;

public class Dispenser {

    private String title;
    private String description;
    private int gel;
    private int battery;
    private int priority;


    public Dispenser() {
        //empty constructor needed
    }

    public Dispenser (String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
