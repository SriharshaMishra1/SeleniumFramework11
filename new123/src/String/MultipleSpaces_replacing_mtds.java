package String;

public class MultipleSpaces_replacing_mtds {
	public static void main(String[] args) {
		String str="   Java   is   Beautiful  ";
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.trim().replaceAll("\\s+"," "));
}
}

