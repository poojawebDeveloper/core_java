package Array;

public class digonal_array1 {

	public static void main(String[] args) {

int arr[][]=new int[2][2];
		
		arr[0][0]=7;
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=3;
		
		
		boolean zero_check=false;
		boolean nonzero_check=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i!=j)
				{
					if(arr[i][j]==0)
					{
						zero_check=true;
						break;
					}
				}
				
					else
					{

					if(arr[i][j]!=0)
					{
					nonzero_check=true;
						break;
					}
					
						}	
					}
			}	
		
				
		
			if(zero_check&&nonzero_check)
			{
				System.out.println("digonal matrix");
			}
			else
			{
				System.out.println("normal matrix");
			}
		}
	}





