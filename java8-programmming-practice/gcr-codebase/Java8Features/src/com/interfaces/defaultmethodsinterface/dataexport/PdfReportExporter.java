package com.interfaces.defaultmethodsinterface.dataexport;
public class PdfReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("CSV export not supported in PDF exporter");
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting data to PDF: " + data);
    }
}