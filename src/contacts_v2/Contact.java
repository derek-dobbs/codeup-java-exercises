package contacts_v2;

public class Contact {
    protected String contactFirstName;
    protected String contactLastName;
    protected int contactPhoneNumber;

    public Contact(String contactFirstName, String contactLastName, int contactPhoneNumber) {
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public int getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(int contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact("person1First", "person1Last", 1234567);

        System.out.printf("First name: %s\nLastname: %s\nPhone number: %d", contact1.getContactFirstName(), contact1.getContactLastName(), contact1.getContactPhoneNumber());

    }// end psvm
}// end class Contact
