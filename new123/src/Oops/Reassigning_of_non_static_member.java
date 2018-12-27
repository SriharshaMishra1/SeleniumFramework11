package Oops;

 class sample3 {
	int i=20;
	double d=3.3;
}
	public class Reassigning_of_non_static_member
	{
public static void main(String[] args) {
	System.out.println("..................");
	System.out.println("i value is"+new sample3().i);
	System.out.println("d value is"+new sample3().d);
	System.out.println("....................");
	//System.out.println(new sample3().i=100); 
	 new sample3().i=100;
	 new sample3().d=4.5;
	System.out.println("i value is"+new sample3().i);
	System.out.println("d value is"+new sample3().d);
}
}
