package Basicjava;

public class fibonacy_series {
	
	// adding of first and second element result of third is the sum of 
	// two elements results
	public static void main(String[] args) {
		int count=10,n3,n2=1,n1=0;
		 System.out.print(n1+"\t "+n2);
		for(int i=2;i<=count;i++)
		{
			n3=n1+n2;
		
			n1=n2;
			n2=n3;
			System.out.print(" \t"+n3+"\t");
		}
	}

}
