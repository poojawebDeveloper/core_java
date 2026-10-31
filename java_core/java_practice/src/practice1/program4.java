package practice1;

public class program4 {

	public static void main(String[] args) {


		String arr[] = {"java", "python", "java", "sql", "python", "c"};
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 System.out.println(arr[i]);
				 }
			 }
		 }
	}

}
