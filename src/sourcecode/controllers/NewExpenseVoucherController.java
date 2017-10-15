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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Anushka_Hapukotuwa
 */
public class NewExpenseVoucherController implements Initializable {

    @FXML
    private AnchorPane empGUI;
    
    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void backClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/employeeHome.fxml"));
        empGUI.getChildren().setAll(pane);
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
        
    }    
    
}
