package Array_2D;

public class array_com_element {

	public static void main(String[] args) {

    int arr[]= {10,20,30,40,80};
    int arr1[]= {80,30,50,70};
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr1.length;j++)
    	{
    		if(arr[i]==arr1[j])
    		{
    			//count++;
    			System.out.println(arr[i]);
    		}
    		
    	}
    
    
    	}
	}

}
