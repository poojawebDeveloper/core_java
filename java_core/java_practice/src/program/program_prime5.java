package program;

public class program_prime5 {

	public static void main(String[] args) {

    int num=1245;
    boolean flag=false;
    
    for(int i=2;i<num;i++)
    {
    	if(num%i==0)
    	{
    		flag=true;
    		break;
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
