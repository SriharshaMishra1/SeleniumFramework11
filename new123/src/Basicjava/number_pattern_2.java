package Basicjava;

public class number_pattern_2 {
public static void main(String[] args) {

	for(int i=4;i>=1;i--)
	{
		for(int j=i;j>1;j--)
		{
			System.out.print("  ");
		}
		for(int k=i;k<=4;k++)
		{
			System.out.print(" "+k);
		}
		System.out.println();
}
}
}
