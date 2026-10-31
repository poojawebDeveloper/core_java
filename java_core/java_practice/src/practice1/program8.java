package practice1;

public class program8 {

	public static void main(String[] args) {


		String s="programming";
		
		int max=0;
		
		char result=' ';
		
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
			result=s.charAt(i);
		}
		}
		
		System.out.println(result);
		System.out.println(max);
	}

}


