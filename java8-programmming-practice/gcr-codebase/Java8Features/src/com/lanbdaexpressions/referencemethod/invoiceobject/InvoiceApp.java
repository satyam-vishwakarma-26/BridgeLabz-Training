package com.lanbdaexpressions.referencemethod.invoiceobject;
import java.util.*;
import java.util.stream.Collectors;

public class InvoiceApp {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(
            1001, 1002, 1003, 1004
        );

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)   // Constructor Reference
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}