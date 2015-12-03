package chapter4;

public class DogTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog one = new Dog();
		one.size = 90;
		Dog two = new Dog();
		two.size = 8;
		Dog three = new Dog();
		three.size = 35;
	one.bark(3);
	two.bark(1);
	three.bark(0);

}
}
