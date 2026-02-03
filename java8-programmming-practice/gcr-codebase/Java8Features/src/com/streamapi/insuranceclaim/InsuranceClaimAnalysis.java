package com.streamapi.insuranceclaim;
import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 12000),
            new Claim("Vehicle", 8000),
            new Claim("Health", 15000),
            new Claim("Property", 20000),
            new Claim("Vehicle", 10000),
            new Claim("Health", 18000),
            new Claim("Property", 25000)
        );

        // Group by claim type and calculate average claim amount
        Map<String, Double> averageClaimByType =
                claims.stream()
                      .collect(Collectors.groupingBy(
                          claim -> claim.claimType,
                          Collectors.averagingDouble(claim -> claim.amount)
                      ));

        // Output
        averageClaimByType.forEach((type, avg) ->
            System.out.println(type + " Average Claim: " + avg)
        );
    }
}
