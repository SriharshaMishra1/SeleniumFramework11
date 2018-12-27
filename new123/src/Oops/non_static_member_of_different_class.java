package Oops;

 class SecondClass {

	int i=3;
	public void deepu()
	{
		System.out.println("india");
	}
}
public class  non_static_member_of_different_class   //main class purbaru public class rahiba otherwise error show kariba
{
	public static void main(String[] args) {
		
		System.out.println("god is grat");
		System.out.println("////////////////////");
		SecondClass obj =new SecondClass();
		obj.deepu();
		System.out.println("***********************");
		System.out.println("i value is"+new SecondClass().i);
		System.out.println(".....................");
		new SecondClass().deepu();
	}
}