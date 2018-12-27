package Method;

public class nonstatic_method {
	
	void rahul()
	{
		int x=29,y=1;
				
		System.out.println("nonstatic variables are"+" "+(x+y));
	}
	public static void main(String[] args) {
		
		nonstatic_method obj =new nonstatic_method();
		obj.rahul();
	}

}
