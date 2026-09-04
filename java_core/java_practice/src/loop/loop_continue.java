package loop;

public class loop_continue {

	public static void main(String[] args) {
     
		for(int i=1;i<=20;i++)
		{
			if(i==8)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
