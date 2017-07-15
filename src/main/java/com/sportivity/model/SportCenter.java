package com.sportivity.model;

import javax.persistence.*;

/**
 * Created by elena on 15/7/2017.
 */
@Entity
@Table(name = "sport")

public class SportCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sportCenter_id")
    private int id;
    @Column(name = "center")
    private String center;
    @Column(name = "location")
    private String location;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "info")
    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
