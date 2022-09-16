package com.patikadev.view;

import javax.swing.*;

import com.patikadev.HELPER.Helper;
import com.patikadev.HELPER.config;
import com.patikadev.model.Operator;

public class GuýOperator extends JFrame {
    private JPanel wrapper;
    private JTabbedPane TAB_OPERATOR;
    private JLabel welcome_label;
    private JPanel Top_panel;
    private JButton çýkýþYapButton;
    private JPanel panel_userlist;
    private JScrollPane scroll_userlist;
    private JTable table;

    private final Operator operator;

    public GuýOperator(Operator operator){  // operatör sýnýfýndan  bir nesne olmadan bu constructor çalýþmaz.
        this.operator=operator;

        add(wrapper);
        setSize(700,700);
        int x= Helper.screenCenterlocation("x",getSize());// helper sýnýfýndan kendini tekrar etmemek için çaðýrdýk.
        int y=Helper.screenCenterlocation("y",getSize());
        setLocation(x,y);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(config.PROJECT_FÝNAL);
        setVisible(true);
        welcome_label.setText("Hoþgeliniz " + operator.getName());
    }

    public static void main(String[] args) {

        Helper.setlayout();// helper yardýmcý sýnýfýndan impemente ettik.

        Operator operator1=new Operator();

        operator1.setID(1);
        operator1.setName("Volkan");
        operator1.setPass("1234");
        operator1.setType("eve");
        operator1.setUname("volkan");

        GuýOperator g=new GuýOperator(operator1);
    }
}
