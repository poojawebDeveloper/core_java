package StringBuilder;

public class program5 {

	public static void main(String[] args) {

		String s="banana";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
			    continue;
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}

	}

}
