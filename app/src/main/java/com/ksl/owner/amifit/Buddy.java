package com.ksl.owner.amifit;

import java.util.ArrayList;

/**
 * Created by Owner on 4/25/2014.
 */
public class Buddy {
    private String first_name,last_name,aboutMe,username,email;
    private ArrayList<String> activities;
    private ArrayList<Buddy> friends; //not sure if this is needed here. Might just have in database

    /*Getters for the private fields of the Buddy*/
    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public String getUsername(){return username;}

    public ArrayList<String> getActivities() {
        return activities;
    }

    public ArrayList<Buddy> getFriends() {
        return friends;
    }

    public Buddy(String myEmail){
        email = myEmail;
    }
    public boolean addBuddyToFriends(Buddy user){
        if(user !=  null && !friends.contains(user)){
            friends.add(user);
            return true;
        }
        return false;
    }
}
