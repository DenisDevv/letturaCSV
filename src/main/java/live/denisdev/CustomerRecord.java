package live.denisdev;

public class CustomerRecord {
    private String index;
    private String id;
    private String firstName;
    private String lastName;
    private String company;
    private String city;
    private String country;
    private String phone1;
    private String phone2;
    private String email;
    private String subscriptionDate;
    private String website;

    public CustomerRecord(String index, String id, String firstName, String lastName, String company, String city, String country,
                          String phone1, String phone2, String email, String subscriptionDate, String website) {
        this.index = index;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.city = city;
        this.country = country;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.subscriptionDate = subscriptionDate;
        this.website = website;
    }
    public String getIndex() { return index; }
    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCompany() { return company; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
    public String getPhone1() { return phone1; }
    public String getPhone2() { return phone2; }
    public String getEmail() { return email; }
    public String getSubscriptionDate() { return subscriptionDate; }
    public String getWebsite() { return website; }
}