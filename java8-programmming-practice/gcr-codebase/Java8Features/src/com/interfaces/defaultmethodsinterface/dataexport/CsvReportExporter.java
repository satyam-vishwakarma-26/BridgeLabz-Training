package com.interfaces.defaultmethodsinterface.dataexport;
public class CsvReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting data to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("PDF export not supported in CSV exporter");
    }
}