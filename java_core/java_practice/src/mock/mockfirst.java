package mock;

public class mockfirst {

	public static void main(String[] args) {


       int arr[]= {13,11,17,19,21,23,27,91};
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					flag=true;
					break;
			    }
			}
			if(!flag)
			{
				System.out.println("prime:"+arr[i]);
				count++;
			}
		}
		System.out.println(count);
	}

}
