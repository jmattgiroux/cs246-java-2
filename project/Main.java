
import pack.ChangeCapitalization;

public class Main {

    

    public static void main(String[] args) {
        ChangeCapitalization editor = new ChangeCapitalization();
        
        while(!editor.quitProgramBool)
        {
            editor.displayPrompt();
            editor.getUserInput();
            editor.actOnUserInput();
        }
        // This last call of displayPrompt basically says bye to the user
        editor.displayPrompt();
    }
    

}

