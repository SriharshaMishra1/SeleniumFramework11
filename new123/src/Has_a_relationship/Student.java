package Has_a_relationship;

public class Student {
	String name;
	int id;
	int rollno;
	double mark;
	
	
	 Student(String n,int id,int R,double m)
	 {
		 this.name=n;
		 this.id=id;
		 this.rollno=R;
		 this.mark=m;
	 }
	public void notes(Pen p1)
	 {
		 p1.write();
	 }
}
