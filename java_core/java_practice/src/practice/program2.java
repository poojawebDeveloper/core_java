package practice;

public class program2 {

	public static void main(String[] args) {


		String s="java is easy";
		
		String arr[]=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			String s2=arr[i];
			
			for(int j=s2.length()-1;j>=0;j--)
			{
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
