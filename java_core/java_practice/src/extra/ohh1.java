package extra;

public class ohh1 {

	public static void main(String[] args) {

		//int cout=0;
for(int i=1;i<=100;i++)
{ 
	//System.out.println(i+"=");
	boolean flag=false;
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
		System.out.print(i+"=");
	}
	
for(int k=2;k<i;k++)
{
	
	if(i%k==0)
	{
		System.out.print(k+",");
	}
	
	}
System.out.println();
}

}
	}


