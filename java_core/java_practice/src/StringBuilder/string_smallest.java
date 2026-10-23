package StringBuilder;

public class string_smallest {

	public static void main(String[] args) {
String s = "Java programming is interesting";
		
		String arr[]= s.split(" ");
		
		String smallest=arr[0];
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()<smallest.length())
			{
				smallest=arr[i];
			}
		}
		
		System.out.println(smallest);
	}

}
