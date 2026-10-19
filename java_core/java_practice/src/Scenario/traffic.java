package Scenario;

public class traffic {

	public static void main(String[] args) {
		
		int count=0;
		int stop=0;
		int vip=0;
		int normal=0;
		for(int i=1;i<=30;i++)
		{
			count++;
			if(count%3==0)
			{
				//System.out.println("stop"+i);
				stop++;
			}
			else if(count%5==0)
			{
				//System.out.println("vippass"+i);
				vip++;
			}
			else
			{
				//System.out.println(i);
				normal++;
			}
		}
		
		System.out.println("stop:"+stop);
		System.out.println("vip"+vip);
		System.out.println("normal:"+normal);
	}

}
