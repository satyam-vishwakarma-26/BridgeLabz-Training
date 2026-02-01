package com.interfaces.markerinterface.dataserialization;
public class BackupApp {
    public static void main(String[] args) {

        UserData user = new UserData("john_doe", "john@email.com");
        TempLog log = new TempLog("Session started");

        BackupProcessor.processBackup(user);
        BackupProcessor.processBackup(log);
    }
}