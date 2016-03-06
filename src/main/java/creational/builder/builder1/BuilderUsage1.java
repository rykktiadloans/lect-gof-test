package creational.builder.builder1;

public class BuilderUsage1 {

	public static void main(String[] args) {

		User user = new User.Builder("John", "Tomson").
				withAge(25).
				withPhone("911").
				withAddress("New York").
				build();

		System.out.println(user);

	}

}
