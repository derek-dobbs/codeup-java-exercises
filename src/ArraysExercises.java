import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        //What happens when you run the following code? Why is Arrays.toString necessary?
        //Answer: if you don't use Arrays.toString, it will return the memory location of the variable
        int[] numbers = {1, 2, 3, 4, 5};
        String x = Arrays.toString(numbers);
//        System.out.println(x);

        //TODONE:Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person [] persons = new Person[3];
        persons[0] = new Person("Moe");
        persons[1] = new Person("Larry");
        persons[2] = new Person("Curly");

        for (Person person: persons) {
            System.out.println(person.toString());
        }

    }//end psvm
}//end class ArraysExercises
