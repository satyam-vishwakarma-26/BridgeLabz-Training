package com.interfaces.markerinterface.dataserialization;
public class UserData implements BackupSerializable {

    private String username;
    private String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserData [username=" + username + ", email=" + email + "]";
    }
}