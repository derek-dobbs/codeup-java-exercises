package groceries;
import util.Input;
import java.util.Locale;
import java.util.Scanner;

public class GroceryListApplication {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        System.out.println("Would you like to create a grocery list?");
        System.out.println("1 - Yes \n2 - No");
        int userListConfirm = intScanner.nextInt();
        System.out.println("Create list choice: " + userListConfirm);
        System.out.println();

        System.out.println("Would you like to enter a new item?");
        System.out.println("1 - Yes \n2 - No");
        int userNewItemConfirm = intScanner.nextInt();
        System.out.println("New item confirm choice: " + userNewItemConfirm);
        System.out.println();

        System.out.println("Select the category:" +
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

        System.out.println("Please make a selection: " +
                "\n1 - Finalize List" +
                "\n2 - Add Item");
        int userFinalize = stringScanner.nextInt();
        System.out.println("User selection: " + userFinalize);
        System.out.println();

        System.out.println("Here is your list:");
        System.out.println("ph_List of Items Organized Alphabetically");
        System.out.println();
    }
}//end class GroceryListApplication
