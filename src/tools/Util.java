/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JTextField;
import javax.swing.JComponent;

/**
 *
 * @author u05755378177
 */
public class Util {

    public void habilitar(JComponent... components) {
        for (int i = 0; i < components.length; i++) {
            components[i].setEnabled(false); 
        }

        
    }

}
