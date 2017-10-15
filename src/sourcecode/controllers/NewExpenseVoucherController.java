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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Anushka_Hapukotuwa
 */
public class NewExpenseVoucherController implements Initializable {

    @FXML
    private AnchorPane empGUI;
     @FXML
    private ComboBox newInvType;
    @FXML
    private ComboBox newInvTerms;

    @FXML
    private TextField bid;
    @FXML
    private TextField cid;
    @FXML
    private TextField vid;
       @FXML
    private TextField eid;
    @FXML
    private TextField notesTxt;
       boolean valid = true;
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
                valid = true;

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                validations val=new validations();
        
         if (val.testEmpty(bid.getText()) || val.testEmpty(cid.getText()) || val.testEmpty(vid.getText()) || val.testEmpty(eid.getText()) || val.testEmpty(notesTxt.getText()) ) {
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
            bid.setText("");
            cid.setText("");
            vid.setText("");
            notesTxt.setText("");
            eid.setText("");
          
        }
     
       
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
