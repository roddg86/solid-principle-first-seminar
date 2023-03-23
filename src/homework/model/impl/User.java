package homework.model.impl;

import homework.model.Reportable;
import homework.util.Saver;

public class User implements Reportable {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + name);
    }

}
