
package com.csvdatahandling.advancedproblems.encryptanddecryptdata;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEncryptedCSV {

    public static void main(String[] args) {

        String fileName = "employees_encrypted.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            // Header
            writer.write("ID,Name,Email,Salary\n");

            // Encrypt sensitive fields
            writer.write("101,Amit," +
                    CryptoUtil.encrypt("amit@gmail.com") + "," +
                    CryptoUtil.encrypt("55000") + "\n");

            writer.write("102,Rahul," +
                    CryptoUtil.encrypt("rahul@yahoo.com") + "," +
                    CryptoUtil.encrypt("48000") + "\n");

            writer.write("103,Neha," +
                    CryptoUtil.encrypt("neha@company.com") + "," +
                    CryptoUtil.encrypt("62000") + "\n");

            System.out.println("Encrypted CSV file written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
