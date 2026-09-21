
package Array;

public class array_4 {

	public static void main(String[] args) {
		
	//int	arr[] = {15, 11, 8, 19, 4, 7, 25, 13};

 int arr[][]=new int [3][3];
 
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		 arr[i][j]=20;
	 }
 }

//System.out.println(arr[2][2]);
 
 for(int i=0;i<arr.length;i++)
 {
	 for(int j=0;j<3;j++)
	 {
	 System.out.print(arr[i][j]+" ");
	 }
	 System.out.println();
 }
}
}