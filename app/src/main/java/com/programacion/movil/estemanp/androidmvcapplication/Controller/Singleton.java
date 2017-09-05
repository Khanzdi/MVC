package com.programacion.movil.estemanp.androidmvcapplication.Controller;

import com.programacion.movil.estemanp.androidmvcapplication.Domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Personal on 9/4/2017.
 */

public class Singleton {

    private static Singleton singleton = null;

    public static Singleton getSingleton() {

        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    private List<User> users;

    public  Singleton(){
        users= new ArrayList<>();
        fillDateBases();
    }

    private void fillDateBases(){
        //Add users
        fillUsers();
    }

    private void fillUsers(){
        User person1=new User("Andres","Perez","estemanp","1234",24);
        users.add(person1);

        User person2=new User("Jessica","Ramirez","jessica","1234",16);
        users.add(person2);

        User person3=new User("Kevin","Ortiz","kevin","4321",23);
        users.add(person3);
    }

    public boolean isValidUser(String username, String password){
        Boolean resp=false;
        for (User person:users) {
            if(username.equals(person.getUserName())){
                if(password.equals(person.getPassword())){
                    resp=true;
                }
            }
        }
        return resp;
    }
}

