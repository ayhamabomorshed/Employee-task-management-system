
package taskmanagementsystem;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ValidationUtil {
     public static boolean isEmpty(JTextField txt){
         String value=txt.getText();
        if(value.trim().equals("")){
            txt.requestFocus();
            txt.setBorder(BorderFactory.createLineBorder(Color.red));
            return true;
        }else{
            txt.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            return false;
        }
    }
     public static  boolean isValidLength(JTextField txt, int number){
        String value=txt.getText().trim();
        if(value.length()==number ){   
            txt.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid length, should be  "+number);
            txt.requestFocus();
            txt.setBorder(BorderFactory.createLineBorder(Color.red));
            return false;
        }        
    }

}
