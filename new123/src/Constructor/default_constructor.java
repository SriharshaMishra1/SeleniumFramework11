package Constructor;

class default_constructor {
     // Default Constructor
	
	int x=19;
	default_constructor()
	{
		System.out.println("examples of default constructor");
	}
	
	public void disp() 
	{
		 int a=10;
		int b=20;
		System.out.println("value of a is"+a);
		System.out.println("value of b is"+b);
	}
	public static void main(String[] args) {
		default_constructor obj= new default_constructor();
		obj.disp();
		System.out.println("instance variable is"+obj.x);
	}
			
	}

	


