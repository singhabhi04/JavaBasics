package JavaBasicConcept;

public class MOLDemo {

	public void m1(double d) {
		System.out.println("Inside Method double");

	}

	public void m1(float f) {
		System.out.println("Inside Method float");

	}

	public static void main(String[] args) {
		// byte-->short-->int/char-->long-->float-->double
		MOLDemo mol = new MOLDemo();
		mol.m1(10.25);
		mol.m1(10.45f);
		mol.m1(10);// automatic promotion in MOL
		mol.m1('c');// automatic promotion in MOL

	}

}
