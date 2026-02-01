package com.interfaces.staticmethodinterface.dateformatting;
import java.time.LocalDate;

public class InvoiceGenerator {
    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateFormatterUtil.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateFormatterUtil.formatDate(invoiceDate, "dd/MM/yyyy");
        String format3 = DateFormatterUtil.formatDate(invoiceDate, "MMM dd, yyyy");

        System.out.println("Invoice Date Formats:");
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
    }
}