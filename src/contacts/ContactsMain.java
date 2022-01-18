package contacts;

import java.util.Scanner;

public class ContactsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        boolean invalidEntry = true;

        do {
            // Main menu
            System.out.println("Welcome! What would you like to do?" +
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
                    break;
                case 2:
//                System.out.println("You entered: 2");
                    // Add a new contact
                    System.out.print("Enter the contact's name: ");
                    String userContactName = scanner.next();
//                    System.out.println();

                    System.out.print("Enter the contact's phone number: (numbers only, no characters or spaces): ");
                    String userContactPhoneNumber = scanner.next();

                    //TODONE: figure out how to enter input for the contact's name, then move to a new line to enter the contact's phone number. Presently, I am unable to ener the contact name and can only enter the contact number. *Fixed with adding use delimter to scanner and changing scanner.nextline() to scanner.next().

                    System.out.println("Contact name: " + userContactName + "\nContact phone number: " + userContactPhoneNumber);
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

        System.out.println("Exited do while loop");
    }// end psvm
}// end class ContactsMain
