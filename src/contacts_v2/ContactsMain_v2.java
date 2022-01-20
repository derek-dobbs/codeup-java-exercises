package contacts_v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactsMain_v2 extends Contact{
    protected static String directory = "contacts_data_v2";
    protected static String filename = "contacts_v2.txt";

    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory, filename);

    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> contacts = new ArrayList<>();

    public static List<String> contactsList;

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
                    "\n3. Search for a contact" +
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
        try {
            contactsList = Files.readAllLines(dataFile);
            for(String contact : contactsList) {
                System.out.println(contact);
            }

            Files.write(dataFile, contactsList);
        } catch(IOException iox) {
            iox.printStackTrace();
        }
        mainMenu();
    }// end showContacts()

    public static void addContact() {
        scanner.useDelimiter("\n");

        System.out.print("Enter the contact's first name: ");
        String enteredFirstName = scanner.next();

        System.out.print("Enter the contact's last name: ");
        String enteredLastName = scanner.next();

        System.out.print("Enter the contact's phone number: ");
        int enteredPhoneNumber = scanner.nextInt();

        Contact contact = new Contact(enteredFirstName, enteredLastName, enteredPhoneNumber);

        String contactString = String.format("%s %s\t| %d", contact.getContactFirstName(), contact.getContactLastName(), contact.getContactPhoneNumber());

        contacts.add(contactString);

        try {
            if(Files.notExists(dataDirectory)) {
                Files.createDirectory(dataDirectory);
            }

            if(!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            if(Files.exists(dataFile)) {
                Files.write(dataFile, Arrays.asList(contactString), StandardOpenOption.APPEND);
            }
        } catch(IOException iox) {
            iox.printStackTrace();
        }

        mainMenu();
    }// end addContact()

    public static void searchContact() {
        scanner.useDelimiter("\n");

        System.out.print("Enter search term: ");
        String userSearchTerm = scanner.next();

        System.out.println("You entered: " + userSearchTerm);

        System.out.println("Search results: ");

        for (String contact : contactsList) {
            if (contact.contains(userSearchTerm)) {
                System.out.println(contact);
            }
        }
        mainMenu();
    }

    public static void deleteContact() {
        System.out.println("test deleteContact");
        mainMenu();
    }

    public static void main(String[] args) {
        mainMenu(); //starts the program
    }// end psvm
}//end class ContactsMain_v2