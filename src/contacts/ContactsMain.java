package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactsMain {
    public static String directory = "contacts-data";
    public static String filename = "contacts.txt";
    public static boolean invalidEntry = true;
    public static boolean startOver = true;

    public static Path dataDirectory = Paths.get(directory);
    public static Path dataFile = Paths.get(directory, filename);

    public static void displayContacts() {
        try {
            List<String> contacts = Files.readAllLines(dataFile);

            for (String contact : contacts) {
                System.out.println(contact);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }//end displayContacts()

    public static void addContact() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Enter the contact's name: ");
        String userContactName = scanner.next();

        System.out.print("Enter the contact's phone number: (numbers only, no characters or spaces): ");
        String userContactPhoneNumber = scanner.next();

        String nameAndNumber = String.format("%s | %s", userContactName, userContactPhoneNumber);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectory(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            if (Files.exists(dataFile)) {
                Files.write(dataFile, Arrays.asList(nameAndNumber), StandardOpenOption.APPEND);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }//end addContact()

    public static void searchContact() {
        System.out.println("searchContact Test");
    }// end searchContact()

    public static void  deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What contact would you like to delete? ");
        String userContactToDelete = scanner.next();
        System.out.printf("//TEST: You deleted: %s", userContactToDelete);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        try {
            Files.write(dataFile, Arrays.asList("Name | Phone number"));
            Files.write(dataFile, Arrays.asList("---------------"), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }

        while (startOver) {
            do {
                // Main menu
                System.out.println("\nWelcome! What would you like to do?" +
                        "\n////////////////////////////////" +
                        "\n1. View contacts" +
                        "\n2. Add a new contact" +
                        "\n3. Search a contact by name" +
                        "\n4. Delete an existing contact" +
                        "\n5. Exit" +
                        "\n////////////////////////////////");
                System.out.print("Enter an option: ");

                int userMenuOption = scanner.nextInt();

                switch (userMenuOption) {
                    case 1:
                        // Display all contacts
                        displayContacts();
                        invalidEntry = false;
                        break;
                    case 2:
                        // Add a new contact
                        addContact();
                        invalidEntry = false;
                        break;
                    case 3:
                        // Search contact by name
                        searchContact();
                        invalidEntry = false;
                        break;
                    case 4:
                        // Delete an existing contact
                        deleteContact();
                        invalidEntry = false;
                        break;
                    case 5:
                        // Exit the program
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        // Default message for invalid entry
                        System.out.println("Invalid entry, please try again\n");
                        break;
                }//end switch
            }while (invalidEntry);
        }//end while()
    }// end psvm
}// end class ContactsMain
