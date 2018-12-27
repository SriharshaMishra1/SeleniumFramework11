package Constructor;

public class this_method {
	
	int k=2;
	double l=6.9;
  this_method(int k,double l)
	 {
		 this.k=k;
		 this.l=l;
		 System.out.println(this);
	 }
public static void main(String[] args) {
	 this_method obj=new  this_method(7,7.8);
	 System.out.println(obj);
	System.out.println(" k value is"+ obj.k);
	System.out.println(" l value is"+ obj.l);
}
}
