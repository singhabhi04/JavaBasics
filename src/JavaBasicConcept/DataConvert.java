package JavaBasicConcept;

public class DataConvert {

	public static void main(String[] args) {
		// String to Int
		String s = "100";
		System.out.println(s + 20);
		int i = Integer.parseInt(s);
		System.out.println(i + 20);
		// String to double
		String d = "12.33";

		double f = Double.parseDouble(d);
		System.out.println(f + 20);

		String a = "100A";
		// int j = Integer.parseInt(a);
		// System.out.println(j);// java.lang.NumberFormatException: For input string:
		// "100A"
		// Integer to String
		int m = 20;
		String k = String.valueOf(m);
		System.out.println(k + 20);

	}

}
