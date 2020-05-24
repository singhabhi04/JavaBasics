package JavaBasicConcept;

public class StaticAndNonStaticConcept {
	// Static variables and methods are stored in Stack memory
	String Name;
	int EmpID;
	static String CollegeName = "NSEC";

	public void getEmpDetails() {
		System.out.println("1025013");
		System.out.println(CollegeName);
	}

	public static void getCollegeName() {
		System.out.println(CollegeName);
		// System.out.println(EmpID);
		// Cannot make a static reference to the non-static field EmpID

	}

	public static void main(String[] args) {
		// 1.Accessing Static by calling variable and method name directly
		System.out.println(CollegeName);
		getCollegeName();
		// 2.by className
		System.out.println(StaticAndNonStaticConcept.CollegeName);

		StaticAndNonStaticConcept.getCollegeName();

		//
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.Name = "Abhishek";
		obj.EmpID = 1025013;
		System.out.println(obj.EmpID);
		obj.CollegeName = "BIT";
		System.out.println(obj.CollegeName);
		System.out.println(StaticAndNonStaticConcept.CollegeName);
		obj.getEmpDetails();

	}

}
