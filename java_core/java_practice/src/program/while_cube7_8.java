package program;

public class while_cube7_8 {

	public static void main(String[] args) {

		int num=1;
		int cube=0;
		while(num<=100)
		{
			if(num%7==0&&num%8==0)
			{
				System.out.println(num);
				cube=num*num*num;
			}
			
			num++;
		}
		System.out.println("cube:"+cube);
	}

}
