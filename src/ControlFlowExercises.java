public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
//            System.out.print(i + " ");
            i++;
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        int j = 100;
        do {
            if(j % 5 == 0) {
//                System.out.println(j);
            }
            j--;
        }while(j >= -10);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        long l = 2;
        do {
            System.out.println(l);
            l *= l;
        }while (l < 1000000);
    }//end main
}// end class
