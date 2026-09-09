package Array;

public class negative {

	public static void main(String[] args) {

    int arr []= {-10,-100,-2,-47,-500};
    int lowest=-600;
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]>lowest)
    	{
    		lowest=arr[i];
    	}
    }
    System.out.println(lowest);
	}

}
