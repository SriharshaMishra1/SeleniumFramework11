package Exception;

public class Arithmetic_Exception {
 public static void main(String[] args) {
	int i=12;
	int j=3;
	int res=0;
	
	try
	{
		res=i+j;
	}
	catch(ArithmeticException Exception)
	{
	System.out.println("ArithematicException Handled");	
	}
	System.out.println(res);
}
 
}
