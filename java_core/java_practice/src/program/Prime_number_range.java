package program;

public class Prime_number_range {

	public static void main(String[] args) {
	

		for(int i=1;i<=100;i++)
		{	boolean flag =false;
		
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				    flag=true;	
				    break;
				    
				}
			
		}
			if(flag)
			{
				System.out.println("composit:"+i);
			}
			else
			{
				System.out.println("prime:" +i);
			}
		
	}

}
}