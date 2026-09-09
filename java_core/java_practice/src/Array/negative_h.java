package Array;

public class negative_h {

	public static void main(String[] args) {

		int arr []= {-10,-100,-2,-47,-500};
	    int heights=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]<heights)
	    	{
	    		heights=arr[i];
	    	}
	    }
	    System.out.println(heights);
		}

	}

	


