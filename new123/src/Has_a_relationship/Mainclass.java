package Has_a_relationship;

public class Mainclass {
	public static void main(String[] args) {
		Student obj=new Student("ram",6,9,5.8);
		obj.notes(new Pen("black"));
		
		Pen h=new Pen("green");
		
		obj.notes(h);
	}

}
