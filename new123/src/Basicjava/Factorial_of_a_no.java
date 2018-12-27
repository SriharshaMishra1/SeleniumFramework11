package Basicjava;

public class Factorial_of_a_no {
      // 5!=5*4*3*2*1=120
 public static void main(String[] args) {
	int no=5;
	int fact=1;
	for(int i=1;i<=no;i++)
	{
		 fact=i*fact;
		 System.out.print(fact+" ");
	}
}
}
