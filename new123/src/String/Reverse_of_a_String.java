package String;

public class Reverse_of_a_String {
	public static void main(String[] args) {
		String str="Good Friend Is Needed";
		//Good Friend Is Needed
		System.out.println(str);
	   char[] obj=str.toCharArray();
	   
	     //dedeen si dnirf doog
		for(int i=obj.length-1;i>=0;i--)
		{
			System.out.print(obj[i]+" ");
		} 
		System.out.println("..........");
		
		//Good Friend Is Needed*/
		String str5="Good Friend Is Needed";
	StringBuffer buff=new StringBuffer(str5);
	buff.reverse();
	System.out.println(buff);
	
	System.out.println("++++++++++");
	
	//dooG dneirF si dedeeN 
	String str4="Good Friend is Needed";
	String[] str2=str4.split(" ");
	for(int i=0;i<=str2.length-1;i++) 
	{
		StringBuffer buff1=new StringBuffer(str2[i]);
		buff1.reverse();
		System.out.print(buff1+" ");
	}
}
}
