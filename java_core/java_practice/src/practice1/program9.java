package practice1;

public class program9 {

	public static void main(String[] args) {


		String s="welcome to mumbai";
		String s2="";
		
		for(int i=0;i<s.length();i++)
		{
			s2=s2+s.charAt(i);
			if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u') {
				System.out.print('*');
			}
			else
			{
				System.out.print(s2.charAt(i));
			}
		}
		
	}

}
