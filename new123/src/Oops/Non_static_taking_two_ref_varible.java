package Oops;

public class Non_static_taking_two_ref_varible {
	
	int i=20;
	double d=3.3;
	
	public static void main(String[] args) {
		Non_static_taking_two_ref_varible obj= new Non_static_taking_two_ref_varible();
		System.out.println("........................");
		System.out.println("i value is"+obj.i);
		System.out.println("d value is"+obj.d);
		System.out.println("........................");
		Non_static_taking_two_ref_varible obj1= new Non_static_taking_two_ref_varible();
		System.out.println("i value is"+obj1.i);
		System.out.println("d value is"+obj1.d);
		System.out.println("........................");
		obj.i=100;
		obj.d=5.5;
		System.out.println("i value is"+obj.i);
		System.out.println("d value is"+obj.d);
		System.out.println("........................");
		obj1.i=500;
		obj1.d=500.89;
		System.out.println("i value is"+obj1.i);
		System.out.println("d value is"+obj1.d);
		
		
	}

}
