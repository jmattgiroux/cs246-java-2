
//https://www.w3schools.com/java/java_packages.asp 

//package java_2;

//https://www.w3schools.com/java/java_arraylist.asp
import java.util.ArrayList;


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
    boolean quitProgramBool;

    //ChangeCapitalization member variables;
    String userInput;

    //where the file name the user wants to read or edit is stored
    String file;



    //default constructor
    ChangeCapitalization(){

        //initialize member variables
        originalString = new ArrayList<String>();
        currentState = new ArrayList<String>();
        previousStepString = new ArrayList<String>();
        firstTime = true;
        stringToEditNotLoaded = true;
        quitProgramBool = false;
        userInput = "";
        file = " ";

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
        String initialPrompt =  "Please choose 1 option:\n" +
                                "Load a file: F\n" +
                                "Input a String: I\n" + 
                                "Quit Program: Q\n";

        String chooseEdit = "Please choose which edit you would like to make:\n" +
                            "Upper Capitalization: U\n" +
                            "Lower Capitalization: L\n" +
                            "Normal Capitalization: N\n" +
                            "Display Current State: D\n" +
                            "Revert Changes Back One Step: R\n" +
                            "Revert Current State to Original State: O\n" +
                            "Export Current State to File: E\n" +
                            "Quit Program: Q\n";

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
            stringToEditNotLoaded = false;
            return;
        }

        if (!stringToEditNotLoaded)
        {
            System.out.println(chooseEdit);
            return;
        }

        

    }

    public void getUserInput(){

        
    }

    public void actOnUserInput(){

        // String initialPrompt =  "Please choose 1 option:\n" +
        //                         "Load a file: F\n" +
        if (userInput == "F")
        {
            String file = getFileName();
            readFile(file);

        }
        //                         "Input a String: I\n" + 
        if (userInput == "I")
        {
            getStringFromUser();
        }
        //                         "Quit Program: Q\n";
        if (userInput == "Q")
        {
            quitProgram();
        }

        // String chooseEdit = "Please choose which edit you would like to make:\n" +
        //                     "Upper Capitalization: U\n" +
        if (userInput == "U")
        {
            upperCapitalize();
        }
        //                     "Lower Capitalization: L\n" +
        if (userInput == "L")
        {
            lowerCapitalize();
        }
        //                     "Normal Capitalization: N\n" +
        if (userInput == "N")
        {
            normalCapitalize();
        }


        // "Revert Changes Back One Step: R\n" +
        if (userInput == "R")
        {
            normalCapitalize();
        }

        // "Revert Current State to Original State: O \n" +
        if (userInput == "O")
        {
            normalCapitalize();
        }

        //                     "Display Current State: D\n" +
        if (userInput == "D")
        {
            displayCurrentState();
        }
        //                     "Export Current State to File: E\n" +
        if (userInput == "E")
        {
            writeFile(file);
        }
        //                     "Quit Program: Q\n";
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
