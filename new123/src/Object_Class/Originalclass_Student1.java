package Object_Class;

public class Originalclass_Student1 {
	
public static void main(String[] args) {
	Student1 s1=new Student1(12,"mama");
	String str=s1.toString();
	System.out.println(s1);
	System.out.println(str);
	
	System.out.println("................");
	Student1 s2=new Student1(21,"baba");
	String str1=s2.toString();
	System.out.println(s2);
	System.out.println(str1);
	
}
}
