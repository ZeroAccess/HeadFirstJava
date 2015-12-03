package chapter1;

public class PoolPuzzleOne {

	/**
	 * @param args
	 */
	// I didn't get this had to look at the book I had a close idea but couldn't figure out how to break the while loop
	public static void main(String[] args) {
		int x = 0;
		while ( x < 4 ) {
			System.out.print("a");
			if ( x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if (x > 1 ) {
			System.out.print(" oyster");
			x = x + 2 ;				
			}
			if ( x == 1 ) {
				System.out.print("noys");	
			}
			if (x < 1 ) {
			System.out.print("oise");	
			}
			System.out.println("");
			x = x + 1;
		}
	}
}
