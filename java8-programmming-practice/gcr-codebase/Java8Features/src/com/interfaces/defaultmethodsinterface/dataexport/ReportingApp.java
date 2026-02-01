package com.interfaces.defaultmethodsinterface.dataexport;
public class ReportingApp {
    public static void main(String[] args) {

        ReportExporter csvExporter = new CsvReportExporter();
        ReportExporter pdfExporter = new PdfReportExporter();
       

        csvExporter.exportToJSON("Sales Report");
        pdfExporter.exportToJSON("Inventory Report");
        
    }
}