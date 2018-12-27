package Basicjava;

public class Local_variable {
	// int i=12;//instance variable
	//non static
	void deepu()
	{
		int x=8;
		x=43;
		System.out.println("x value is"+x);
	}
	public static void main(String[] args) {
		Local_variable obj	=new Local_variable();
		obj.deepu();
		// System.out.println(obj.i);
	}

}
