package com.collections.votingsystem;
import java.util.*;

public class VotingSystem {

    // stores final vote count
    static Map<String, Integer> voteCount = new HashMap<>();

    // maintains order of votes cast
    static Map<Integer, String> voteOrder = new LinkedHashMap<>();
    static int voteNumber = 1;

    static void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(voteNumber++, candidate);
    }

    static void displayVoteOrder() {
        System.out.println("Vote Order:");
        for (String candidate : voteOrder.values()) {
            System.out.println(candidate);
        }
    }

    static void displaySortedResults() {
        // TreeMap used for sorted result display
        Map<String, Integer> sortedResult = new TreeMap<>(voteCount);
        System.out.println("Final Results (Sorted):");
        for (Map.Entry<String, Integer> entry : sortedResult.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
    	//Created Scanner Class Object For taking User Inputs 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of votes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter candidate name: ");
            String candidate = sc.nextLine();
            castVote(candidate);
        }

        displayVoteOrder();
        displaySortedResults();

        sc.close();
    }
}