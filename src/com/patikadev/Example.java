package com.patikadev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JButton loginbutton; //exampleform s�n�f�nda buton �zerinde sa�t�klay�p, create listener de isel alttaki login metodunu override ediyor.
    private JLabel userName;
    private JLabel UserEntry;
    private JTextField textField1;
    private JLabel userPassword;
    private JTextField textField2;

    public Example() {
        /*for(UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels()){
            System.out.println(info.getName() + "=>" + info.getClassName());
        }*/
        try {
            for (UIManager.LookAndFeelInfo infoo : UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            }
        } catch (Exception e) {
            e.getMessage();
        }

        this.add(wrapper);//add metodu jframe 'den gelen bir component ekleme metodudur.
        //this.setContentPane(wrapper); add metodu ile ayn� i�levi g�r�yor.
        setSize(400, 300);  //a��l�r pencerenin boyutu
        setTitle("Uygulama Ad�:");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;    // pencere a��l�rken ki yerini belirliyor.
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;  // pencere a��l�rken ki yerini belirliyor.
        setLocation(x, y);

        setVisible(true); //pencerenin a��lmas�n� istiyorsak true yapmal�y�z.

        loginbutton.addActionListener(e -> {
            if (textField1.getText().length() == 0 || textField2.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "T�m Alanlar� Doldurunuz.", "hata", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
