package Oops;

public class sudip_nonstatic_with_nonstatic_variable_declaration_program {
	int i=10;   //non-static variable OR instance variable
	void disp()//   non-static method
	{
		System.out.println("studing");
	}
	public static void main(String[] args) {
		
		 sudip_nonstatic_with_nonstatic_variable_declaration_program obj =new   sudip_nonstatic_with_nonstatic_variable_declaration_program();
		 obj.disp();
		System.out.println(obj.i);
	
		
	}

}
