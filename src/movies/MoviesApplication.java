//package movies;
//import util.Input;
//import java.util.Arrays;
//import java.util.Scanner;
//
//import java.util.Scanner;
//
//public class MoviesApplication {
//    private static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        boolean userConfirm = true;
//        MoviesArray movie = new MoviesArray();
//        Movie[] movies = movie.findAll();
//
//        do {
//            System.out.println("What would you like to do?");
//            System.out.println();
//            System.out.println("0 - exit");
//            System.out.println("1 - view all movies");
//            System.out.println("2 - view movies in the animated category");
//            System.out.println("3 - view movies in the drama category");
//            System.out.println("4 - view movies in the horror category");
//            System.out.println("5 - view movies in the scifi category");
//            System.out.println();
//            System.out.print("Enter your choice: ");
//
//            int userInt = sc.nextInt();
//
//            switch (userInt) {
//                case 0:
//                    System.out.println("Goodbye");
//                    userConfirm = false;
//                    break;
//                case 1:
//                    for (int i = 0; i < movies.length; i++) {
//                        System.out.println(movies[i].getName());
//                    }
//                    break;
//                case 2:
//                    for (int i = 0; i < movies.length; i++) {
//                        if (movies[i].getCategory() == "animated") {
//                            System.out.println(movies[i].getName());
//                        }
//                    }
//                    break;
//                case 3:
//                    for (int i = 0; i < movies.length; i++) {
//                        if (movies[i].getCategory() == "drama") {
//                            System.out.println(movies[i].getName());
//                        }
//
//                    }
//                    break;
//                case 4:
//                    for (int i = 0; i < movies.length; i++) {
//                        if (movies[i].getCategory() == "horror") {
//                            System.out.println(movies[i].getName());
//                        }
//
//                    }
//                    break;
//                case 5:
//                    for (int i = 0; i < movies.length; i++) {
//                        if (movies[i].getCategory() == "scifi") {
//                            System.out.println(movies[i].getName());
//                        }
//                    }
//                    break;
//                default:
//                    System.out.println("Invalid entry, please try again");
//            }
//        }while (userConfirm);
//    }//end psvm
//}//end class MoviesApplication
