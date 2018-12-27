package String;

public class toCharArray {
	public static void main(String[] args) {
		String str="Good Morning Friends";
		System.out.println(str);
		char[] str1=str.toCharArray();
		for(int i=0;i<=str1.length-1;i++)
		{
			System.out.print(str1[i]);
		}
		System.out.println("reverse a String");
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}

}
}

