package com.ksl.owner.amifit;

import com.google.android.gms.fitness.FitnessActivities;

import java.util.HashSet;

/**
 * Created by Owner on 1/14/2015.
 */
public class Niche {
    private String name;
    private Buddy owner;
    private String fitActivity;
    private HashSet<Buddy> members;


    public Niche(String nicheName, Buddy nicheOwner, String nicheActivity){
        this.name = nicheName;
        this.fitActivity = fitActivity;
        this.owner = nicheOwner;
    }
    //setters and getters
    public String getFitActivity() {
        return fitActivity;
    }

    public void setMembers(HashSet<Buddy> members) {
        this.members = members;
    }
    public HashSet<Buddy> getMembers(){
        return this.members;
    }
    public boolean addMember(Buddy newMember){
       return this.members.add(newMember);
    }

    public boolean removeMember(Buddy memberToRemove){

        return this.members.remove(memberToRemove);
    }

    public void setOwner(Buddy owner) {
        this.owner = owner;
    }

    public Buddy getOwner() {
        return this.owner;
    }


}

