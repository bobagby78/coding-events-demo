package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
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


    @NotBlank(message= "Please enter a location") //notBlank extends notNull. notBlank is the choice for String
//    @NotNull(message= "Please enter a location")
    private String location;

    @AssertTrue (message= "Registration is required at this time.")
    private boolean regRequired;

    @Min(1)
    private Integer numAttendees;

    private EventType type;

    //TODO add a field of my own choice. Make some sort of validation that hasn't been used but would be approp.


    public Event(String name, String description, String contactEmail, String location, Boolean regRequired, Integer numAttendees, EventType type) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location= location;
        this.numAttendees= numAttendees;
        this.regRequired= regRequired;
        this.type= type;

    }
    public Event(){
        this.id = nextId;
        nextId++;
    }


    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
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
