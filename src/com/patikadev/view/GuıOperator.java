package com.patikadev.view;

import javax.swing.*;

import com.patikadev.HELPER.Helper;
import com.patikadev.HELPER.config;
import com.patikadev.model.Operator;

public class Gu�Operator extends JFrame {
    private JPanel wrapper;
    private JTabbedPane TAB_OPERATOR;
    private JLabel welcome_label;
    private JPanel Top_panel;
    private JButton ��k��YapButton;
    private JPanel panel_userlist;
    private JScrollPane scroll_userlist;
    private JTable table;

    private final Operator operator;

    public Gu�Operator(Operator operator){  // operat�r s�n�f�ndan  bir nesne olmadan bu constructor �al��maz.
        this.operator=operator;

        add(wrapper);
        setSize(700,700);
        int x= Helper.screenCenterlocation("x",getSize());// helper s�n�f�ndan kendini tekrar etmemek i�in �a��rd�k.
        int y=Helper.screenCenterlocation("y",getSize());
        setLocation(x,y);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(config.PROJECT_F�NAL);
        setVisible(true);
        welcome_label.setText("Ho�geliniz " + operator.getName());
    }

    public static void main(String[] args) {

        Helper.setlayout();// helper yard�mc� s�n�f�ndan impemente ettik.

        Operator operator1=new Operator();

        operator1.setID(1);
        operator1.setName("Volkan");
        operator1.setPass("1234");
        operator1.setType("eve");
        operator1.setUname("volkan");

        Gu�Operator g=new Gu�Operator(operator1);
    }
}
