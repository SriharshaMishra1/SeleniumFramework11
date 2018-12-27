package Method_Overloading;

public class Constructor_overloading {

	Constructor_overloading()
	{
		System.out.println("non arg constructor");
	}
	Constructor_overloading(int i)
	{
		System.out.println("int arg constructor");
	}
	Constructor_overloading(int a,int b)
	{
		System.out.println("int,int arg constructor");
	}
	Constructor_overloading(double d)
	{
		System.out.println("double arg constror");
	}
	public static void main(String[] args) {
		Constructor_overloading obj=new Constructor_overloading();
		new Constructor_overloading(5);
		new Constructor_overloading(4,7);
		new Constructor_overloading(9.7);

		
	}
}
