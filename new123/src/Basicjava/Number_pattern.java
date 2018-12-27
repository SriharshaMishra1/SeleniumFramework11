package Basicjava;

public class Number_pattern {
	public static void main(String[] args) {
		/*{
			for(int i=1;i<=4;i++)
			{
				for(int j=4;j>=1;j--)
				{
					System.out.print(j);
				}
				System.out.println();
		        }*/
	/*     for(int i=1;i<=4;i++)	
		   {
			for(int j=1;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}*/
		/*	 for(int i=1;i<=4;i++)	
			   {
				for(int j=1;j<=4;j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
	}   */
	/*	for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}   */
		
	/*	for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}      */
		int no=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{       
				no++;
				System.out.print(no+" ");
			}
			System.out.println();
		} 
		
	/*	int k=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
			k=k+1;
			System.out.print(k);
			System.out.println();  */
		
		}
}
