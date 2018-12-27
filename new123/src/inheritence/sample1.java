package inheritence;

 class sample11 {
	
	int x=3;
	void deepu()
	{
		System.out.println("deepu in method of sample1");
		
	}

}
class sample2 extends sample11
{
	int y=5;
	void lipu()
	{
		System.out.println("lipu in method of sample2");
	}
}

class sample3 extends sample2
{
	int z=7;
	void papu()
	{
		System.out.println("papu in method of sample3");
	}
}
public class sample1 {

	public static void main(String[] args) {
		sample3 obj=new sample3();
		obj.papu();
		obj.lipu();
		obj.deepu();
		System.out.println("x value is"+obj.x);
		System.out.println("y value is"+obj.y);
		System.out.println("z value is"+obj.z);
	}

}