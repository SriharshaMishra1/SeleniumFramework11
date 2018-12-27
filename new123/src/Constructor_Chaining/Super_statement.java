package Constructor_Chaining;

public class Super_statement {
	public static void main(String[] args) {
		//Test1 obj=new Test1();
		Test2 obj1=new Test2();
	}

}

class Test1
{
	Test1()
	{
	//	super();
		System.out.println("1st constructor");
	}
}
class Test2 extends Test1
{
	
	Test2()
	{
		super();
		System.out.println("2nd constructor");
	}
}