package practice1;


public class fourth {

	public static void main(String[] args) {


		String s ="12jk56";
		
		boolean digit=false;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<'0'||s.charAt(i)>'9')
			{
				digit=true;
				break;
			}
		}
	
		if(!digit)
		{
			System.out.println("string digit");
		}
		else
		{
			System.out.println("string is not digit");
		}
	}	

}
