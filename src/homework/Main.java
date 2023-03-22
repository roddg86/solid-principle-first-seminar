package homework;

import homework.model.impl.Persister;
import homework.model.impl.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        user.report();
        user.save();
        Persister persister = new Persister(user);
        persister.save();
    }
}