interface DataExporter {
    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting to JSON: {\"data\":\"" + data + "\"}");
    }
}

class CSVExporter implements DataExporter {
    public void export(String data) {
        System.out.println("Exporting to CSV: " + data);
    }
}

public class ExportTest {
    public static void main(String[] args) {
        CSVExporter e = new CSVExporter();
        e.export("Report");
        e.exportToJSON("Report");
    }
}
