package Oops;

public class Reassigning_staic_variable_synax {
	
	public static int i;//initialize static int variable
	public static double d;//initialize static double variable
	public static void deepu() // static method
	{
		System.out.println("default");
	}
	public static void main(String[] args) {
		
		Reassigning_staic_variable_synax.deepu();
		System.out.println(Reassigning_staic_variable_synax.i);
		
		Reassigning_staic_variable_synax.i=4;
		System.out.println(Reassigning_staic_variable_synax.i);
		Reassigning_staic_variable_synax.d=4.6;
		System.out.println(Reassigning_staic_variable_synax.d);
		
	}

}
