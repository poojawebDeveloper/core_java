package String;

public class tochararray {

	public static void main(String[] args) {


		String s="welcome";
		
		char[] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
	}

}
