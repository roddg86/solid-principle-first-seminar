package homework;

import homework.model.impl.Persister;
import homework.model.impl.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister(user);
        persister.report();
        persister.save();
    }
}