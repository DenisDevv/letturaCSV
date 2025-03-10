package live.denisdev;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerResults risultati = new CustomerResults();
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il paese di cui vuoi visualizzare i clienti:");
        String paese = in.nextLine();
        for (CustomerRecord record : risultati.getRecords()) {
            if (record.getCountry().equals(paese))
                System.out.println("#" + record.getIndex() + " "+ record.getId() + " " + record.getFirstName() + " " + record.getLastName() + " " + record.getCompany() + " " + record.getCity() + " " + record.getCountry() + " " + record.getPhone1() + " " + record.getPhone2() + " " + record.getEmail() + " " + record.getSubscriptionDate() + " " + record.getWebsite());
        }
    }
}