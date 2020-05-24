package JavaBasicConcept;

public class MethodOverLoading {
	// within same class we can have different methods with same names but
	// parameters needs to be different(MOL)
	// 1.number of parameter need to be different
	// 2. data type o parameters needs to be different
	// 3.Sequence of parameter needs o be different

	public void login(String UserName, String Password) {
		System.out.println("Login using User Name and Password");
	}

	public void login(int OTP) {
		System.out.println("Login using OTP");

	}

	public void login(String EmailID) {
		System.out.println("Login using Email");

	}

	public static void main(String[] args) {
		MethodOverLoading mol = new MethodOverLoading();
		mol.login(1065);
		mol.login("Abhi", "Test@123");
		mol.login("test@test.com");
	}

}
