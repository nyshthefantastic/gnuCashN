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
public class VendorHomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
        @FXML
private AnchorPane vendorGUI;
     @FXML
    private void backClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/dashboard.fxml"));
        vendorGUI.getChildren().setAll(pane);
    }
             @FXML
    private void addVendorClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/addVendor.fxml"));
        vendorGUI.getChildren().setAll(pane);
    }
        @FXML
    private void findVendorClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/findVendor.fxml"));
        vendorGUI.getChildren().setAll(pane);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
