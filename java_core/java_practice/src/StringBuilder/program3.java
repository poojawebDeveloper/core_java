package StringBuilder;

public class program3 {

	public static void main(String[] args) {


		String s="madan";
		
		StringBuilder s1=new StringBuilder(s);
		
		s1.reverse();
		
		if(s1.toString().equals(s))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}
