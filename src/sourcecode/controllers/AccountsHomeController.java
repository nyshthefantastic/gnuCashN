/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author U Computers
 */
public class AccountsHomeController implements Initializable {
    @FXML
    private AnchorPane accGUI;

    @FXML
    private Button loanCal;

    @FXML
    private Button addAcc;

    @FXML
    private Label sidebar;

    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void backClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/dashboard.fxml"));
        accGUI.getChildren().setAll(pane);
    }
         @FXML
    private void loanRepayClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/loanRepaymentCalculator.fxml"));
        accGUI.getChildren().setAll(pane);
    }
    
    @FXML
    void addAccClick(ActionEvent event) throws IOException  {
        //AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/addAccount.fxml"));
        //accGUI.getChildren().setAll(pane);
          AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/addAccount.fxml"));
        accGUI.getChildren().setAll(pane);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
