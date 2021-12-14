public class Test14Dec {
    public static void main (String[] args) {
//        System.out.println("Hello World");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

//        for (int i = 0; i < 5; i++) {
//            System.out.println(cars[i]);
//        }

        String str = "abcabcabcabc";
        String findStr = "abc";
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(findStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        System.out.println(count);



    }//end main
}//end class
