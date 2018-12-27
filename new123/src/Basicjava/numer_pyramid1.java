package Basicjava;

public class numer_pyramid1 {
	public static void main(String[] args) {
		int space=3,value=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("-");
			}
			for(int k=1;k<=value;k++)
			{
				System.out.print(value);
			}
			System.out.println();
			value=value+2;
			space=space-1;
		}
	}

}
