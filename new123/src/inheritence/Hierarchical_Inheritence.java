package inheritence;

public class Hierarchical_Inheritence {
	public static void main(String[] args) {
		
		 Test2 obj1=new Test2();
		 Test3 obj2=new Test3();
		 obj1.disp();
		 obj1.add();
		 obj2.mul();
	}
	
}
      class Test1
      {
	int x=10,y=5;
	void disp()
	{
		System.out.println("Disp Method  in ");
		System.out.println("x value is"+x);
		System.out.println("y value is"+y);
	}
}
class Test2 extends Test1
{
	void add()
	{
		System.out.println("method of clss 2");
		System.out.println("addition is"+(x+y));
	}
}

class Test3 extends Test1
{
	
	void mul()
	{
		System.out.println("mul method in test3");
		System.out.println("mul is"+(x*y));
	}
}