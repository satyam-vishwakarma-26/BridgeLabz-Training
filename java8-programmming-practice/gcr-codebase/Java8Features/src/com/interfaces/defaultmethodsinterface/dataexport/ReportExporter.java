package com.interfaces.defaultmethodsinterface.dataexport;
public interface ReportExporter {

    void exportToCSV(String data);

    void exportToPDF(String data);

    // Newly added feature
    default void exportToJSON(String data) {
        System.out.println("Exporting data to JSON using default implementation");
        System.out.println("{ \"report\": \"" + data + "\" }");
    }
}