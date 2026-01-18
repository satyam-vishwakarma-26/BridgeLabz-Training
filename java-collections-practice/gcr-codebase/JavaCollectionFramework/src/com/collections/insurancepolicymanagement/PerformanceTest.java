package com.collections.insurancepolicymanagement;
import java.util.Set;

public class PerformanceTest {

	//test method 
    public static void test(Set<Policy> set, Policy sample) {
        long start, end;

        start = System.nanoTime();
        set.add(sample);
        end = System.nanoTime();
        System.out.println("Add time: " + (end - start));

        start = System.nanoTime();
        set.contains(sample);
        end = System.nanoTime();
        System.out.println("Search time: " + (end - start));

        start = System.nanoTime();
        set.remove(sample);
        end = System.nanoTime();
        System.out.println("Remove time: " + (end - start));
    }
}