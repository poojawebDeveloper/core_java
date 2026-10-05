package Array_2D;

public class addition_2darray {

	public static void main(String[] args) {

    int arr [] []= {
    		{1,2},
    		{3,4},
    		
    };
    int arr1 [][]= {
    		{5,6},
    		{7,8}
    };
    int arr3[][]=new int[2][2];
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		
    	}
    }
    for(int i=0;i<arr1.length;i++)
    {
    	for(int j=0;j<arr1[i].length;j++)
    	{
    		arr3[i][j]=arr[i][j]+arr1[i][j];
    	
    	System.out.print(arr3[i][j]+" ");
    }
    	System.out.println();
    	}
	
	}

}
