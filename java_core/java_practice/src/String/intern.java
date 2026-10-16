package String;

public class intern {

	public static void main(String[] args) {

  
		String s1="pune";
		
		String s2="pune";
		
		String s3= new String("pune");
		
		System.out.println(s1.intern()==s3.intern());
		
		
	}

	
}
