
// https://www.w3schools.com/java/java_packages.asp 
// https://www.studytonight.com/java/package-in-java.php

package pack;

// https://www.w3schools.com/java/java_arraylist.asp
import java.util.ArrayList;

// https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;

// https://beginnersbook.com/2015/05/java-string-to-arraylist-conversion/
import java.util.Arrays;
import java.util.List;


public class ChangeCapitalization {
    
    //originally input string from user input or file
    ArrayList<String> originalString;

    //current string
    ArrayList<String> currentState;

    //string from previous step
    ArrayList<String> previousState;

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
        previousState = new ArrayList<String>();
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

        //save currentState to previousState
        previousState = new ArrayList<String>(currentState);

        for (int i = 0; i < currentState.size() ; i++)
        {
            currentState.set(i, currentState.get(i).toUpperCase());
        }
        displayCurrentState();

    }

    public void lowerCapitalize(){

        //save currentState to previousState
        previousState = new ArrayList<String>(currentState);

        for (int i = 0; i < currentState.size() ; i++)
        {
            currentState.set(i, currentState.get(i).toLowerCase());
        }
        displayCurrentState();
    }

    public void normalCapitalize(){

    }

    public void revertChangesToPreviousStep(){

        ArrayList<String> arrayList = new ArrayList<String>();

        // shuffle states around; works
        arrayList = new ArrayList<String>(currentState);
        currentState = new ArrayList<String>(previousState);
        previousState = new ArrayList<String>(arrayList);

        displayCurrentState();
    }

    public void revertChangesToBeginning(){
        currentState = new ArrayList<String>(originalString);
        displayCurrentState();
    }
    
    public void displayCurrentState(){

        for (int i = 0; i < currentState.size() ; i++)
        {
            if (i != 0 && i != currentState.size())
                System.out.print(" ");
            System.out.print(currentState.get(i));
        }
        System.out.print("\n\n");

    }

    public void displayPrompt(){


        String welcome = "Welcome to the Capitalization Editor!\n";
        String initialPrompt =  "Please choose 1 option by typing the word after the colon:\n" +
                                // "Load a file: File\n" +
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
                            // "Export Current State to File: Export\n" +
                            "Quit Program: Quit\n" +
                            "Input: ";

        String quit = "Thank you. Goodbye.\n";

        

        if (firstTime){
            System.out.print(welcome);
            firstTime = false;
        }

        if (quitProgramBool)
        {
            System.out.print(quit);
            return;
        }
            
        if (stringToEditNotLoaded){
            System.out.print(initialPrompt);
            return;
        }

        if (!stringToEditNotLoaded)
        {
            System.out.print(chooseEdit);
            return;
        }

        

    }

    public void getUserInput(){
        userInput = scanner.nextLine();
        System.out.print("\n");
    }

    public void actOnUserInput(){

        // String initialPrompt =  "Please choose 1 option:\n" +
        //                         "Load a file: File\n" +
        if (userInput.equalsIgnoreCase("File"))
        {
            System.out.println("Sorry, file functionality is not yet present\n\n");
            // String file = getFileName();
            // readFile(file);
            // stringToEditNotLoaded = false;

        }
        //                         "Input a String: Input\n" + 
        if (userInput.equalsIgnoreCase("Input"))
        {
            getStringFromUser();
            stringToEditNotLoaded = false;
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


        // "Revert to Previous State: Revert\n" +
        if (userInput.equalsIgnoreCase("Revert"))
        {
            revertChangesToPreviousStep();
        }

        // "Revert Current State to Original State: Original \n" +
        if (userInput.equalsIgnoreCase("Original"))
        {
            revertChangesToBeginning();
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


        System.out.println("Please input your string: \n");

        // https://www.geeksforgeeks.org/difference-between-next-and-nextline-methods-in-java/
        String string = scanner.nextLine();

        System.out.print("\n");

       

        // https://beginnersbook.com/2015/05/java-string-to-arraylist-conversion/
        String str[] = string.split(" ");
        List<String> list = new ArrayList<String>();
        list = Arrays.asList(str);


        // https://stackoverflow.com/questions/5134466/how-to-cast-arraylist-from-list/41136009
        originalString = new ArrayList<String>(list);

        currentState = new ArrayList<String>(list);

        previousState = new ArrayList<String>(list);


        
    }




}
