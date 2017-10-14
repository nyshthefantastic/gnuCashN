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
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author U Computers
 */
public class LoanRepaymentCalculatorController implements Initializable {
    @FXML
    private ComboBox freqCombo1;
       @FXML
    private ComboBox freqCombo2;
           @FXML
    private AnchorPane accGUI;
    /**
     * Initializes the controller class.
     */
        @FXML
    private void backClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/accountsHome.fxml"));
        accGUI.getChildren().setAll(pane);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         freqCombo1.getItems().removeAll(freqCombo1.getItems());
    freqCombo1.getItems().addAll("Monthly", "Monthly");
    freqCombo1.getSelectionModel().select("Monthly");
      freqCombo2.getItems().removeAll(freqCombo2.getItems());
    freqCombo2.getItems().addAll("Monthly", "Monthly");
    freqCombo2.getSelectionModel().select("Monthly");
       
    }
   
    
    
}
