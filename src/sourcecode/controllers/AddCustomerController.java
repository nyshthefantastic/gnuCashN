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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Anushka_Hapukotuwa
 */
public class AddCustomerController implements Initializable {

    @FXML
    private AnchorPane cusGUI;
    @FXML
    private TextField cusName;
    @FXML
    private TextField comName;
    @FXML
    private TextField addTxt;
    @FXML
    private TextField notesTxt;
    @FXML
    private TextField phoneTxt;
    @FXML
    private TextField emailTxt;
    @FXML
    private TextField faxTxt;
    boolean valid = true;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void backClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/customerHome.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    @FXML
    private void submit(ActionEvent event) throws IOException {
        Alert alert = new Alert(AlertType.INFORMATION);
        validations val = new validations();

        String cus = cusName.getText();
        String com = comName.getText();
        String addT = addTxt.getText();
        String notesT = notesTxt.getText();
        String phoneT = phoneTxt.getText();
        String emailT = emailTxt.getText();
        String faxT = faxTxt.getText();
        valid = true;

        if (val.testEmpty(cus) || val.testEmpty(com) || val.testEmpty(addT) || val.testEmpty(notesT) || val.testEmpty(phoneT) || val.testEmpty(emailT) || val.testEmpty(faxT)) {
            valid = false;
            alert.setTitle("FAILURE");
            alert.setHeaderText(null);
            alert.setContentText("ONE OR MORE FIELDS NOT FILLED !");

            alert.showAndWait();

        }
        if ((!val.chkIfTxt(cus) || !val.chkIfTxt(com)) && valid == true) {
            valid = false;

            alert.setTitle("FAILURE");
            alert.setHeaderText(null);
            alert.setContentText(" Customer and Company can only have letters [a-z]");

            alert.showAndWait();

        }
        if ((!val.chkNumber(phoneT) || !val.chkNumber(faxT)) && valid == true) {
            valid = false;

            alert.setTitle("FAILURE");
            alert.setHeaderText(null);
            alert.setContentText(" Phone Number and fax must only have 10 digits");

            alert.showAndWait();

        }
        if (valid) {
            alert.setTitle("SUCCESS");
            alert.setHeaderText(null);
            alert.setContentText("INPUT SUCCESSFUL !");

            alert.showAndWait();
            cusName.setText("");
            comName.setText("");
            addTxt.setText("");
            notesTxt.setText("");
            phoneTxt.setText("");
            emailTxt.setText("");
            faxTxt.setText("");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
