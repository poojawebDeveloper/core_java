package StringBuilder;

public class program1 {

	public static void main(String[] args) {


		String s="java123java";
		
		StringBuilder s1= new StringBuilder(s);
		
	for(int i=0;i<s1.length();i++)
	{
		if(s.charAt(i)=='j'||s.charAt(i)=='a'||s.charAt(i)=='v'||s.charAt(i)=='a')
		{
			continue;
		}
		else
		{
			System.out.print(s1.charAt(i));
		}
	}
		//System.out.println(s1);
	}

}
