package chapter1;

public class PhraseOMatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] wordListOne = {"Nonstop", "multi-talented", "sticky", "wall-crawling", "super-strong"};
		String[] wordListTwo = {"invisible", "green", "costumed", "savage", "intelligent"};
		String[] wordListThree = {"man", "woman", "boy", "girl", "alien", "super-hero", "villian"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
				
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		/** 
		System.out.println("wordListone has " + wordListOne.length + " entries.");
		System.out.println("wordListTwo has " + wordListTwo.length + " entries.");
		System.out.println("wordListThree has " + wordListThree.length + " entries.");
		System.out.println("Rand1 is " + rand1);
		System.out.println("Rand2 is " + rand2);
		System.out.println("Rand3 is " + rand3);
		*/
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " "	+ wordListThree[rand3];
		
		System.out.println("What we need is a " + phrase);
	}
}