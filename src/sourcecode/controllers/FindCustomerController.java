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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Anushka_Hapukotuwa
 */
public class FindCustomerController implements Initializable {

    @FXML
    private ComboBox findCusCombo1;
    @FXML
    private ComboBox findCusCombo2;
    @FXML
    private ComboBox findCusCombo3;
    @FXML
    private AnchorPane findcusGUI;
    

 
    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void backClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/customerHome.fxml"));
        findcusGUI.getChildren().setAll(pane);
    }
      @FXML
    private void submit(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SUCCESS");
        alert.setHeaderText(null);
        alert.setContentText("INPUT SUCCESSFUL !");

        alert.showAndWait();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
      findCusCombo1.getItems().removeAll(findCusCombo1.getItems());
      findCusCombo1.getItems().addAll("Customer ID", "Company Name", "Billing Contact", "Shipping Contact");
      findCusCombo1.getSelectionModel().select("Customer ID");
      
      findCusCombo2.getItems().removeAll(findCusCombo2.getItems());
      findCusCombo2.getItems().addAll("contains", "matches regex", "does not match regex");
      findCusCombo2.getSelectionModel().select("contains");
      
      findCusCombo3.getItems().removeAll(findCusCombo3.getItems());
      findCusCombo3.getItems().addAll("New search", "Refine current search", "Add results to current search", "Delete results from current search");
      findCusCombo3.getSelectionModel().select("New search");
    }    
    
}
