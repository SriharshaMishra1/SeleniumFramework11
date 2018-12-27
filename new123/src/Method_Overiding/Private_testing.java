package Method_Overiding;

class Private_testing {
	void m1()
	{
		System.out.println("parent m1 method");
	}
/*}
class Test2
{
	private void m1()
	{
		System.out.println("child m1 method");
	}  */
public static void main(String[] args) {
	 Private_testing obj=new  Private_testing();
	 obj.m1();
}
}
