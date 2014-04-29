/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvgui;

import java.awt.HeadlessException;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Instlogin
 */
public class TempConvertEventHandler implements ActionListener {
    private JTextComponent input;
    private Window parent;
    private JRadioButton rBtn;
    
    public TempConvertEventHandler(Window window, JTextComponent input, JRadioButton fahrenheit2CelciusBtn) {
        parent = window;
        this.input = input;
        rBtn = fahrenheit2CelciusBtn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double convertedTemp = 0.0;
        String strTemp = input.getText();
        
        if(rBtn.isSelected()) {
            convertedTemp = getTemperatureInput(strTemp, convertedTemp);
            convertedTemp = (convertedTemp - 32) * 5/9;
            displayConversion(convertedTemp);
        } else {
            convertedTemp = getTemperatureInput(strTemp, convertedTemp);
            convertedTemp = convertedTemp * 9/5 + 32;
            displayConversion(convertedTemp);
        }
    }

    private void displayConversion(double converted) {
        JOptionPane.showMessageDialog(parent, "Conversion: " + converted, 
                "Conversion Result", JOptionPane.INFORMATION_MESSAGE);
    }

    private void displayErrorMsg() {
        JOptionPane.showMessageDialog(parent, "Sorry, you must enter a numerical value. Please try again", 
                "Data Input Error",
                JOptionPane.ERROR_MESSAGE);
    }

    private double getTemperatureInput(String strTemp, double origTemp) throws HeadlessException {
        try {
            origTemp = Double.parseDouble(strTemp);
        } catch(NumberFormatException nfe) {
            displayErrorMsg();
        }
        return origTemp;
    }
    
}
