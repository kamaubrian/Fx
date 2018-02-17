package com.dita.fxintegration;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;


public class FXMLController implements Initializable {
     AlertBox alertBox = new AlertBox();
    
    @FXML
    private Label label;
    
    @FXML 
    private JFXTextField txtUsername;
    @FXML
    private JFXPasswordField txtPassword;
    
    @FXML
    private JFXButton login;
    
    @FXML
    private JFXButton exit;
            
       
    
    @FXML
    private void Login(ActionEvent event){
        try{
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            if(username.isEmpty()){
               showAlertBox("Enter Username");
               return;
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    private void Exit(ActionEvent event){
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    public void showAlertBox(String message){
                Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText("Missing Field");
		alert.setContentText(message);
		alert.showAndWait();
       
    }
}
