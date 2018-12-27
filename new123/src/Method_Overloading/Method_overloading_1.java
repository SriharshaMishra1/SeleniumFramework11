package Method_Overloading;

public class Method_overloading_1 {
	
	void m1(int i)
	{
		System.out.println("int arg method");
	}
	void m1(int  a,int b)
	{
		System.out.println("int,int arg method");
	}
	void m1(char ch)
	{
		System.out.println("char arg method");
	}
	void m1()
	{
		System.out.println("non arg method");
	}
	public static void main(String[] args) {
		Method_overloading_1 obj=new Method_overloading_1();
		obj.m1(7,8);
		obj.m1(7);
		obj.m1('a');
		obj.m1();
	}

}
