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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        String directory = "contacts-data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        boolean invalidEntry = true;

        boolean startOver = true;
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
//        System.out.println("You entered: " + userMenuOption);

                switch (userMenuOption) {
                    case 1:
//                System.out.println("You entered: 1");
                        invalidEntry = false;
                        // Display all contacts

                        try {
                            List<String> contacts = Files.readAllLines(dataFile);
                            Files.write(dataFile, contacts);
                            for (String contact : contacts) {
                                System.out.println(contact);
                            }
                        }catch (IOException e) {
                            e.printStackTrace();
                        }

                        break;
                    case 2:
//                System.out.println("You entered: 2");
                        // Add a new contact
                        System.out.print("Enter the contact's name: ");
                        String userContactName = scanner.next();
//                    System.out.println();

                        System.out.print("Enter the contact's phone number: (numbers only, no characters or spaces): ");
                        String userContactPhoneNumber = scanner.next();

                        String nameAndNumber = String.format("%s | %s", userContactName, userContactPhoneNumber);
                        //Jack Blank | 1231231234

                        //TODONE: figure out how to enter input for the contact's name, then move to a new line to enter the contact's phone number. Presently, I am unable to ener the contact name and can only enter the contact number. *Fixed with adding use delimter to scanner and changing scanner.nextline() to scanner.next().

//                    System.out.println("Contact name: " + userContactName + "\nContact phone number: " + userContactPhoneNumber);
                        try {
                            if (Files.notExists(dataDirectory)) {
                                Files.createDirectory(dataDirectory);
                            }

                            if (!Files.exists(dataFile)) {
                                Files.createFile(dataFile);
                            }

                            if (Files.exists(dataFile)) {
                                // Name | Phone number
                                //---------------
                                Files.write(dataFile, Arrays.asList("Name | Phone number"));
                                Files.write(dataFile, Arrays.asList("---------------"), StandardOpenOption.APPEND);
                                Files.write(dataFile, Arrays.asList(nameAndNumber), StandardOpenOption.APPEND);
//                            Files.write(dataFile, Arrays.asList(//put variable here that combines name and phone number));
                                // format: Jack Blank | 1231231234
                            }
                        }catch (IOException e) {
                            e.printStackTrace();
                        }


                        invalidEntry = false;
                        break;
                    case 3:
//                System.out.println("You entered: 3");
                        invalidEntry = false;
                        // Search contact by name
                        break;
                    case 4:
//                System.out.println("You entered: 4");
                        invalidEntry = false;
                        // Delete an existing contact
                        System.out.print("What contact would you like to delete? ");
                        String userContactToDelete = scanner.next();
//                    System.out.printf("You deleted: %s", userContactToDelete);
                        break;
                    case 5:
                        System.out.println("Exiting");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid entry, please try again\n");
                        break;
                }//end switch

            }while (invalidEntry);
        }//end while()

//        System.out.println("Exited do while loop");
    }// end psvm
}// end class ContactsMain
