package com.gauravghati.dataModels;

import java.time.LocalDate;

public class ToDoItems {

    private String shortDescription;
    private String details;
    private LocalDate deadline;

    public ToDoItems(String shortDescription, String details, LocalDate deaaline) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.deadline = deaaline;
    }


    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeaaline() {
        return deadline;
    }

    public void setDeaaline(LocalDate deaaline) {
        this.deadline = deaaline;
    }

    @Override
    public String toString() {
        return shortDescription;
    }
}