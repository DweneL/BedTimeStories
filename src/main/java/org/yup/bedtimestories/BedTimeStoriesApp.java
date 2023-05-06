package org.yup.bedtimestories;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
public class BedTimeStoriesApp {

    public static void main(String[] args) {

        System.out.println("Which Bedtime Story would you like to read? ");
        System.out.println("Apply the corresponding number");
        System.out.println("1. Goldilocks");
        System.out.println("3. Hansel and Gretel");
        System.out.println("6. Mary had a Little Lamb ");
        Scanner theScanner = new Scanner(System.in);
        int userChoice = theScanner.nextInt();

        String theFileWeWantToWorkWith = "";

        switch (userChoice) {

            case 1:
                theFileWeWantToWorkWith = "goldilocks.txt";
                break;
            case 3:
                theFileWeWantToWorkWith = "hansel_and_gretel.txt";
                break;
            case 6:
                theFileWeWantToWorkWith = "mary_had_a_little_lamb.txt";
                break;


        }


        try {


                FileInputStream theFileFromTheHDD = new FileInputStream (theFileWeWantToWorkWith);

                Scanner myScanner = new Scanner(theFileFromTheHDD);


                while (myScanner.hasNextLine()) {


                    System.out.println(myScanner.nextLine());

                }
                myScanner.close();

            }catch(IOException e){
                System.out.println("Sorry but we could not find that file in the computer");
                e.printStackTrace();

            }
        }


    }







