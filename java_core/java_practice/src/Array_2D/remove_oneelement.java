package Array_2D;

public class remove_oneelement {

	public static void main(String[] args) {

    int arr[]= {10,20,30,40,50};
    
    
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]==30)
    	{
    		continue;
    	}
    	System.out.print(arr[i]+" ");
    }
	}

}
