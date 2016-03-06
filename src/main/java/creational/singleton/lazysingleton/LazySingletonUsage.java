package creational.singleton.lazysingleton;

public class LazySingletonUsage {

	public static void main(String[] args) {

		LazySingleton singleton1 = LazySingleton.getInstance();
		LazySingleton singleton2 = LazySingleton.getInstance();
		System.out.println("singleton1 equals singleton2: " + singleton1.equals(singleton2));

	}

}
