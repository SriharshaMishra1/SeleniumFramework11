package Constructor_Chaining;

public class Use_Of_Constructor_Chaing {
	public static void main(String[] args) {
		Sample2 obj =new Sample2();
		
	}

}

class Sample1
{
	Sample1()
	{
		//super statement
		System.out.println("sample1 in first constructor");
	}
}

class Sample2 extends Sample1
{
	Sample2()
	{
		System.out.println("sample2 in 2nd method");
	}
}
