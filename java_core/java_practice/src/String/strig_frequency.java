package String;

public class strig_frequency {

	public static void main(String[] args) {


		String s2="banana";
		
		
		
		for(int i=0;i<s2.length();i++)
		{
			int count=0;
			for(int j=0;j<s2.length();j++)
			{
				if(s2.charAt(i)==s2.charAt(j))
				{
				    count++;
				}
		}
			System.out.println(s2.charAt(i)+"="+count);
		
	}

	}
	}
