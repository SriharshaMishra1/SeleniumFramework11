package Oops;

public class static_nonstatic_combo_with_STUDENT_Class {
String name;
int id;
double mark;
static String college="Giit";

public static void main(String[] args) {
	
	static_nonstatic_combo_with_STUDENT_Class ref1= new static_nonstatic_combo_with_STUDENT_Class();
	static_nonstatic_combo_with_STUDENT_Class ref2= new static_nonstatic_combo_with_STUDENT_Class();
	
	System.out.println("..........................");
	ref1.name="ram";
	ref1.id=12;
	ref1.mark=678.9;
	System.out.println("name is"+ref1.name);
	System.out.println("name is"+ref1.id);
	System.out.println("name is"+ref1.mark);
	System.out.println("college name is"+static_nonstatic_combo_with_STUDENT_Class.college);
	System.out.println("..........................");
	ref2.name="dam";
	ref2.id=100;
	ref2.mark=354.67;
	System.out.println("name is"+ref2.name);
	System.out.println("name is"+ref2.id);
	System.out.println("name is"+ref2.mark);
	System.out.println("college name is"+static_nonstatic_combo_with_STUDENT_Class.college);
	
	
	
	
           
           

}
}