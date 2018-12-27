package Method;

public class Factorial_of_a_no_using_calling_method {
	
	public static void deepu()
	{
		int no=5;
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			
			fact=fact*i;
			System.out.print(" "+fact+"");
		}
	}
	
	public static void main(String[] args) {
		deepu();
	}

}
