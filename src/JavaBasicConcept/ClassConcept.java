package JavaBasicConcept;

public class ClassConcept {
	public int a = 100;

	public void m1() {
		System.out.println("Demo method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassConcept cc = new ClassConcept();
		System.out.println(cc.a);
		cc.m1();

		ClassConcept cc1 = cc;
		System.out.println(cc1.a);
		cc1.m1();
		ClassConcept CC2 = new ClassConcept();

		cc = CC2;
		System.out.println(CC2.a);
	}

}
