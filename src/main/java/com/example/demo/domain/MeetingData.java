package com.example.demo.domain;
import java.util.UUID;

public class MeetingData {

    //public int id;
    public String name, responsiblePerson, description, category, type;
    public float startDate, endDate;
    public UUID id;
    public MeetingData(UUID id, String name, String responsiblePerson, String description, String category, String type, float startDate, float endDate) {
        this.id = id;
        this.name = name;
        this.responsiblePerson = responsiblePerson;
        this.description = description;
        this.category = category;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getStartDate() {
        return startDate;
    }

    public void setStartDate(float startDate) {
        this.startDate = startDate;
    }

    public float getEndDate() {
        return endDate;
    }

    public void setEndDate(float endDate) {
        this.endDate = endDate;
    }
}
