package practice;

public class Forloopodd_num {

	public static void main(String[] args) {
          int counter=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				counter++;
			}
		}
		System.out.println(counter);
	}

}
