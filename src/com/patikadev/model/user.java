package com.patikadev.model;

public class user { // veritaban�ndan  gelen bir de�eri burada nesnele�tiriyoruz. Modelliyoruz.

    private int ID;
    private String name;
    private String uname;
    private String pass;

    private String type;//educato m�, student m� kim?

    public user(){}

    public user(int ID, String name, String uname, String pass, String type) {
        this.ID = ID;
        this.name = name;
        this.uname = uname;
        this.pass = pass;
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
