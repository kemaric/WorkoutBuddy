package com.ksl.owner.amifit;

import android.location.Location;

import com.google.android.gms.fitness.FitnessActivities;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Owner on 4/25/2014.
 */
public class Buddy {
    private String first_name,last_name,aboutMe,username,email;
    private ArrayList<String> activities;
    private Location myHome;
    private HashSet<Buddy> friends; //not sure if this is needed here. Might just have in database

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

    private Location getLoc(){return myHome;}

    private void setLocation(Location loc){myHome = loc;}

    public ArrayList<String> getActivities() {
        return activities;
    }

    public HashSet<Buddy> getFriends() {
        return friends;
    }

    public Buddy(String fname, String lname, String uname ,String myEmail){
        this.first_name = fname;
        this.last_name = lname;
        aboutMe = "";
        username = uname;
        email = myEmail;
    }
    public Buddy(String fname, String lname, String uname ,String myEmail, Location loc){
        this.first_name = fname;
        this.last_name = lname;
        aboutMe = "";
        username = uname;
        email = myEmail;
        myHome = loc;

    }
    public boolean addBuddyToFriends(Buddy user){
        if(user !=  null && !friends.contains(user)){
            friends.add(user);
            return true;
        }
        return false;
    }

  //  Niche mynitch = new Niche("Kkff", new Buddy(null,null,null,null),FitnessActivities.AEROBICS);
}
