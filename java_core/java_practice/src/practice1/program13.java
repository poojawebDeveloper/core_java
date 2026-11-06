package practice1;

public class program13 {

	public static void main(String[] args) {


		String s="A man, a plan, a canal: Panama";
		

		String s2="";
		
		String arr[]=s.split(", ");
		
		
		for(int i=0;i<arr.length;i++)
		{
			 System.out.print(arr[i]);
			 s2=arr[i];
		}
		System.out.println(s2);
	}

}
