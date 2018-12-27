package Method;

public class nonstatic_static_combo {
	
	void rahul()
	{  
		int b=1;
		int f=2;
		System.out.println("non static addings are"+(b+f));
	}
	 private static void sriharsha()
	{
		 int g=7;
		 int f=6;
		 System.out.println("static variables adding are"+(g+f));
		
	}
	 public static void main(String[] args) {
		 nonstatic_static_combo obj1=new nonstatic_static_combo();
		obj1.rahul();
		 
		nonstatic_static_combo.sriharsha();
	}

}
