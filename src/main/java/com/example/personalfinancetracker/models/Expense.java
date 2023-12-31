package com.example.personalfinancetracker.models;

import com.example.personalfinancetracker.ENUM.TYPE;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long ID;
    Date startingDate;
    Date endingDate;
    TYPE Type;
    long Cost;
    String Name;
    long UserID;
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }



    public TYPE getType() {
        return Type;
    }

    public void setType(TYPE type) {
        Type = type;
    }

    public long getCost() {
        return Cost;
    }

    public void setCost(long cost) {
        Cost = cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getUserID() {
        return UserID;
    }

    public void setUserID(long userID) {
        UserID = userID;
    }
}
