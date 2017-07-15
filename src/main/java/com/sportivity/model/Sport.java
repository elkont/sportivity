package com.sportivity.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by elena on 15/7/2017.
 */

@Entity
@Table(name = "sport")

public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sport_id")
    private int id;
    @Column(name = "title")
    private String title;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
