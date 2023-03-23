package homework.model.impl;

import homework.model.Reportable;
import homework.util.Saver;

public class Persister implements Saver, Reportable {
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + user.getName());
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
