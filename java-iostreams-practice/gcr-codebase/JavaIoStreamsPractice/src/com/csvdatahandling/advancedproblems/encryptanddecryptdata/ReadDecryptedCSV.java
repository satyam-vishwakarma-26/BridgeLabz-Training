
package com.csvdatahandling.advancedproblems.encryptanddecryptdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDecryptedCSV {

    public static void main(String[] args) {

        String fileName = "employees_encrypted.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            System.out.println("Decrypted Employee Records:");
            System.out.println("--------------------------------");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = CryptoUtil.decrypt(data[2]);
                String salary = CryptoUtil.decrypt(data[3]);

                System.out.println("ID     : " + id);
                System.out.println("Name   : " + name);
                System.out.println("Email  : " + email);
                System.out.println("Salary : " + salary);
                System.out.println("--------------------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
