package Oops;

public class static_method_returntype_double {

	static double x=30.7;//static variable
	public static void deepu()//static method
	{
		System.out.println("using double data type");
	}
	public static void main(String[] args) {
		deepu();//calling statement
		 static_method_returntype_double.deepu();//static variable call by syntax
		 System.out.println(x);//directly call static variable
	}
}
