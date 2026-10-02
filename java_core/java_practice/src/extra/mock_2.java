package extra;

public class mock_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int arr[][]= {
    		{78,56,79},
    		{97,89,23},
    		{52,86,63}
    };
    
    for(int i=0;i<arr.length;i++)
    {
    	boolean flag=false;
    	for(int j=0;j<arr.length;j++)
    	{
    		for(int k=2;k<arr[i][j];k++)
    		{
    			if(arr[i][j]%k==0)
    			{
    				 flag=true;
    				 break;
    			}
    		}
    		if(!flag)
    		{
    			System.out.println(arr[i][j]);
    			System.out.println(i+","+j);
    		}
    	}
    }

	}

}
