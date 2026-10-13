package String;

public class charat {

	public static void main(String[] args) {

		String s ="hello word";
		
		
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		
		for(int i=s.length()-1;i>=0;i--)
		{
		    System.out.print(s.charAt(i)+" ");
		}
	}

}
