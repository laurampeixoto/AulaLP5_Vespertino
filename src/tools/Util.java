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

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
        }
    }

    public static void limpar(JComponent ... components) {
        for (int i = 0; i < components.length; i++) {
            ((JTextField)components[i]).setText("");
            
        }
    }
}
