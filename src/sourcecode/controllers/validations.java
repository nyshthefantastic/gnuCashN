/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode.controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anushka_Hapukotuwa
 */
public class validations {
    
    public boolean testEmpty(String input){
        if(input.isEmpty()){
            return true;
        }
        return false;
    }
    
    public boolean chkIfTxt(String input) {
        Pattern p = Pattern.compile("^[\\p{L} .'-]+$");
        Matcher m = p.matcher(input);
        
        
        if ((m.find() && m.group().equals(input) ) ) {
            return true;
        } else {
          
            return false;

        }

    }
     public boolean chkNumber(String num) {
        Pattern p = Pattern.compile("\\d{10}");
        Matcher m = p.matcher(num);
       
        if ((m.find() && m.group().equals(num)) ) {

            return true;
        } else {
           
            return false;
        }

    }
    
}
