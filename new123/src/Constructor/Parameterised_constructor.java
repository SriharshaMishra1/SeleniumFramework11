package Constructor;

public class Parameterised_constructor {

	Parameterised_constructor(int i,double d)
	{
		i=50;
		d=8.9;
		System.out.println("parameterise value is"+" "+(i+d));
	}
	public void deepu()
	{
		System.out.println("example");
	}
	public static void main(String[] args) {
		Parameterised_constructor obj=new Parameterised_constructor(56,9.9);
		obj.deepu();
	}
}
