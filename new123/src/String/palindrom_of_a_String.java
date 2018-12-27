package String;

public class palindrom_of_a_String {
public static void main(String[] args) {
	String str="madam";
			StringBuffer buff=new StringBuffer(str);
			buff.reverse();
			String str1=buff.toString();
			if(str1.equals(str))
			{
				System.out.println("pallindrom");
			}
			else
			{
				System.out.println("Not pallindrom");
			}
}
}
