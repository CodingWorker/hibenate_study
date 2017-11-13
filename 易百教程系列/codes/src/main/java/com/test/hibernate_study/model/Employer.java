package com.test.hibernate_study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/11/13
 * Project: CodesDemo
 */
@Entity
@Table(name = "employer")
public class Employer {
    @Id
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
