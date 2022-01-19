package contacts_v2;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsMain_v2 extends Contact{
    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Contact> contacts = new ArrayList<>();

    public ContactsMain_v2(String contactFirstName, String contactLastName, int contactPhoneNumber) {
        super(contactFirstName, contactLastName, contactPhoneNumber);
    }

    public static void mainMenu() {
        scanner.useDelimiter("\n");
        boolean validEntry = true;

        do {
            System.out.println("--------------------------" +
                    "\n1. View contacts" +
                    "\n2. Add a new contact" +
                    "\n3. Search a contact by name" +
                    "\n4. Delete an existing contact" +
                    "\n5. Exit" +
                    "\n--------------------------");
            System.out.print("Select an option: ");

            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 1:
                    showContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid entry, please try again");
                    validEntry = false;
                    break;
            }
        }while (!validEntry);
    }// end mainMenu()

    public static void showContacts() {
        System.out.println("Test showContacts()");
    }

    public static void addContact() {
//        System.out.println("test addContact");
        scanner.useDelimiter("\n");

        System.out.print("Enter the contact's first name: ");
        String enteredFirstName = scanner.next();

        System.out.print("Enter the contact's last name: ");
        String enteredLastName = scanner.next();

        System.out.print("Enter the contact's phone number: ");
        int enteredPhoneNumber = scanner.nextInt();

//        System.out.printf("Entered first name: %s\nEntered last name: %s\nEntered phone number: %d", enteredFirstName, enteredLastName, enteredPhoneNumber);
        Contact contact = new Contact(enteredFirstName, enteredLastName, enteredPhoneNumber);

//        String contactToString = contact.toString();
//
//        System.out.println(contactToString);

        contacts.add(contact);

        System.out.println(contacts);

    }// end addContact()

    public static void searchContact() {
        System.out.println("test searchContact");
    }

    public static void deleteContact() {
        System.out.println("test deleteContact");
    }

    public static void main(String[] args) {
//        System.out.println("test");
//        showContacts();
//        addContact();
//        searchContact();
//        deleteContact();
//        mainMenu();

    }// end psvm
}//end class ContactsMain_v2