package com.example.CompanyProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;

    // In months
    int duration;
    String profile;

    // Can be 0
    int stipend;
    boolean workFromHome;

    public Company () {

    }

    public Company (int id, String name, int duration, String profile, int stipend, boolean workFromHome) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.profile = profile;
        this.stipend = stipend;
        this.workFromHome = workFromHome;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getDuration () {
        return duration;
    }

    public void setDuration (int duration) {
        this.duration = duration;
    }

    public String getProfile () {
        return profile;
    }

    public void setProfile (String profile) {
        this.profile = profile;
    }

    public int getStipend () {
        return stipend;
    }

    public void setStipend (int stipend) {
        this.stipend = stipend;
    }

    public boolean isWorkFromHome () {
        return workFromHome;
    }

    public void setWorkFromHome (boolean workFromHome) {
        this.workFromHome = workFromHome;
    }

    @Override
    public String toString () {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", profile='" + profile + '\'' +
                ", stipend=" + stipend +
                ", workFromHome=" + workFromHome +
                '}';
    }
}
