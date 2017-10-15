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
 * @author U Computers
 */
public class LoanRepaymentCalculatorController implements Initializable {

    @FXML
    private ComboBox freqCombo1;
    @FXML
    private ComboBox freqCombo2;
    @FXML
    private AnchorPane cusGUI;
       @FXML
    private TextField payPeriodsTxt;
    @FXML
    private TextField interestText;
    @FXML
    private TextField pvaludTxt;
       @FXML
    private TextField ppaymentTxt;
    @FXML
    private TextField fuValueTxt;
       boolean valid = true;

    /**
     * Initializes the controller class.
     */
       @FXML
    private void submit(ActionEvent event) throws IOException {
           valid = true;

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                validations val=new validations();
        
         if (val.testEmpty(payPeriodsTxt.getText()) || val.testEmpty(interestText.getText()) || val.testEmpty(pvaludTxt.getText()) || val.testEmpty(ppaymentTxt.getText()) || val.testEmpty(fuValueTxt.getText()) ) {
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
            payPeriodsTxt.setText("");
            interestText.setText("");
            pvaludTxt.setText("");
            ppaymentTxt.setText("");
            fuValueTxt.setText("");
          
        }
    }
    @FXML
    private void backClick(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/accountsHome.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        freqCombo1.getItems().removeAll(freqCombo1.getItems());
        freqCombo1.getItems().addAll("Monthly", "Annually");
        freqCombo1.getSelectionModel().select("Monthly");
        freqCombo2.getItems().removeAll(freqCombo2.getItems());
        freqCombo2.getItems().addAll("Monthly", "Annually");
        freqCombo2.getSelectionModel().select("Monthly");

    }

}
