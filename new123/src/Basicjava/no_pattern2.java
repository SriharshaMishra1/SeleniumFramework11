package Basicjava;

public class no_pattern2 {
	public static void main(String[] args) {
		int no=3, space=0,value=5;
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(space);
			}

			for(int k=1;k<=value;k++)
			{
				System.out.print(value);
			}
			System.out.println();
			space=space+1;
			value=value-2;
	}
	}
}


