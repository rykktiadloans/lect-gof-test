package creational.singleton.simplesingleton;

public class SimpleSingletonUsage {

	public static void main(String[] args) {

		SimpleSingleton singleton1 = SimpleSingleton.getInstance();
		SimpleSingleton singleton2 = SimpleSingleton.getInstance();
		System.out.println("singleton1 equals singleton2: " + singleton1.equals(singleton2));

	}

}
