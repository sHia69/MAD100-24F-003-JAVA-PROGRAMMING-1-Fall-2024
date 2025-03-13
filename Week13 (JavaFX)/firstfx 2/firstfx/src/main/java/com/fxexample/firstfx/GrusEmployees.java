package com.fxexample.firstfx;

import java.util.ArrayList;

public class GrusEmployees {
    private static final ArrayList<Employee> employees = new ArrayList<>();
    static {
        Employee gru = new Employee();
        gru.setName("Felonious Gru Sr.");
        gru.setImageFile("gru.jpg");
        employees.add(gru);
        Employee drnefario = new Employee();
        drnefario.setName("Dr. Nefario");
        drnefario.setImageFile("drnef.jpg");
        employees.add(drnefario);
        Minion kevin = new Minion();
        kevin.setName("Kevin");
        kevin.setImageFile("kevin.jpg");
        kevin.setCyclops(false);
        employees.add(kevin);
        Minion bob = new Minion();
        bob.setName("Bob");
        bob.setImageFile("bob.jpg");
        bob.setCyclops(false);
        employees.add(bob);
        Minion stuart = new Minion();
        stuart.setName("Stuart");
        stuart.setImageFile("stuart.jpg");
        stuart.setCyclops(true);
        employees.add(stuart);
    }
    public static ArrayList<Employee> getGrusEmployees(){
        return employees;
    }
}
