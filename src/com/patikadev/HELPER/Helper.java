package com.patikadev.HELPER;

import javax.swing.*;
import java.awt.*;

public class Helper {

    public static int screenCenterlocation(String eksenyönü, Dimension size){
        int point;
        switch (eksenyönü){
            case "x":
                point =(Toolkit.getDefaultToolkit().getScreenSize().width-size.width)/2;
                break;
            case "y":
                point=(Toolkit.getDefaultToolkit().getScreenSize().height- size.height)/2;
                break;
            default:
                point=0;
        }
        return point;
    }

    public static void setlayout() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            }
        }
    }
}
