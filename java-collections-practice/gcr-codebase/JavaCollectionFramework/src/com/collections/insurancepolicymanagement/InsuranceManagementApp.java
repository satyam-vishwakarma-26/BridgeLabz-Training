package com.collections.insurancepolicymanagement;
import java.time.LocalDate;
import java.util.*;

public class InsuranceManagementApp {

    public static void main(String[] args) {
    	//Created Scanner Class Object For Taking User Inputs 
        Scanner sc = new Scanner(System.in);
        PolicyStore store = new PolicyStore();

        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Policy Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Policy Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry Date (yyyy-mm-dd): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            System.out.print("Coverage Type: ");
            String type = sc.nextLine();

            System.out.print("Premium Amount: ");
            double premium = sc.nextDouble();

            store.addPolicy(new Policy(number, name, date, type, premium));
        }

        System.out.println("\nAll Policies (HashSet):");
        PolicyService.displayAll(store.getHashSet());

        System.out.println("\nPolicies Expiring Soon:");
        PolicyService.expiringSoon(store.getHashSet());

        sc.nextLine();
        System.out.print("\nEnter coverage type to search: ");
        String searchType = sc.nextLine();
        PolicyService.byCoverageType(store.getHashSet(), searchType);

        Policy testPolicy =
                new Policy(9999, "Test", LocalDate.now().plusDays(10), "Health", 5000);

        System.out.println("\nPerformance Comparison");

        System.out.println("\nHashSet:");
        PerformanceTest.test(new HashSet<>(store.getHashSet()), testPolicy);

        System.out.println("\nLinkedHashSet:");
        PerformanceTest.test(new LinkedHashSet<>(store.getLinkedHashSet()), testPolicy);

        System.out.println("\nTreeSet:");
        PerformanceTest.test(new TreeSet<>(store.getTreeSet()), testPolicy);

        sc.close();
    }
}