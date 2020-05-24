package JavaBasicConcept;

public class Employee {

	String Name;
	int Age;
	char Sex;
	int EmpID;

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.Name = "Abhishek";
		e1.Age = 25;
		e1.Sex = 'M';
		e1.EmpID = 1025013;
		System.out.println("Employee Name is : " + e1.Name + " and EmpID is : " + e1.EmpID);

		Employee e2 = new Employee();
		e2.Name = "Anil";
		e2.Age = 30;
		e2.Sex = 'M';
		e2.EmpID = 765507;
		System.out.println("Employee Name is : " + e2.Name + " and EmpID is : " + e2.EmpID);

		e1 = e2;// now e1 will be reference to e2
		System.out.println("Employee Name is : " + e1.Name + " and EmpID is : " + e1.EmpID);
		System.out.println("Employee Name is : " + e2.Name + " and EmpID is : " + e2.EmpID);
		Employee e3 = e1;
		System.out.println("Employee Name is : " + e3.Name + " and EmpID is : " + e3.EmpID);

	}

}
