package JavaBasicConcept;

public class User {
	// this for constructor demo
	String name;
	int age;
	char gender;
	boolean isActiveUser;

	public User(String name, int age, char gender, boolean isActiveUser) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isActiveUser = isActiveUser;
	}

	public static void main(String[] args) {
		User us1 = new User("Abhi", 20, 'M', true);
		User us2 = new User("RAM", 25, 'M', false);
		User us3 = new User("Sweta", 24, 'F', false);

		System.out.println(us1.age);
		System.out.println(us2.name);
		System.out.println(us3.isActiveUser);

	}

}
