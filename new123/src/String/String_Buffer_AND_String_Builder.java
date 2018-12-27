package String;

public class String_Buffer_AND_String_Builder {
	public static void main(String[] args) {
		StringBuffer obj=new StringBuffer("Java is easy");
		/*System.out.println(obj);
		System.out.println("Appender");
		obj.append("gty");
		System.out.println(obj);
		System.out.println("insert t at 5");
		obj.insert(5, 't');
		System.out.println(obj);
		System.out.println("delete char at 4");
		obj.deleteCharAt(4);
		System.out.println(obj);
		System.out.println("delete Developer");
		obj.delete(4, 13);
		System.out.println(obj);*/
		System.out.println("reverse");
		obj.reverse();
		System.out.println(obj);
}
}

