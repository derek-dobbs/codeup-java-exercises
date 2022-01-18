package testAndPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAndPracticeMain {
    public static void main(String[] args) throws IOException {
        /////Example from curriculum/////
//        String directory = "data";
//        String filename = "info.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }
//
//        if (! Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//        }
        /////End Example from curriculum/////

        /////Modified Example from FileIO Walk Through/////
        String directory = "testDirectory17JAN";
        String filename = "fenderGuitarModels.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

//        System.out.println(dataDirectory);
//        System.out.println(dataFile);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectory(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            if (Files.exists(dataFile)) {
                Files.write(dataFile, Arrays.asList("Telecaster"));
//                Files.write(dataFile, Arrays.asList("Overwritten - Telecaster"));
                Files.write(dataFile, Arrays.asList("Stratocaster", "Jazzmaster"), StandardOpenOption.APPEND);
                Files.write(dataFile, Arrays.asList("Jaguar", "Strat HM"), StandardOpenOption.APPEND);
                Files.write(dataFile, Arrays.asList("//////////////////////////////"), StandardOpenOption.APPEND);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> guitars = Files.readAllLines(dataFile);
//            System.out.println(guitars);
            for(String guitar : guitars) {
                System.out.println(guitar);
            }

//            List<String> guitarBucket = new ArrayList<>();
//
//            for (String guitar : guitars) {
//                if (guitar.equals("Telecaster")) {
//                    guitarBucket.add("Replaced - Telecaster");
//                    continue;
//                }
//                guitarBucket.add(guitar);
//            }
//
//            Files.write(dataFile, guitarBucket);

            guitars.remove("Replaced - Telecaster");
            guitars.add(0, "Telecaster");
        }catch (IOException e) {
            e.printStackTrace();
        }


        /////End Modified Example from FileIO Walk Through/////
    }//end psvm
}// end class TestAndPracticeMain
