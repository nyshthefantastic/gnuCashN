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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author U Computers
 */
public class DashboardController implements Initializable {
@FXML
private AnchorPane dashGUI;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void customerClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/customerHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
    @FXML
    private void vendorClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/vendorHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
    @FXML
    private void employeeClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/employeeHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
    @FXML
        private void budgetClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/budgetHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
    @FXML
    private void accountsClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/accountsHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
    @FXML
    private void reportsClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/reportsHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
    @FXML
        private void commandsClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/commandsHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
    @FXML
    private void windowsClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/windowsHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
    @FXML
    private void helpClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/helpHome.fxml"));
        dashGUI.getChildren().setAll(pane);
    }
}