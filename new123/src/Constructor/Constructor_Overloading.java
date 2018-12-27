package Constructor;

public class Constructor_Overloading {

	void deepu()
	{
		System.out.println("default");
	}
	void deepu(int a)
	{
		System.out.println("int arg");
	}
	void deepu(int t,int r)
	{
		System.out.println("double int arg");
	}
	
	void deepu(double b,double d)
	{
		System.out.println("double double arg ");
	}
	
	void deepu(int e,double d)
	{
		System.out.println("int arg,double arg ");
	}
	void deepu(double c,int s)
	{
		System.out.println("double arg,int arg");
	}
	public static void main(String[] args) {
		Constructor_Overloading obj=new Constructor_Overloading();
		obj.deepu();
		obj.deepu(7);
		obj.deepu(7,8);
		obj.deepu(6.7,4.6);
		obj.deepu(7,8.9);
		obj.deepu(5.7,5);
	}
}
