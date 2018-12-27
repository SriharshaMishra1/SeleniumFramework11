package Object_Class;

public class OM3 {
public static void main(String[] args) {
	String d1=new String("java");
	String d2=new String("java");
	String d3=d1;
	
	
	System.out.println(d1);
	System.out.println(d2);
	System.out.println("............");
	System.out.println(d1.hashCode());
	System.out.println(d2.hashCode());
	
	System.out.println("...........");
	System.out.println(d1.equals(d2));
	System.out.println(d1==(d2));
	
	System.out.println(d1==(d3));
}
}
