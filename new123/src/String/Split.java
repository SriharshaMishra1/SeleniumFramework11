package String;

public class Split {
	public static void main(String[] args) {
		String str="Good Morning Friends";
		System.out.println(str);
	String[] s1=str.split(" ");
	for(int i=0;i<=s1.length-1;i++)
	{
		System.out.println(s1[i]);
	}

}
}
