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
 * @author U Computers
 */
public class AddInvoiceController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private ComboBox newInvType;
    @FXML
    private ComboBox newInvTerms;
     @FXML
    private AnchorPane cusGUI;
      @FXML
    private void submit(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SUCCESS");
        alert.setHeaderText(null);
        alert.setContentText("INPUT SUCCESSFUL !");

        alert.showAndWait();
    }
     @FXML
    private void backClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/customerHome.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      newInvType.getItems().removeAll(newInvType.getItems());
      newInvType.getItems().addAll("Invoice", "Credit Note");
      newInvType.getSelectionModel().select("Invoice");
      
      newInvTerms.getItems().removeAll(newInvTerms.getItems());
      newInvTerms.getItems().addAll("None");
      newInvTerms.getSelectionModel().select("None");
    }    
    
}
