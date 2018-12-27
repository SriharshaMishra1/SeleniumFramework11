package Blocks;

import java.util.Arrays;

public class Eg2 {
public static void main(String[] args) {
	int[] arr= {20,40,50,70,90};
	System.out.println("before deletion"+Arrays.toString(arr));
	
	int ele=50;
	int index=2;
	int[] arr1=new int[arr.length-1];
	for(int i=0;i<=arr1.length-1;i++)
	{
		if(i<index)
		{
			arr1[i]=arr[i];
		}
		else if(i>index)
		{
			arr1[i]=arr[i+1];
		}
		else
		{
			arr1[i]=ele;
		}
	}
	System.out.println("after deletion"+Arrays.toString(arr1));
}
}
