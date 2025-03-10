package live.denisdev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CustomerResults {
    private ArrayList<CustomerRecord> records = new ArrayList<>();

    public CustomerResults() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/customers-100.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campi = line.split(",");
                CustomerRecord record = new CustomerRecord(campi[0], campi[1], campi[2], campi[3], campi[4], campi[5], campi[6], campi[7], campi[8], campi[9], campi[10], campi[11]);
                addRecord(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addRecord(CustomerRecord record) {
        records.add(record);
    }

    public ArrayList<CustomerRecord> getRecords() {
        return records;
    }
}