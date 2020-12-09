
// https://www.w3schools.com/java/java_packages.asp 
// https://www.studytonight.com/java/package-in-java.php

package pack;

// https://www.w3schools.com/java/java_arraylist.asp
import java.util.ArrayList;

// https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;


public class ChangeCapitalization {
    
    //originally input string from user input or file
    ArrayList<String> originalString;

    //current string
    ArrayList<String> currentState;

    //string from previous step
    ArrayList<String> previousStepString;

    //boolean variables that control program's logic
    //for seeing if the user has just started the program
    boolean firstTime;

    //for seeing if the user has a stringToEdit loaded into the
    //corresponding ArrayList
    boolean stringToEditNotLoaded;

    //for seeing if user wants to quit the program
    public boolean quitProgramBool;

    //ChangeCapitalization member variables;
    String userInput;

    //where the file name the user wants to read or edit is stored
    String file;

    // We're getting user input in this program, so we need a Scanner object
    Scanner scanner;



    //default constructor
    public ChangeCapitalization(){

        //initialize member variables
        originalString = new ArrayList<String>();
        currentState = new ArrayList<String>();
        previousStepString = new ArrayList<String>();
        firstTime = true;
        stringToEditNotLoaded = true;
        quitProgramBool = false;
        userInput = "";
        file = " ";
        scanner = new Scanner(System.in);

    }


    public void readFile(String file){

    }

    public void writeFile(String file){

    }


    public void upperCapitalize(){

    }

    public void lowerCapitalize(){

    }

    public void normalCapitalize(){

    }

    public void revertChangesOneStep(){

    }

    public void revertChangesToBeginning(){

    }
    
    public void displayCurrentState(){


    }

    public void displayPrompt(){


        String welcome = "Welcome to the Capitalization Editor!\n";
        String initialPrompt =  "Please choose 1 option by typing the word after the colon:\n" +
                                "Load a file: File\n" +
                                "Input a String: Input\n" + 
                                "Quit Program: Quit\n" +
                                "Input: ";

        String chooseEdit = "Please choose which edit you would like to make:\n" +
                            "Upper Capitalization: Upper\n" +
                            "Lower Capitalization: Lower\n" +
                            "Normal Capitalization: Normal\n" +
                            "Display Current State: Display\n" +
                            "Revert Changes Back One Step: Revert\n" +
                            "Revert Current State to Original State: Original\n" +
                            "Export Current State to File: Export\n" +
                            "Quit Program: Quit\n" +
                            "Input: ";

        String quit = "Thank you. Goodbye.\n";

        

        if (firstTime){
            System.out.print(welcome);
            firstTime = false;
        }

        if (quitProgramBool)
        {
            System.out.println(quit);
            return;
        }
            
        if (stringToEditNotLoaded){
            System.out.print(initialPrompt);
            return;
        }

        if (!stringToEditNotLoaded)
        {
            System.out.println(chooseEdit);
            return;
        }

        

    }

    public void getUserInput(){
        userInput = scanner.nextLine();
        System.out.println("\n");
    }

    public void actOnUserInput(){

        // String initialPrompt =  "Please choose 1 option:\n" +
        //                         "Load a file: File\n" +
        if (userInput.equalsIgnoreCase("File"))
        {
            String file = getFileName();
            readFile(file);

        }
        //                         "Input a String: Input\n" + 
        if (userInput.equalsIgnoreCase("Input"))
        {
            getStringFromUser();
        }
        //                         "Quit Program: Quit\n";

        // https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
        if (userInput.equalsIgnoreCase("Quit"))
        {
            quitProgramBool = true;
        }

        // String chooseEdit = "Please choose which edit you would like to make:\n" +
        //                     "Upper Capitalization: Upper\n" +
        if (userInput.equalsIgnoreCase("Upper"))
        {
            upperCapitalize();
        }
        //                     "Lower Capitalization: Lower\n" +
        if (userInput.equalsIgnoreCase("Lower"))
        {
            lowerCapitalize();
        }
        //                     "Normal Capitalization: Normal\n" +
        if (userInput.equalsIgnoreCase("Normal"))
        {
            normalCapitalize();
        }


        // "Revert Changes Back One Step: Revert\n" +
        if (userInput.equalsIgnoreCase("Revert"))
        {
            normalCapitalize();
        }

        // "Revert Current State to Original State: Original \n" +
        if (userInput.equalsIgnoreCase("Original"))
        {
            normalCapitalize();
        }

        //                     "Display Current State: Display\n" +
        if (userInput.equalsIgnoreCase("Display"))
        {
            displayCurrentState();
        }
        //                     "Export Current State to File: Export\n" +
        if (userInput.equalsIgnoreCase("Export"))
        {
            writeFile(file);
        }
        //                     "Quit Program: Quit\n";
        //already done above^
    }

    public String getFileName(){

        String fileName = "";

        return fileName;
    }

    public void getStringFromUser(){

    }

    public void quitProgram(){

    }



}
