package String;

public class Recursion {
	static String str="";
	static int i=0;
	public static void main(String[] args) {
		String jp="java";
		recurce(jp);
		System.out.println(str);
	}
	private static void recurce(String m) {
		if(i<m.length())
		{
			str=m.charAt(i)+str;
			i++;
			recurce(m);
		}
	
		
	}

}
