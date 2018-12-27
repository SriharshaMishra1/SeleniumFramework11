package Method_Overiding;

public class Method_overiding1 {
	public static void main(String[] args) {
		Child obj=new Child();
		obj.marry();
		
	}
		 
	
}
class Parent
{
	void marry()
	{
		System.out.println("black girl");
	}
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("white girl");
	}
}