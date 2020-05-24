package JavaBasicConcept;
import java.util.ArrayList;

public class StringDemo {

	public ArrayList<String> getStudentData(String Data) {
		ArrayList<String> al = new ArrayList<String>();
		String[] data = Data.split("_");
		System.out.println(data.length);

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			al.add(data[i]);
		}
		return al;

	}

	public static void main(String[] args) {
		ArrayList<String> Arraylist = new ArrayList<String>();
		String StudentData = "Ram_34_Kolkata_Test@gmail.com";
		StringDemo str = new StringDemo();
		Arraylist = str.getStudentData(StudentData);
		System.out.println(Arraylist);

	}
}
