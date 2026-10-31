package practice1;

public class program5 {

	public static void main(String[] args) {
	
			String s= "programming";
			
			String s2="";
			
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(s2.indexOf(ch)==-1)
				{
					s2=s2+ch;
				}
			}
			System.out.println(s2);
	}

}
