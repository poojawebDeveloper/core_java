package mock;

public class mock4stringrevrs {

	public static void main(String[] args) {


		String s ="java is easy";
		
		String arr[]=s.split(" ");
		
		StringBuilder result= new StringBuilder();
		
		for(int i=0;i<arr.length;i++)
		{
			StringBuilder s1= new StringBuilder(arr[i]);
		
		for(int j=s1.length()-1;j>=0;j--)
		{
			result.append(s1.charAt(j));
		}
		     result.append(" ");
		}
		System.out.println(result);
	}

}
