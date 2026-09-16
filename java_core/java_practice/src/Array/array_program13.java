package Array;

public class array_program13 {

	public static void main(String[] args) {
	
	int	arr[] = {45, 12, 78, 3, 56, 99, 23, 1, 67};
	
	int heights=32768;
	int slowest=32768;
	int tlowest=32768;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<heights)
		{ 
			slowest=heights;
			heights=arr[i];
		}
		if(arr[i]!=heights&&arr[i]<slowest)
		{
			tlowest=slowest;
			slowest=arr[i];
		}
		if(arr[i]!=heights&&arr[i]!=slowest&&arr[i]<tlowest)
		{
			tlowest=arr[i];
		}
	}
 
	System.out.println("first lowest:"+heights);
	System.out.println("second lowest:"+slowest);
	System.out.println("third lowest:"+tlowest);


    
	}

}
