package String;

public class program {

	public static void main(String[] args) {


		String s="sucesss";
		
		int max=0;
		char ch=' ';
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				ch=s.charAt(i);
			}
		}
		
		System.out.println("maximum character+"+ch);
		System.out.println("occurence"+max);
		
	}

}
