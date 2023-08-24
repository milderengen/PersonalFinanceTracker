package com.example.personalfinancetracker.controllers;

import com.example.personalfinancetracker.DAO.usersDAO;
import com.example.personalfinancetracker.models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationController {
    private usersDAO usersDAO;
    public RegistrationController(usersDAO userDAO) {
        this.usersDAO = userDAO;
    }

    @FXML
    private TextField usernameField;
    @FXML
    private TextField age;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField passwordField2;
    @FXML
    private Label feedbackLabel;

    @FXML
    public void handleRegistration(ActionEvent event){
        String username = usernameField.getText();
        String password = passwordField.getText();
        String password2 = passwordField2.getText();
        int Age =  Integer.parseInt(age.getText());
        if(usersDAO.existsInDB(username)){
            feedbackLabel.setText("Username already exists, please use a different one");
        }else{
            if(password.equals(password2)){
                feedbackLabel.setText("");
                User user = new User();
                user.setAge(Age);
                user.setBalance(0);
                user.setIncome(0);
                user.setUsername(username);
                user.setPassword(password);
                usersDAO.saveToDb(user);
            }
            feedbackLabel.setText("Passwords dont match, try again");
        }
    }
}
