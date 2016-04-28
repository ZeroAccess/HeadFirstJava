package chapter6;

import java.util.ArrayList;

/**
 * Created by robertsg on 4/27/2016.
 */
public class DotComBust {
    //declare and initialize the variables we'll need
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public static void main(String[] args) {
        //create the game object
        DotComBust game = new DotComBust();
        //tell the game object to set up the game
        game.setUpGame();
        //tell the game object to start the main game play loop
        game.startPlaying();
    }

    public void setUpGame() {
        //make three DotCom objects, give'em names, and stick'em in the ArrayList
        DotCom one = new DotCom("Pets.com");
        DotCom two = new DotCom("eToys.com");
        DotCom three = new DotCom("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        //print brief instructions
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("They are: " + one.getName() + ", " + two.getName() + ", and " + three.getName());
        System.out.println("Try and sink them with the fewest amount of guesses");

        //repeat with all DotComs in the list
        for(DotCom dotComToSet : dotComsList) {
            //ask the helper for a DotCom location
            ArrayList<String> newLocation = helper.placeDotCom(3);
            //call the setter method on this DotCom to give it the location you just got from the helper
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        //as long as the DotCom list is NOT empty
        while(!dotComsList.isEmpty()) {
            //get user input
            String userGuess = helper.getUserInput("Enter a guess");
            //call our own checkUserGuess method
            checkUserGuess(userGuess);
        }
        //call our own finishGame method
        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        //increment the number of guesses the user has made
        numOfGuesses++;
        //assume it's a 'miss', unless told otherwise
        String result = "miss";

        //repeat with all DotComs in the list
        for(DotCom dotComToTest : dotComsList) {
            //ask the DotCom to check the user guess, looking for a hit(or kill)
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")) {
                //get out of the loop early, no point in testing the others
                break;
            }
            if(result.equals("kill")) {
                //this guy's dead, so take him out of the DotComs list then get out of the loop
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        //print the result for the user
        System.out.println(result);
    }

    public void finishGame() {
        //print a message telling the user how he did in the game
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if(numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
}
