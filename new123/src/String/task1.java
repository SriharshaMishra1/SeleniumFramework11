package String;

public class task1 {
	public static void main(String[] args) {
		String str="java is easy";
		System.out.println(str);
		StringBuffer buff=new StringBuffer(str);
		System.out.println(buff);
		String str2=buff.toString();
		String[] str3=str2.split(" ");
		for(int i=str3.length-1;i>=0;i--)
		{
			System.out.print(str3[i]+" ");
		}
}
}
