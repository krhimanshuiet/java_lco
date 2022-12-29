package com.example.fxmlfile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML

    private TextField textFieldOne;

    @FXML
    private Button captain;
    @FXML
    private Button Hulk;
    @FXML
    private Button IronMan;
    @FXML
    private Button Thor;
    @FXML
    public void onButtonTapped(ActionEvent e){
        if(e.getSource().equals(captain)){
            System.out.println("Captain was clicked by:" + textFieldOne.getText());
        }else if(e.getSource().equals(Hulk)){
            System.out.println("Hulk was clicked by:" + textFieldOne.getText());
        } else if(e.getSource().equals(IronMan)){
            System.out.println("Iron Man was clicked by:" + textFieldOne.getText());
        }else if(e.getSource().equals(Thor)){
            System.out.println("Thor was clicked by:" + textFieldOne.getText());
        }

        }
//    public void onHulkTapped(){
//        System.out.println("Hulk was clicked:" + textFieldOne.getText());
//    }
//    public void captainAmericaTapped(){
//        System.out.println("Captain America WAS tapped!");
//    }
//    public void ironManTapped(){
//        System.out.println("Iron Man Was Tapped");
//    }
//    public void thorTapped(){
//        System.out.println("Thor Was Tapped!");
//    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}