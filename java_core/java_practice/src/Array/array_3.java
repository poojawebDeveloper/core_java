package Array;

public class array_3 {

	public static void main(String[] args) {

    int arr [][]=new int [3][3];
    
    for(int i=0;i<3;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		arr[i][j]=10;
    	}
    }
    
    System.out.println(arr[1][2]);
   
    
	}

}
