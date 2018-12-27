package Constructor_Chaining;

public class Super_Statement_non_parameterise_super_statement {
	public static void main(String[] args) {
		Sample5 obj=new Sample5();
		
	}

}

class Sample6  //super class
{
	 Sample6()
	 {
		 super();
		 System.out.println("first constructor");
	 }
}

class Sample5 extends Sample6  //sub class
{
	Sample5()
	{
		super();
		System.out.println("2nd constructor");
	}
}