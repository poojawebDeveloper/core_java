package loop;

public class Num_tabledowhile {

	public static void main(String[] args) {
      
		int num=1;
		int sum=0;
		do {
			if(num%3==0)
			{
			System.out.println(num);
			sum=sum+num;
			}
			num++;
		}while(num<=100);
		
		System.out.println(sum);
	}

}
