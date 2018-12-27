package Method;

public class Area_of_circle_calling_Method {
	// a=pi*r^2
	public static void gadhuni(int d,double r)
	{
		 d=3;
		r=2.5;
		double radius=d*(r*r);
		System.out.println("area of a circle is"+" "+radius);
		
	}
public static void main(String[] args) {
	gadhuni(2,6.7);
}
}
