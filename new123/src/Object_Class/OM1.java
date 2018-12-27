package Object_Class;

public class OM1 {
	public static void main(String[] args) {
		Student1 st1	=new Student1(56,"munu");
		System.out.println(st1);
		int t=st1.hashCode();
		System.out.println(t);
		System.out.println(st1.hashCode());
	}

}
