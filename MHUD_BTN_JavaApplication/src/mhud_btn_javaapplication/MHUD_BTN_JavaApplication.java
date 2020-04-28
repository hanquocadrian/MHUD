package mhud_btn_javaapplication;

import java.util.Scanner;
import javax.swing.JFrame;

public class MHUD_BTN_JavaApplication {
    
    public MHUD_BTN_JavaApplication() {
        JFrame frame = new JFrame("Hello Swing");
        frame.setSize(900, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
//        new MHUD_BTN_JavaApplication();
        String a;
        Scanner datain = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        a= datain.nextLine();
        System.out.println(a);
        char c;
        for(int i=0;i< a.length();i++){
            c= a.charAt(i);
            System.out.println(c);
        }
    }
    
}
