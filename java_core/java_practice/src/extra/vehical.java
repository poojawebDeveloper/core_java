package extra;

public class vehical {

	public static void main(String[] args) {


		int count=0;
		int total=0;
		int ptotal=0;
		
		for(int i=1;i<=20;i++)
		{
			count++;
			if(count%3==0)
			{
				//System.out.println("rejected:"+i);
				total++;
			}
			else
			{
				//System.out.println("parked;"+i);
				ptotal++;
			}
		}
		System.out.println("rejected:"+total);
		System.out.println("parked:"+ptotal);
	}

}
