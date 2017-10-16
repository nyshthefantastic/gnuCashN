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
    private TextField name;
      
    @FXML
    private TextField id;
          
          
    @FXML
    private TextField lan;
     @FXML
    private TextField uname;
          
          
    @FXML
    private TextField add;
        boolean valid = true;

    
    @FXML
    private void submit(ActionEvent event) throws IOException {
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
        validations val = new validations();

    
        valid = true;

        if (val.testEmpty(phone.getText()) ||val.testEmpty(fax.getText())  ||val.testEmpty(email.getText())  || val.testEmpty(name.getText())  || val.testEmpty(id.getText())  || val.testEmpty(lan.getText())  || val.testEmpty(uname.getText())|| val.testEmpty(add.getText()) ) {
            valid = false;
            alert.setTitle("FAILURE");
            alert.setHeaderText(null);
            alert.setContentText("ONE OR MORE FIELDS NOT FILLED !");

            alert.showAndWait();

        }
        if ((!val.chkIfTxt(name.getText()) ) && valid == true) {
            valid = false;

            alert.setTitle("FAILURE");
            alert.setHeaderText(null);
            alert.setContentText(" Customer can only have letters [a-z]");

            alert.showAndWait();

        }
        if ((!val.chkNumber(phone.getText()) || !val.chkNumber(fax.getText())) && valid == true) {
            valid = false;

            alert.setTitle("FAILURE");
            alert.setHeaderText(null);
            alert.setContentText(" Phone Number and fax must only have 10 digits");

            alert.showAndWait();

        }
         if ((!isValidEmailAddress(email.getText()) ) && valid == true) {
            valid = false;

            alert.setTitle("FAILURE");
            alert.setHeaderText(null);
            alert.setContentText(" email should be of the format abc@gmail.com");

            alert.showAndWait();

        }
        if (valid) {
            alert.setTitle("SUCCESS");
            alert.setHeaderText(null);
            alert.setContentText("INPUT SUCCESSFUL !");

            alert.showAndWait();
            phone.setText("");
            fax.setText("");
            name.setText("");
            id.setText("");
            lan.setText("");
            uname.setText("");
            add.setText("");
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        id.setText("EMP00001");
        phone.addEventFilter(KeyEvent.KEY_TYPED , ValidatePhone(10));
        fax.addEventFilter(KeyEvent.KEY_TYPED , ValidatePhone(10));
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
        
    
        @FXML
    void backClick(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sourcecode/employeeHome.fxml"));
        cusGUI.getChildren().setAll(pane);
    }

    
       
    
   
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
    
   
    
  
    
    
    
}
