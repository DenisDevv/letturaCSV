package live.denisdev;

import java.util.ArrayList;

public class CustomerResults {
    private ArrayList<CustomerRecord> records = new ArrayList<>();

    public void addRecord(CustomerRecord record) {
        records.add(record);
    }

    public ArrayList<CustomerRecord> getRecords() {
        return records;
    }
}