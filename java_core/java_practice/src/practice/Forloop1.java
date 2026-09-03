package practice;

public class Forloop1 {

	public static void main(String[] args) {
       int num=13;
       boolean flag=false;
		for(int i=2;i<12;i++)
		{
			if(num%i==0)
			{
				 flag=true;
			}
		}
			
			if(!flag)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("composite");
			}
			
			
			
		
	}

}
