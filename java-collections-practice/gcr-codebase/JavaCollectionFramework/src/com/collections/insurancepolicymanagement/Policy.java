package com.collections.insurancepolicymanagement;
import java.time.LocalDate;
import java.util.Objects;

public class Policy {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    //Constructor 
    public Policy(int policyNumber, String holderName, LocalDate expiryDate,
                  String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    // uniqueness based on policy number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber == policy.policyNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
               expiryDate + " | " + coverageType + " | " + premium;
    }
}