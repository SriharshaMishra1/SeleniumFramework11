package String;

public class EqualsIgnoranceCase {
public static void main(String[] args) {
	String str1="Java";
	String str2="jaVa";
	System.out.println(str1==str2);
	System.out.println(str1.equalsIgnoreCase(str2));
}
}
