//package contacts;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Scanner;
//
//public class ContactsMain {
//    public static Scanner scanner = new Scanner(System.in);
//
//    public static String directory = "contacts-data";
//    public static String filename = "contacts.txt";
//    public static boolean invalidEntry = true;
//    public static boolean startOver = true;
//
//    public static Path dataDirectory = Paths.get(directory);
//    public static Path dataFile = Paths.get(directory, filename);
//
//    public static List<String> contacts;
//
//    public static HashMap<String, String> contactsMap = new HashMap<>();
//
//    public static String contactsString;
//
//
//
//    public static void displayContacts() throws IOException {
//        Files.write(dataFile, Arrays.asList("---------------"), StandardOpenOption.APPEND);
//        contactsString = contactsMap.toString();
//        contactsString =  contactsString
//                .replace('{', ' ')
//                .replace('}', ' ')
//                .replace("=", "\t| ")
//                .replace(",", "\n");
//
//        try {
//            contacts = Files.readAllLines(dataFile);
//
//            for (String contact : contacts) {
//                System.out.println(contact);
//            }
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//    }//end displayContacts()
//
//    public static void addContact() {
//        scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        System.out.print("Enter the contact's name: ");
//        String userContactName = scanner.next();
//
//        System.out.print("Enter the contact's phone number: (numbers only, no characters or spaces): ");
//        String userContactPhoneNumber = scanner.next();
//
////        String nameAndNumber = String.format("%s | %s", userContactName, userContactPhoneNumber);
//
//        contactsMap.put(userContactName, userContactPhoneNumber);
//
////                    contactsString = contactsMap.toString();
////            contactsString =  contactsString
////                    .replace('{', ' ')
////                    .replace('}', ' ')
////                    .replace("=", "\t| ")
////                    .replace(",", "\n");
//
////            System.out.println(contactsString);
//
////        try {
////            if (Files.notExists(dataDirectory)) {
////                Files.createDirectory(dataDirectory);
////            }
////
////            if (!Files.exists(dataFile)) {
////                Files.createFile(dataFile);
////            }
////
////            if (Files.exists(dataFile)) {
////                Files.write(dataFile, Arrays.asList(contactsString));
////            }
////        }catch (IOException e) {
////            e.printStackTrace();
////        }
//    }//end addContact()
//
//    public static void searchContact() {
//        System.out.println("searchContact Test");
//    }// end searchContact()
//
//    public static void deleteContact() {
//        scanner = new Scanner(System.in);
//        System.out.print("What contact would you like to delete? ");
//        String userContactToDelete = scanner.next();
////        System.out.printf("//TEST: You deleted: %s", userContactToDelete);
//
//        try {
//            contactsMap.remove(userContactToDelete);
////            System.out.println(contactsMap.toString());
////            Files.write(dataFile, Arrays.asList(contactsString));
//
////            contacts = Files.readAllLines(dataFile);
////            contacts.remove(userContactToDelete);
////            Files.write(dataFile, contacts);
//
//            System.out.println("Deletion complete");
//        }catch (Exception e) {
//            System.out.println("Error occurred with deleting contact");
//            e.printStackTrace();
//        }
//    }// end deleteContact()
//
//    public static void main(String[] args) {
//        try {
//            Files.write(dataFile, Arrays.asList("Name | Phone number"));
//            Files.write(dataFile, Arrays.asList("---------------"), StandardOpenOption.APPEND);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        while (startOver) {
//            do {
//                // Main menu
//                System.out.println("\nWelcome! What would you like to do?" +
//                        "\n////////////////////////////////" +
//                        "\n1. View contacts" +
//                        "\n2. Add a new contact" +
//                        "\n3. Search a contact by name" +
//                        "\n4. Delete an existing contact" +
//                        "\n5. Exit" +
//                        "\n////////////////////////////////");
//                System.out.print("Enter an option: ");
//
//                String userMenuOption = scanner.next();
//
//                switch (userMenuOption) {
//                    case "1":
//                        // Display all contacts
//                        displayContacts();
//                        invalidEntry = false;
//                        break;
//                    case "2":
//                        // Add a new contact
//                        addContact();
//                        invalidEntry = false;
//                        break;
//                    case "3":
//                        // Search contact by name
//                        searchContact();
//                        invalidEntry = false;
//                        break;
//                    case "4":
//                        // Delete an existing contact
//                        deleteContact();
//                        invalidEntry = false;
//                        break;
//                    case "5":
//                        // Exit the program
//                        System.out.println("Exiting...");
//                        System.exit(0);
//                        break;
//                    default:
//                        // Default message for invalid entry
//                        System.out.println("Invalid entry, please try again\n");
//                        break;
//                }//end switch
//            }while (invalidEntry);
//        }//end while()
//    }// end psvm
//}// end class ContactsMain
