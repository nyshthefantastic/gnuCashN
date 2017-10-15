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
public class CustomerHomeController implements Initializable {

    @FXML
    private AnchorPane cusGUI;

    /**
     * Initializes the controller class.
     */

     @FXML
    private void backClick(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/dashboard.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    @FXML
    private void addCusClick(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/addCustomer.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    @FXML
    private void findCusClick(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/findCustomer.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
