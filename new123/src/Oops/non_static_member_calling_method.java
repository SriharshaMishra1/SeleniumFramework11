package Oops;

public class non_static_member_calling_method {
	int i=5;
	public void deepu()
	{
		System.out.println("faculty");
	}

	public static void main(String[] args) {
		
		non_static_member_calling_method obj=new non_static_member_calling_method();
		obj.deepu();
		System.out.println("i value is"+ new non_static_member_calling_method().i);
	}
}
