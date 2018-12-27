package Basicjava;

public class Incremental_Decremental_Unary_operator {
     //    ++i=pre-increment
	//  i++=post-increment
	public static void main(String[] args) {
	int x=10;
	int y=5;
	int z=++x;
	int l=y++;
	/*System.out.println(x++);
	System.out.println(++y);
	System.out.println(++z);
	System.out.println(++l);
	System.out.println(l);
	
	int u=10;
	int o=u--;
	System.out.println(u);
	*/
	int a=5,b=6;
	int r=a++ + b++;
	int p=--a + --b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(r);
	System.out.println(p);
	
}
}
