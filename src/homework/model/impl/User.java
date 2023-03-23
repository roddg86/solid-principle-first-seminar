package homework.model.impl;

import homework.model.Reportable;
import homework.util.Saver;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
