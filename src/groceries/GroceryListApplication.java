package groceries;
import grades.Student;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GroceryListApplication {

    public static void displayGroceryList (GroceryItem groceryItem1) {
        String groceryItemName = groceryItem1.getItem();
        String groceryCategoryName = groceryItem1.getCategory();
        int groceryQuantity = groceryItem1.getQuantity();

        System.out.printf("Item: %s\tCategory: %s\tQuantity: %s", groceryItemName, groceryCategoryName, groceryQuantity);
    }

    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        System.out.println("Would you like to do?");
        System.out.println("1 - View List\n2 - Delete List\n3 - Add Item to List\n4 - Exit");
        int userListConfirm = intScanner.nextInt();
//        System.out.println("Create list choice: " + userListConfirm);
        System.out.println();

        switch (userListConfirm) {
            case 1:
                System.out.println("Default for #1");
                break;
            case 2:
                System.out.println("Default for #2");
                break;
            case 3:
                //
                break;
            case 4:
                System.out.println("Goodbye");
                System.exit(0);
                break;
        }

//        System.out.println("Would you like to do?");
//        System.out.println("1 - Enter new item \n2 - Exit");
//        int userNewItemConfirm = intScanner.nextInt();
////        System.out.println("New item confirm choice: " + userNewItemConfirm);
//        System.out.println();

        System.out.println("Select the item category:" +
                "\n1 - Grains (bread, cereal, rice, pasta, noodles, etc.)" +
                "\n2 - Vegetables and Legumes" +
                "\n3 - Fruit" +
                "\n4 - Dairy (milk, yogurt, cheese, etc." +
                "\n5 - Meat (beef, poultry, fish, etc.)" +
                "\n6 - Other/Uncategorized");
        int userCategorySelection = intScanner.nextInt();
        System.out.println("User category selection: " + userCategorySelection);
        System.out.println();

        System.out.println("Enter the name of the item:");
        String userItem = stringScanner.nextLine();
        System.out.println("User item: " + userItem);
        System.out.println();

        System.out.println("Enter the quantity:");
        int quantity = stringScanner.nextInt();
        System.out.println("User quantity: " + quantity);
        System.out.println();

        String userCategorySelectionString = "default value";

        switch (userCategorySelection) {
            case 1:
                userCategorySelectionString = "Grains";
                break;
            case 2:
                userCategorySelectionString = "Vegetables and Legumes";
                break;
            case 3:
                userCategorySelectionString = "Fruit";
                break;
            case 4:
                userCategorySelectionString = "Dairy";
                break;
            case 5:
                userCategorySelectionString = "Meat";
                break;
            case 6:
                userCategorySelectionString = "Other/Uncategorized";
                break;
            default:
                System.out.println("Invalid category entry");
        }

        HashMap<String, Integer> groceryList = new HashMap<>();
        groceryList.put(userItem, quantity);

        System.out.println(groceryList);

        System.out.println("Please make a selection: " +
                "\n1 - Finalize List" +
                "\n2 - Add Item");
        int userFinalize = stringScanner.nextInt();
        System.out.println("User selection: " + userFinalize);
        System.out.println();

        System.out.println("Here is your list:");
        System.out.println(groceryList);
        System.out.println();
    }
}//end class GroceryListApplication
