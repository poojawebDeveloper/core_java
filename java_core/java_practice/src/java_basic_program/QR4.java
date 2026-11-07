package java_basic_program;

public class QR4 {

	public static void main(String[] args) {


		int arr[]= {1,2,3,5,6,7,8};
		
		for(int n=1;n<8;n++)
		{
			boolean missing=false;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==n)
				{
					missing=true;
					break;
				}
			}
			if(!missing)
			{
				System.out.println("missing number:"+n);
			}
		}
	}

}
