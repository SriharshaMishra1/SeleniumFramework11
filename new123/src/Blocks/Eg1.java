package Blocks;

public class Eg1 {
	public static void main(String[] args) {
		{
			System.out.println("main method");
		}
		//new Eg1();
		new Eg1();
	}
	Eg1()
	{
		System.out.println("constructor");
	}
	static
	{
		System.out.println("static block in Eg1");
	}
	{
		System.out.println("nonstatic block in Eg1");
	}

}          

