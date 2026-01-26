
package com.csvdatahandling.advancedproblems.encryptanddecryptdata;

import java.util.Base64;

public class CryptoUtil {

    // Encrypt data using Base64
    public static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    // Decrypt data using Base64
    public static String decrypt(String encryptedData) {
        return new String(Base64.getDecoder().decode(encryptedData));
    }
}
