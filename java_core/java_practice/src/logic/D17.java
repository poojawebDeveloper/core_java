package logic;

public class D17 {

	public static void main(String[] args) {


		int arr[]= {2,1,3,4,1};
		int arr1[]=new int[arr.length];
		 int k=5;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]+arr[j]<=k)
				 {
					 System.out.print(arr[i]+","+arr[j]+" ");
					 //arr1[i]=arr[i];
					 //arr1[j]=arr[j];
				 }
			 }
		 }
//		 for(int i=0;i<arr1.length;i++)
//		 {
//			 System.out.print(arr1[i]+",");
//		 }
//		 System.out.println();
//		 System.out.println(arr1.length);
	}

}
