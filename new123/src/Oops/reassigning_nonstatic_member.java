package Oops;

public class reassigning_nonstatic_member {
  int i=3;
  
  public static void main(String[] args) {
	  reassigning_nonstatic_member obj=new reassigning_nonstatic_member ();
	  System.out.println(obj.i);
	  obj.i=100;
	  System.out.println(obj.i);
}
}
