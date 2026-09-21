package Array;

public class dignonal_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr[][]=new int[2][2];
		
		arr[0][0]=1;
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=1;
		
		
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





