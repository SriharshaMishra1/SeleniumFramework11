package Basicjava;

public class Prime_no_of_1_to_100 
{
	public static void main(String[] args) {
		{
			for(int i=1;i<=100;i++)
			{
				boolean flag=true;
				for(int j=2;j<=i-1;j++)
				{
					if(i%j==0)
					{
						flag =false;
						break;
					}
				}
				if(flag==true)
				{
					System.out.print(i);
					System.out.print("\t");
					
				}
			}
		}
	}

}
