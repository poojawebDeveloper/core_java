package practice1;

public class progra13 {

	public static void main(String[] args) {


		String s="car,both,came,cat,lake,cammera";
		
		String arr[]=s.split(",");
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			String s2=arr[j];
			if(s2.startsWith("ca"))
			{
				count++;
				//System.out.println(s.charAt(i));
			}
		}
		System.out.println(count);
	}

}

