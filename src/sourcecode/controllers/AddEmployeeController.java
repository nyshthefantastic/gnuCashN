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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author U Computers
 */
public class AddEmployeeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane cusGUI;
    
    @FXML
    private TextField phone;
      
    @FXML
    private TextField fax;
          
          
    @FXML
    private TextField email;
    
    @FXML
    private void submit(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SUCCESS");
        alert.setHeaderText(null);
        alert.setContentText("INPUT SUCCESSFULL!");

        alert.showAndWait();
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        phone.addEventFilter(KeyEvent.KEY_TYPED , ValidatePhone(10));
        fax.addEventFilter(KeyEvent.KEY_TYPED , ValidatePhone(10));
    }    
    
        @FXML
    void backClick(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/employeeHome.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    @FXML
    void submit(TouchEvent event) {

    }
    
         @FXML
    void ValidatePhone(KeyEvent event) {

    }
    
    private EventHandler<KeyEvent> ValidatePhone(final Integer max_Lengh) {
        return new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                TextField txt_TextField = (TextField) e.getSource();                
                if (txt_TextField.getText().length() >= max_Lengh) {                    
                    e.consume();
                }
                if(e.getCharacter().matches("[0-9.]")){ 
                    if(txt_TextField.getText().contains(".") && e.getCharacter().matches("[.]")){
                        e.consume();
                    }else if(txt_TextField.getText().length() == 0 && e.getCharacter().matches("[.]")){
                        e.consume(); 
                    }
                }else{
                    e.consume();
                }
            }
        };
    }    
    
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
    
    @FXML
    void emailtype(KeyEvent event) {
        if (isValidEmailAddress(email.getText())){
            
        }
    }
    
    boolean NotEmpty(String source){
        if (source.isEmpty())
            return false;
        else
            return true;
    }
    
    
    
}
