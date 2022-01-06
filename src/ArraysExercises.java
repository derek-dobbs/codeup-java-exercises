import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        //What happens when you run the following code? Why is Arrays.toString necessary?
        //Answer: if you don't use Arrays.toString, it will return the memory location of the variable
        int[] numbers = {1, 2, 3, 4, 5};
        String x = Arrays.toString(numbers);
//        System.out.println(x);

    }//end psvm
}//end class ArraysExercises
