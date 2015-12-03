package chapter2;

public class DVDPlayerTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		
		if (d.canRecord == true){
			d.recordDVD();
		}

	}

}
