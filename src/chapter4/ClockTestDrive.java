package chapter4;

public class ClockTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Clock c = new Clock();
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);

	}

}
