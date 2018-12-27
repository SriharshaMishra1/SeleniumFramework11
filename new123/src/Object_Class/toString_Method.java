package Object_Class;

public class toString_Method {
 public static void main(String[] args) {
	Student s1=new Student();
	String str1=s1.toString();
	System.out.println(s1);//implicitly call
	System.out.println(str1);//explicitly call
}
}
