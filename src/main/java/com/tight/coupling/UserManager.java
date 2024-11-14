package com.tight.coupling;

public class UserManager {

    public UserDatabase userDatabase = new UserDatabase();
    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
