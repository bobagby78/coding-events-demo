package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank (message = "Name is required!")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters!")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again")
    private String contactEmail;

    //TODO add eventLocation field and add it to the constructor- validation- @NotBlank

    @NotBlank
    @NotNull
    private String location;

    //TODO add a checkbox for whether an even requires registration. Should be set as TRUE
     private boolean regRequired;

    //TODO add a field for number of attendees. Must be over zero
    @Size(min = 1)
    private Integer numAttendees;

    //TODO add a field of my own choice. Make some sort of validation that hasn't been used but would be approp.


    public Event(String name, String description, String contactEmail, String location, Boolean regRequired, Integer numAttendees) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location= location;
        this.numAttendees= numAttendees;
        this.regRequired= regRequired;
        this.id = nextId;
        nextId++;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegRequired() {
        return regRequired;
    }

    public void setRegRequired(boolean regRequired) {
        this.regRequired = regRequired;
    }

    public Integer getNumAttendees() {
        return numAttendees;
    }

    public void setNumAttendees(Integer numAttendees) {
        this.numAttendees = numAttendees;
    }

    public Event(){}

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
