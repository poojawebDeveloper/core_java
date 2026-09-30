package class_object;

public class instance_mlargest {

	public static void main(String[] args) {

      largets l1=new largets();
      l1.findmax(900, 500,400);
      
      
	}

}

class largets
{
	
	public void findmax(int x,int y,int c)
	{
		if(x>y&&x>c)
		{
			System.out.println(x);
		}
		else if (y>c) 
		{
			System.out.println(y);
		}
		else
		{
	  System.out.println(c);
		}
		
	}
	
}
