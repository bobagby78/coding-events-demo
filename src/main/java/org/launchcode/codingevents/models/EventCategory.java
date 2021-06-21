package org.launchcode.codingevents.models;


import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventCategory {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    EventCategory(int id, String name){
        this.id = id;
        this.name = name;

    }

    EventCategory(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
