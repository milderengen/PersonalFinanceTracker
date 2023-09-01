package com.example.personalfinancetracker.Objectables;

public class User {
    private int ID;
    private String Name;
    private int Balance;
    private int Income;
    private int Outcome;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getIncome() {
        return Income;
    }

    public void setIncome(int income) {
        Income = income;
    }

    public int getOutcome() {
        return Outcome;
    }

    public void setOutcome(int outcome) {
        Outcome = outcome;
    }
}
