package main.com.entity;

import java.io.Serializable;

/**
 * Created by Naoum on 12/02/2017.
 */

public enum UserProfileType implements Serializable {

    USER("USER"), DBA("DBA"), ADMIN("ADMIN");

    String userProfileType;

    private UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType(){
        return userProfileType;
    }
}
