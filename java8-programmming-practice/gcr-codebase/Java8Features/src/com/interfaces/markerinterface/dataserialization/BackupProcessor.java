package com.interfaces.markerinterface.dataserialization;
public class BackupProcessor {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj);
            // Serialization logic would go here
        } else {
            System.out.println("Skipping backup for object: " + obj.getClass().getSimpleName());
        }
    }
}