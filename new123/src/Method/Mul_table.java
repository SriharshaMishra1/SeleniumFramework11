package Method;

public class Mul_table {
	
	public static void deepu(int num,int till)
	{     
		num=2;
		 till=5;
		for(int a=1;a<=till;a++)
		{
			
			int val=num*a;
			System.out.println("mul_table value is"+val);
		}
		
	}
	public static void main(String[] args) {
		deepu(2,3);
	}

}
