package loop;

public class dowhileeven_num_square {

	public static void main(String[] args) {

		int num=1;
		//int sum=0;
		
		do
		{
			if(num%2==0)
			{
				System.out.println(num);
				System.out.println(num*num);
				
			}
			num++;
		}while(num<=100);
	}

}
