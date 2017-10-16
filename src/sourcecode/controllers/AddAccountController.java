/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jccac
 */
public class AddAccountController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private ComboBox currency;
    @FXML
    private ComboBox fraction;
    @FXML
    private ComboBox color;
     @FXML
    private AnchorPane addAccGUI;
    

    
      @FXML
    private void backClick(ActionEvent event) throws IOException 
    {
     
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/sourcecode/accountsHome.fxml"));
        addAccGUI.getChildren().setAll(pane);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
            ObservableList<String> curr = FXCollections.observableArrayList("ADF (Andorran Franc)",
                                                                    "ADP (Andorran Peseta)", 
                                                                    "AED (UAE Dirham)", 
                                                                    "AFA (Afghani)",
                                                                    "AFN (Afghani)",
                                                                    "ALL (Lek)");
    
    ObservableList<String> frac = FXCollections.observableArrayList("Use Commodity Value",
                                                                    "1", 
                                                                    "1/10", 
                                                                    "1/100",
                                                                    "1/1000",
                                                                    "1/10000",
                                                                    "1/100000",
                                                                    "1/1000000");
    
    ObservableList<String> colo = FXCollections.observableArrayList("RED",
                                                                    "GREEN", 
                                                                    "BLUE");
        currency.setValue("SELECT");
        currency.setItems(curr);
        
        fraction.setValue("SELECT");
        fraction.setItems(frac);
        
        color.setValue("SELECT");
        color.setItems(colo);
        
    }    
    
    
   
    @FXML
    void submit(TouchEvent event) {

    }
    
}
