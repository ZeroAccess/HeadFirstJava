package chapter3;

public class BooksTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		int x = 0;
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		
		myBooks[0].title = "The Grapes of Java";
	    myBooks[1].title = "The Java Gatsby";
	    myBooks[2].title = "The Java Cookbook";
	    myBooks[0].author = "sue";
	    myBooks[1].author = "bob";
	    myBooks[2].author = "ian";

	    while (x < 3) {
	    	System.out.print(myBooks[x].title);
	    	System.out.print(" by ");
	    	System.out.println(myBooks[x].author);
	    	x = x + 1;
	    }
	}
}
