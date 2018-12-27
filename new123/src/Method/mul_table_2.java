package Method;

public class mul_table_2 {
	public static void deepu(int num,int till)
	{
		for(int x=1;x<=till;x++)
		{
			int value=num*x;
			System.out.println("mul table2 result is"+value);
		}
	}
public static void main(String[] args) {
	deepu(3,7);
}
}
