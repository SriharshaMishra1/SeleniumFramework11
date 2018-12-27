package Basicjava;
class Iv {
int id=4;
double mark;
char grade;
/*
Iv()// using constructor
{ 
	id=4;
	mark=50;
	grade='b';
	System.out.println("instance variable is");
}
*/
void deepu()
{
	System.out.println("id value is"+id);
	System.out.println("mark is"+mark);
	System.out.println("grade is"+grade);
}
}
public class Sample
{
public static void main(String[] args) 
{
	Iv obj	=new Iv();	
	obj.deepu();
}
}



