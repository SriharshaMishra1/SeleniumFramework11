package Basicjava;

public class Reverse_Digits_in_a_no {
	public static void main(String[] args) {
	int num=342;
	while(num>0)
	{
		int rem=num%10;
		System.out.println(rem);
		num=num/10;
	}
	
	}

}
