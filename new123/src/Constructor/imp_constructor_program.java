package Constructor;

class imp_constructor_program {
	int i=100;
	 imp_constructor_program()
	 {
		 int i=200;
		 System.out.println("i value is"+i);
		 System.out.println("instance varaible is"+this.i);
	 }
public static void main(String[] args) {  
	 imp_constructor_program obj=new  imp_constructor_program();
	 
}
}
