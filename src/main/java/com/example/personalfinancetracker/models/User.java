package com.example.personalfinancetracker.models;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private int age;
    private long income;
    private String password;
    private long balance;
}
