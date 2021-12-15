public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello ");
//        System.out.print("World!");
//
//        System.out.println();

        //TODONE: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 83;
        System.out.println(myFavoriteNumber);

        //TODONE: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Derek";
        System.out.println(myString);

        //TODONE: Change your code to assign a character value to myString. What do you notice?
        //I noticed that there was an error because the required data type is String
//        myString = 'd';

        //TODONE: Change your code to assign the value 3.14159 to myString. What happens?
        //I noticed that there was an error because the required data type is String
//        myString = 3.14159;

        //TODONE: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        // received error message: java: variable myNumber might not have been initialized
//        long myNumber;
//        System.out.println(myNumber);
        //TODONE: Change your code to assign the value 3.14 to myNumber. What do you notice?
        //the data provided was a double and needs to be a long
//        myNumber = 3.14;
//        System.out.println(myNumber);

        //TODONE: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;
//        System.out.println(myNumber);

        //TODONE: Change your code to assign the value 123 to myNumber.
//        myNumber = 123;
//        System.out.println(myNumber);

        //TODONE: Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        //I am not sure because it compiled as a long

        //TODONE: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        //TODONE: Copy and paste the following code blocks one at a time and execute them
        //int x = 5;
        //System.out.println(x++); //returns 5
        //System.out.println(x); // returns 6
        float myNumber = 3.14f;
//        System.out.println(myNumber);

        //int x = 5;
        //System.out.println(++x); //returns 6
        //System.out.println(x); //returns 6

        //What is the difference between the above code blocks? Explain why the code outputs what it does.

        //TODONE: Try to create a variable named class. What happens?
        //It doesn't work because class is a reserved key word
//        class color = "blue";

        //TODONE: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        //I don't think it will compile because int three is casting an int to a String

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        System.out.println(three);

        //Copy and paste the code above and then run it. Does the result match with your expectation?
        //
        //How is the above example different from the code block below?
//        int three = (int) "three";
//
//        System.out.println(three);
        //What are the two different types of errors we are observing?

        //TODONE: Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;

//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;

        // y *= x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;

        //x /= y;

//        y = y - x;

//        y -= x;

        //TODONE: What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        //There will be a compile error


        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
    }//end main
}
