/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhud_btn_javaapplication;

import javax.swing.JFrame;

/**
 *
 * @author Win10
 */
public class MHUD_BTN_JavaApplication {

    /**
     * @param args the command line arguments
     */
    
    public MHUD_BTN_JavaApplication() {
        JFrame frame = new JFrame("Hello Swing");
        frame.setSize(900, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new MHUD_BTN_JavaApplication();
    }
    
}
