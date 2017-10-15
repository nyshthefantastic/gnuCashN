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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author U Computers
 */
public class FindVendorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane cusGUI;

    @FXML
    private TextField vendorTxt;
    boolean valid = true;

    @FXML
    private void submit(ActionEvent event) throws IOException {
           valid = true;

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                validations val=new validations();
        
         if (val.testEmpty(vendorTxt.getText())) {
            valid = false;
            alert.setTitle("FAILURE");
            alert.setHeaderText(null);
            alert.setContentText("ONE OR MORE FIELDS NOT FILLED !");

            alert.showAndWait();

        }
            if (valid) {
            alert.setTitle("SUCCESS");
            alert.setHeaderText(null);
            alert.setContentText("INPUT SUCCESSFUL !");

            alert.showAndWait();
            vendorTxt.setText("");
          
    
          
        }
    }

    @FXML
    private void backClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/vendorHome.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
