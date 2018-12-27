package Basicjava;

public class Student_eg 
{
	public static void main(String[] args) 
	{
		int id;//variable declaration
		char ch;
		String str;
		double d;
		final int id1 =30;//Initialization
		id=22;//re-assign
		final int id5=89;//final keyword using we didn't re-assign the value if we want to
		                                                //change then compiler showing error
		ch='A';
		str="ram";
		str="sriharsha";//re-assign
		d=89.76;
		System.out.println("id is"+id);
		System.out.println("id is"+" "+id5+" and "+id1);
		System.out.println("name is"+" "+str);
		System.out.println("mark"+d);
		System.out.println("grade is"+ch);
	}

}
