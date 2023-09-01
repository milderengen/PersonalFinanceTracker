package com.example.personalfinancetracker.Objectables;

import com.example.personalfinancetracker.ENUM.TYPE;

public class Expense {
    TYPE Type;
    long Cost;
    String Name;
    long UserID;

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
