package Constructor_Chaining;

public class This_Sample1 {

		 This_Sample1()
		{
			 this(12);
			System.out.println("non arg constructor");
		}
	
		 This_Sample1(int i)
		{
		    this('a');
			System.out.println("int argumented constructor");
		}
		 This_Sample1(char ch)
		 {
			//this(12);
			 System.out.println("char argumented constructor");
		 }
	}

