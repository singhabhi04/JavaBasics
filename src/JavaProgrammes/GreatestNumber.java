package JavaProgrammes;

public class GreatestNumber {

	public static void main(String[] args) {
		int a = 120;
		int b = 100;
		int c = 610;
		if (a != b & a != c & b != c) {
			if (a > b & a > c) {
				System.out.println("a is biggest Number");
			} else if (b > a & b > c) {
				System.out.println("b is biggest Number");
			} else {
				System.out.println("c is biggest Number");
			}

		} else {
			System.out.println(" a ,b ,c are equal");
		}
	}

}
