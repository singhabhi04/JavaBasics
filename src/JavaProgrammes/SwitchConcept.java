package JavaProgrammes;

public class SwitchConcept {

	public static void main(String[] args) {
		// switch cannot hold any values other than int anf String and enum
		// also no special charcter is allowed as case 1,0
		String browser = "chrome";
		System.out.println("*****************");

		// Case 1 :-
		switch (browser) {
		case "chrome":
			System.out.println(" Inside chrome");
			break;
		case "IE":
			System.out.println(" Inside IE");
			break;
		default:
			System.out.println("browser not matched");
			break;

		}
		System.out.println("*****************");

		// Case 2:-
		int value = 10;
		switch (value) {
		case 10:
			System.out.println(" Inside 10");
			break;
		case 20:
			System.out.println(" Inside 20");
			break;
		default:
			System.out.println("Number not matched");
			break;

		}
		System.out.println("*****************");
		// Case 3:-
		int key = 10;
		switch (key) {
		case 10:
			System.out.println(" Inside 10");
			// break;
		case 20:
			System.out.println(" Inside 20");
			// break;
		default:
			System.out.println("Number not matched");
			break;

		}

	}

}
