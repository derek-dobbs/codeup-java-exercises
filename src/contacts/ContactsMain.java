package contacts;

import java.util.Scanner;

public class ContactsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean invalidEntry = true;

        do {
            // Main menu
            System.out.println("Welcome! What would you like to do?" +
                    "\n1. View contacts" +
                    "\n2. Add a new contact" +
                    "\n3. Search a contact by name" +
                    "\n4. Delete an existing contact" +
                    "\n5. Exit");
            System.out.print("Enter an option: ");

            int userMenuOption = scanner.nextInt();
//        System.out.println("You entered: " + userMenuOption);

            switch (userMenuOption) {
                case 1:
//                System.out.println("You entered: 1");
                invalidEntry = false;
                    // Display all contacts
                    break;
                case 2:
//                System.out.println("You entered: 2");
                    invalidEntry = false;
                    // Add a new contact
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

//        System.out.println("Exited do while loop");
    }// end psvm
}// end class ContactsMain
