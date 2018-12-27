package Basicjava;

public class no_pyramid2 {
	public static void main(String[] args) {
		int space=4, l=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=l;j++)
			{
				System.out.print("x");
			} 
		
			System.out.println();
			space=space-1;
			l=l+2;
	}

}}
