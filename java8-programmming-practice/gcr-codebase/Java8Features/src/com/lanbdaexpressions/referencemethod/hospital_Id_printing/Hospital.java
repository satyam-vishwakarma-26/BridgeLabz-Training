package com.lanbdaexpressions.referencemethod.hospital_Id_printing;
import java.util.*;

public class Hospital {

    public static void main(String[] args) {

        List<Integer> patientIds = Arrays.asList(
            101, 102, 103, 104, 105
        );

        // Print all patient IDs using Method Reference
        patientIds.forEach(System.out::println);
    }
}