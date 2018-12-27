package Exception;

public class Arithmetic_Exception_2 {
	 public static void main(String[] args) {
			int i=10;
			int j=0;
			int res=0;
			int[] arr=new int[7];
			try
			{
				System.out.println("before Exception");
				res=i/j;
				System.out.println("After Exception");
			}
			catch(ArithmeticException Exception)
			{
			System.out.println("Arithematic Exception Handled");	
			}
			System.out.println(res);

}
}