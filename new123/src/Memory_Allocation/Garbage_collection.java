package Memory_Allocation;

public class Garbage_collection {
	int i=10;     // using gc and exit function
 public static int  x=20;
	public static void main(String[] args) {
		Garbage_collection obj=new Garbage_collection();
		System.out.println("instance variable is"+obj.i);
		System.out.println("i value is"+ obj.i);
		System.gc();
		System.exit(0);
		System.out.println("d value is"+x);
		System.out.println("d value is"+ Garbage_collection.x);
	}

}

