package live.denisdev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerResults risultati = new CustomerResults();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/customers-100.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campi = line.split(",");
                CustomerRecord record = new CustomerRecord(campi[0], campi[1], campi[2], campi[3], campi[4], campi[5], campi[6], campi[7], campi[8], campi[9], campi[10], campi[11]);
                risultati.addRecord(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il paese di cui vuoi visualizzare i clienti:");
        String paese = in.nextLine();
        for (CustomerRecord record : risultati.getRecords()) {
            if (record.getCountry().equals(paese))
                System.out.println("#" + record.getIndex() + " "+ record.getId() + " " + record.getFirstName() + " " + record.getLastName() + " " + record.getCompany() + " " + record.getCity() + " " + record.getCountry() + " " + record.getPhone1() + " " + record.getPhone2() + " " + record.getEmail() + " " + record.getSubscriptionDate() + " " + record.getWebsite());
        }
    }
}