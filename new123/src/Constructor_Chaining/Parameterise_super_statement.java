package Constructor_Chaining;

public class Parameterise_super_statement {
public static void main(String[] args) {
	Sample8 obj=new Sample8('k');
	
}
}
class Sample7
{
	Sample7(int x)
	{
		
		System.out.println("first constructor");
	}
}

class Sample8 extends Sample7
{
	Sample8(char ch)
	{
		super('8');
		System.out.println("2nd constructor");
	}
	
}