package Method;

public class Method_Overloading {

	
	public static void deepu()
	{
		System.out.println("non argumented");
		int res=0+0;
		System.out.println("non argumented"+res);
	}
	public static void deepu(int i,int j)
	{
		i=30;
		j=50;
		int res=(i+j);
		System.out.println("int value is"+res);
	}	
	public static void deepu(double a,double b)
	{
		  a=2.6;
		  b=7.4;
		  double res=(a+b);
		  System.out.println("double and double value is"+(a+b));
	}
	
		public static void deepu(int q,double w)
		{
			q=2;
			w=3.7;
			double res=(q+w);
			System.out.println("int and double value is"+res);
		} 
		public static void deepu(double e,int r)
		{
			e=2.8;
			r=2;
			double res=(e+r);
			System.out.println("double and int value is"+res);
		}
		
		public static void main(String[] args) {
			
			deepu();
			deepu(2,3);
			deepu(2.2,3.3);
			deepu(2,3.3);
			deepu(3.3,4);
		}
	}

