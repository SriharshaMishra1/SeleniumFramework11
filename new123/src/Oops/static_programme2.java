package Oops;

public class static_programme2 {
	
	static int i=100;//static variable
	public static void deepu()//static method
	{
		System.out.println("Qsp");
	}
	public static void main(String[] args) {
		
		deepu();
		 static_programme2.deepu();//calling statement
		 System.out.println("i value is testing for"+" "+i);//directly call static variable
		 System.out.println("i value using method formulla"+" "+ static_programme2.i);//static variable call by syntax
	}

}
