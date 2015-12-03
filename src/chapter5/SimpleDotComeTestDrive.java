package chapter5;

public class SimpleDotComeTestDrive {

	public static void main(String[] args) {
		
		int numOfGuesses = 0; //make a variable to track how many guesses the user makes
		
		GameHelper helper = new GameHelper(); //this is a special class we wrote that has the method for getting user 
											  //input for now, pretend it's part of Java
		
		SimpleDotCom theDotCom = new SimpleDotCom(); //make the dot com Object
		
		int randomNum = (int) (Math.random() * 5); //make a random number for the first cell, and use it to make the 
												   //cell locations array
		
		 int[] locations = {randomNum, randomNum +1, randomNum +2};  
		
		theDotCom.setLocationCells(locations); //give the dot com its locations (the array)
		
		boolean isAlive = true; //make a boolean variable to track whether the game is still alive, to use in the while loop test
								
		while(isAlive == true) { //repeat while game is still active
			String guess = helper.getUserInput("enter a number"); // get user input String
			String result = theDotCom.checkYourself(guess); //ask the dot com to check the guess; save the returned result in a string
			
			numOfGuesses++; //increment the guess count
			
			if (result.equals("kill")) // was it a "kill"? if so, set isAlive to false (so we won't re-enter the loop) and print user guess count
				isAlive = false;
			System.out.println("You took " +numOfGuesses + " guesses");
		}
		
	}

}
