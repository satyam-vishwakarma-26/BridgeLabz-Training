package com.collections.bankingsystem;
import java.util.*;

public class BankingSystem {

    // stores account number and balance
    static Map<Integer, Integer> accounts = new HashMap<>();

    // queue for withdrawal requests
    static Queue<WithdrawalRequest> queue = new LinkedList<>();

    static void addAccount(int accNo, int balance) {
        accounts.put(accNo, balance);
    }

    static void addWithdrawalRequest(int accNo, int amount) {
        queue.add(new WithdrawalRequest(accNo, amount));
    }

    // processes withdrawals in FIFO order
    static void processWithdrawals() {
        while (!queue.isEmpty()) {
            WithdrawalRequest req = queue.remove();
            int balance = accounts.getOrDefault(req.accountNumber, 0);

            if (balance >= req.amount) {
                accounts.put(req.accountNumber, balance - req.amount);
                System.out.println("Withdrawal successful for account " + req.accountNumber);
            } else {
                System.out.println("Insufficient balance for account " + req.accountNumber);
            }
        }
    }

    // displays customers sorted by balance
    static void displaySortedByBalance() {
        TreeMap<Integer, List<Integer>> sorted = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
            sorted.putIfAbsent(entry.getValue(), new ArrayList<>());
            sorted.get(entry.getValue()).add(entry.getKey());
        }

        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Integer, List<Integer>> entry : sorted.entrySet()) {
            for (int acc : entry.getValue()) {
                System.out.println("Account: " + acc + " Balance: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
    	//Created Scanner Class Object for taking user inputs 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Balance: ");
            int balance = sc.nextInt();

            addAccount(accNo, balance);
        }

        System.out.print("Enter number of withdrawal requests: ");
        int w = sc.nextInt();

        for (int i = 0; i < w; i++) {
            System.out.print("Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Withdraw Amount: ");
            int amount = sc.nextInt();

            addWithdrawalRequest(accNo, amount);
        }

        processWithdrawals();
        displaySortedByBalance();

        sc.close();
    }
}