import java.util.Arrays;

public class ArraysExercises {
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //TODONE: Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] array, Person person) {
        Person[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = person;
//        System.out.println(newArray);
        return newArray;

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        //What happens when you run the following code? Why is Arrays.toString necessary?
        //Answer: if you don't use Arrays.toString, it will return the memory location of the variable
        int[] numbers = {1, 2, 3, 4, 5};
        String x = Arrays.toString(numbers);
//        System.out.println(x);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TODONE:Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person [] persons = new Person[3];
        persons[0] = new Person("Moe");
        persons[1] = new Person("Larry");
        persons[2] = new Person("Curly");

        for (Person person: persons) {
//            System.out.println(person.toString());
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println(addPerson(persons, new Person("Derek")));
        String y = Arrays.toString(addPerson(persons, new Person("Derek")));
//        System.out.println(y);
        String z = Arrays.toString(persons);
        System.out.println(z);
    }//end psvm
}//end class ArraysExercises
