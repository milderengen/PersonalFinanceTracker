package com.example.personalfinancetracker.controllers;

import com.example.personalfinancetracker.DAO.usersDAO;
import com.example.personalfinancetracker.models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    private usersDAO usersDAO;
    public LoginController(usersDAO userDAO) {
        this.usersDAO = userDAO;
    }
    @FXML
    private Label feedbackLabel;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorMessage;

    @FXML
    public void handleLogin(ActionEvent event){
        String username = usernameField.getText();
        String password = passwordField.getText();

        if(checkCredentials(username, password)){
            feedbackLabel.setText("");
        }else{
            feedbackLabel.setText("Wrong password or Username, try again");
        }
    }
    public boolean checkCredentials(String username, String password){
        User user = usersDAO.findByUsername(username);
        return user.getPassword().equals(password);
    }


}
