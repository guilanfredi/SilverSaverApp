package com.weebly.silvertm.silversaver;

/**
 * Created by LUCAS on 08/10/2016.
 */

public class GlobalUser {
    private User user;

    private GlobalUser(){

    }

    public User getInstance() {
        if(user == null) {
            user = new User();
            return user;
        } else {
            return user;
        }
    }
}
